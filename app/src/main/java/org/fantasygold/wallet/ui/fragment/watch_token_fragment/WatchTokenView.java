package org.fantasygold.wallet.ui.fragment.watch_token_fragment;

import org.fantasygold.wallet.ui.base.base_fragment.BaseFragment;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentView;

public interface WatchTokenView extends BaseFragmentView {

    void subscribeTokenBalanceChanges(String contractAddress);

    BaseFragment.AlertDialogCallBack getAlertCallback();

    void setContractName(String contractName);

}
