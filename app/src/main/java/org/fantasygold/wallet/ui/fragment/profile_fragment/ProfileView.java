package org.fantasygold.wallet.ui.fragment.profile_fragment;

import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentView;

import io.realm.Realm;

public interface ProfileView extends BaseFragmentView {
    void startDialogFragmentForResult();

    void resetText();

    boolean checkAvailabilityTouchId();

    Realm getRealm();
}
