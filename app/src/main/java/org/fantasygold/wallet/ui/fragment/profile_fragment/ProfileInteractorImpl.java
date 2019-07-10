package org.fantasygold.wallet.ui.fragment.profile_fragment;

import android.content.Context;

import org.fantasygold.wallet.datastorage.KeyStorage;
import org.fantasygold.wallet.datastorage.FantasyGoldSettingSharedPreference;
import org.fantasygold.wallet.datastorage.FantasyGoldSharedPreference;
import org.fantasygold.wallet.datastorage.TinyDB;
import org.fantasygold.wallet.datastorage.listeners.LanguageChangeListener;

import io.realm.Realm;

class ProfileInteractorImpl implements ProfileInteractor {

    private Context mContext;
    private Realm mRealm;

    ProfileInteractorImpl(Context context, Realm realm) {
        mContext = context;
        mRealm = realm;
    }

    @Override
    public void clearWallet() {
        FantasyGoldSharedPreference.getInstance().clear(mContext);
        KeyStorage.getInstance().clearKeyStorage();

        mRealm.removeAllChangeListeners();
        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.deleteAll();
            }
        });
        TinyDB db = new TinyDB(mContext);
        db.clearTokenList();
        db.clearContractList();
        db.clearTemplateList();
    }

    @Override
    public void setupLanguageChangeListener(LanguageChangeListener listener) {
        FantasyGoldSettingSharedPreference.getInstance().addLanguageListener(listener);
    }

    @Override
    public void removeLanguageListener(LanguageChangeListener listener) {
        FantasyGoldSettingSharedPreference.getInstance().removeLanguageListener(listener);
    }

    @Override
    public boolean isTouchIdEnable() {
        return FantasyGoldSharedPreference.getInstance().isTouchIdEnable(mContext);
    }

    @Override
    public void saveTouchIdEnable(boolean isChecked) {
        FantasyGoldSharedPreference.getInstance().saveTouchIdEnable(mContext, isChecked);
    }
}
