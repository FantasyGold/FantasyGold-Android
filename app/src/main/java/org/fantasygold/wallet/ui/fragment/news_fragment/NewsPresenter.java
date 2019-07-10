package org.fantasygold.wallet.ui.fragment.news_fragment;

import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentPresenter;

public interface NewsPresenter extends BaseFragmentPresenter {
    void onRefresh();

    void onNetworkStateChanged(boolean networkConnectedFlag);
}
