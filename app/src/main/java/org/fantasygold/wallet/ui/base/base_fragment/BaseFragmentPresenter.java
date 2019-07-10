package org.fantasygold.wallet.ui.base.base_fragment;

import org.fantasygold.wallet.ui.base.base_activity.BasePresenter;

public interface BaseFragmentPresenter extends BasePresenter {
    void onViewCreated();

    void onDestroyView();
}
