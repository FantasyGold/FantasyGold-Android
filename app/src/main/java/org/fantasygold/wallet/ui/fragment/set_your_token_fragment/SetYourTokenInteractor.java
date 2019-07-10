package org.fantasygold.wallet.ui.fragment.set_your_token_fragment;

import org.fantasygold.wallet.model.contract.ContractMethod;

public interface SetYourTokenInteractor {
    ContractMethod getContractConstructor(String uiid);
}
