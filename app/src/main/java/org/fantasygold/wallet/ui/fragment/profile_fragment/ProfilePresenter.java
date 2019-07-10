package org.fantasygold.wallet.ui.fragment.profile_fragment;

import org.fantasygold.wallet.datastorage.listeners.LanguageChangeListener;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentPresenter;

import java.util.List;

public interface ProfilePresenter extends BaseFragmentPresenter {
    void onTouchIdSwitched(boolean isChecked);

    void clearWallet();

    List<SettingObject> getSettingsData();

    void setupLanguageChangeListener(LanguageChangeListener listener);

    void removeLanguageListener(LanguageChangeListener listener);
}
