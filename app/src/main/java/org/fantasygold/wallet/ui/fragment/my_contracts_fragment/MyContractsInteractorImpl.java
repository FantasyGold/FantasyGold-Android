package org.fantasygold.wallet.ui.fragment.my_contracts_fragment;

import android.content.Context;

import org.fantasygold.wallet.dataprovider.rest_api.fantasygold.FantasyGoldService;
import org.fantasygold.wallet.datastorage.FantasyGoldSettingSharedPreference;
import org.fantasygold.wallet.datastorage.TinyDB;
import org.fantasygold.wallet.model.contract.Contract;
import org.fantasygold.wallet.model.contract.Token;
import org.fantasygold.wallet.model.gson.ExistContractResponse;

import java.lang.ref.WeakReference;
import java.util.List;

import rx.Observable;

public class MyContractsInteractorImpl implements MyContractsInteractor {
    private WeakReference<Context> mContext;

    public MyContractsInteractorImpl(Context context) {
        mContext = new WeakReference<>(context);
    }

    @Override
    public List<Contract> getContracts() {
        TinyDB tinyDB = new TinyDB(mContext.get());
        return tinyDB.getContractList();
    }

    @Override
    public List<Contract> getContractsWithoutTokens() {
        TinyDB tinyDB = new TinyDB(mContext.get());
        return tinyDB.getContractListWithoutToken();
    }

    @Override
    public List<Token> getTokens() {
        TinyDB tinyDB = new TinyDB(mContext.get());
        return tinyDB.getTokenList();
    }

    @Override
    public void setContractWithoutTokens(List<Contract> contracts) {
        TinyDB tinyDB = new TinyDB(mContext.get());
        tinyDB.putContractListWithoutToken(contracts);
    }

    @Override
    public void setTokens(List<Token> tokens) {
        TinyDB tinyDB = new TinyDB(mContext.get());
        tinyDB.putTokenList(tokens);
    }

    @Override
    public boolean isShowWizard() {
        FantasyGoldSettingSharedPreference fantasygoldSettingSharedPreference = FantasyGoldSettingSharedPreference.getInstance();
        return fantasygoldSettingSharedPreference.getShowContractsDeleteUnsubscribeWizard(mContext.get());
    }

    @Override
    public void setShowWizard(boolean isShow) {
        FantasyGoldSettingSharedPreference fantasygoldSettingSharedPreference = FantasyGoldSettingSharedPreference.getInstance();
        fantasygoldSettingSharedPreference.setShowContractsDeleteUnsubscribeWizard(mContext.get(), isShow);
    }

    @Override
    public Observable<ExistContractResponse> isContractExist(String contractAddress) {
        return FantasyGoldService.newInstance().isContractExist(contractAddress);
    }
}
