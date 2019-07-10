package org.fantasygold.wallet.ui.fragment.backup_wallet_fragment;

import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentPresenter;

interface BackUpWalletPresenter extends BaseFragmentPresenter {
    void onCopyBrainCodeClick();

    void onContinueClick();

    void onShareClick();
}
