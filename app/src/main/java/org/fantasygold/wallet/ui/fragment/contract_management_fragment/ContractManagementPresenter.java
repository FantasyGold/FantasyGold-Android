package org.fantasygold.wallet.ui.fragment.contract_management_fragment;

import org.fantasygold.wallet.model.contract.Contract;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentPresenter;

public interface ContractManagementPresenter extends BaseFragmentPresenter {
    Contract getContractByAddress(String contractAddress);
}
