package org.fantasygold.wallet.ui.fragment.contract_confirm_fragment;

import android.content.Context;

import org.bitcoinj.script.Script;
import org.fantasygold.wallet.dataprovider.rest_api.fantasygold.FantasyGoldService;
import org.fantasygold.wallet.datastorage.KeyStorage;
import org.fantasygold.wallet.datastorage.FantasyGoldSettingSharedPreference;
import org.fantasygold.wallet.datastorage.FantasyGoldSharedPreference;
import org.fantasygold.wallet.datastorage.TinyDB;
import org.fantasygold.wallet.model.ContractTemplate;
import org.fantasygold.wallet.model.TransactionHashWithSender;
import org.fantasygold.wallet.model.contract.Contract;
import org.fantasygold.wallet.model.contract.ContractCreationStatus;
import org.fantasygold.wallet.model.contract.ContractMethodParameter;
import org.fantasygold.wallet.model.contract.Token;
import org.fantasygold.wallet.model.gson.SendRawTransactionRequest;
import org.fantasygold.wallet.model.gson.SendRawTransactionResponse;
import org.fantasygold.wallet.model.gson.UnspentOutput;
import org.fantasygold.wallet.utils.ContractBuilder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import rx.Observable;

class ContractConfirmInteractorImpl implements ContractConfirmInteractor {

    Context mContext;

    ContractConfirmInteractorImpl(Context context) {
        mContext = context;
    }

    @Override
    public Observable<String> createAbiConstructParams(List<ContractMethodParameter> contractMethodParameterList, String uiid) {
        ContractBuilder contractBuilder = new ContractBuilder();
        return contractBuilder.createAbiConstructParams(contractMethodParameterList, uiid, mContext);
    }

    @Override
    public Observable<List<UnspentOutput>> getUnspentOutputsForSeveralAddresses() {
        return FantasyGoldService.newInstance().getUnspentOutputsForSeveralAddresses(KeyStorage.getInstance().getAddresses());
    }

    @Override
    public Observable<SendRawTransactionResponse> sendRawTransaction(SendRawTransactionRequest sendRawTransactionRequest) {
        return FantasyGoldService.newInstance().sendRawTransaction(sendRawTransactionRequest);
    }

    @Override
    public void saveContract(String txid, String contractTemplateUiid, String contractName, String senderAddress) {
        TinyDB tinyDB = new TinyDB(mContext);
        ArrayList<String> unconfirmedTokenTxHashList = tinyDB.getUnconfirmedContractTxHasList();
        unconfirmedTokenTxHashList.add(txid);
        tinyDB.putUnconfirmedContractTxHashList(unconfirmedTokenTxHashList);
        for (ContractTemplate contractTemplate : tinyDB.getContractTemplateList()) {
            if (contractTemplate.getUuid().equals(contractTemplateUiid)) {
                if (contractTemplate.getContractType().equals("token") || contractTemplate.getContractType().equals("crowdsale")) {
                    saveToken(tinyDB, txid, contractTemplateUiid, contractName, senderAddress);
                } else {
                    saveContract(tinyDB, txid, contractTemplateUiid, contractName, senderAddress);
                }
            }
        }
    }

    private void saveToken(TinyDB tinyDB, String txid, String contractTemplateUiid, String contractName, String senderAddress) {
        Token token = new Token(ContractBuilder.generateContractAddress(txid), contractTemplateUiid, ContractCreationStatus.Unconfirmed, null, senderAddress, contractName);
        List<Token> tokenList = tinyDB.getTokenList();
        tokenList.add(token);
        tinyDB.putTokenList(tokenList);
    }

    private void saveContract(TinyDB tinyDB, String txid, String contractTemplateUiid, String contractName, String senderAddress) {
        Contract contract = new Contract(ContractBuilder.generateContractAddress(txid), contractTemplateUiid, ContractCreationStatus.Unconfirmed, null, senderAddress, contractName);
        List<Contract> contractList = tinyDB.getContractListWithoutToken();
        contractList.add(contract);
        tinyDB.putContractListWithoutToken(contractList);
    }

    @Override
    public TransactionHashWithSender createTransactionHash(String abiParams, List<UnspentOutput> unspentOutputs, int gasLimit, int gasPrice, String fee, String passphrase) {
        ContractBuilder contractBuilder = new ContractBuilder();
        Script script = contractBuilder.createConstructScript(abiParams, gasLimit, gasPrice);
        return contractBuilder.createTransactionHashForCreateContract(script, unspentOutputs, gasLimit, gasPrice, getFeePerKb(), fee, mContext, passphrase);
    }

    @Override
    public BigDecimal getFeePerKb() {
        FantasyGoldSettingSharedPreference fantasygoldSettingSharedPreference = FantasyGoldSettingSharedPreference.getInstance();
        return new BigDecimal(fantasygoldSettingSharedPreference.getFeePerKb(mContext));
    }

    @Override
    public int getMinGasPrice() {
        return FantasyGoldSharedPreference.getInstance().getMinGasPrice(mContext);
    }
}
