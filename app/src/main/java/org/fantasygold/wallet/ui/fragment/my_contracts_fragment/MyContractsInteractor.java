package org.fantasygold.wallet.ui.fragment.my_contracts_fragment;

import org.fantasygold.wallet.model.contract.Contract;
import org.fantasygold.wallet.model.contract.Token;
import org.fantasygold.wallet.model.gson.ExistContractResponse;

import java.util.List;

import rx.Observable;

public interface MyContractsInteractor {
    List<Contract> getContracts();

    List<Contract> getContractsWithoutTokens();

    List<Token> getTokens();

    void setContractWithoutTokens(List<Contract> contracts);

    void setTokens(List<Token> tokens);

    boolean isShowWizard();

    void setShowWizard(boolean isShow);

    Observable<ExistContractResponse> isContractExist(String contractAddress);
}
