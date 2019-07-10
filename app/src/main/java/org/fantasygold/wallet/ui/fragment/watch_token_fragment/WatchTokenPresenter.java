package org.fantasygold.wallet.ui.fragment.watch_token_fragment;

import org.fantasygold.wallet.model.ContractTemplate;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentPresenter;

public interface WatchTokenPresenter extends BaseFragmentPresenter {

    void onOkClick(String name, String address);

    void onContractAddressEntered(String contractAddress);

}
