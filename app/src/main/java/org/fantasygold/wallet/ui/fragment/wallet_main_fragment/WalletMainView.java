package org.fantasygold.wallet.ui.fragment.wallet_main_fragment;

import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentView;

public interface WalletMainView extends BaseFragmentView {
    void showOtherTokens(boolean isShow);

    void showPageIndicator();

    void hidePageIndicator();
}
