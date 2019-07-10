package org.fantasygold.wallet.ui.fragment.watch_contract_fragment;

import org.fantasygold.wallet.model.ContractTemplate;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentPresenter;

public interface WatchContractPresenter extends BaseFragmentPresenter {
    void onOkClick(String name, String address, String ABIInterface);

    void onTemplateClick(ContractTemplate contractTemplate);
}
