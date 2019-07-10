package org.fantasygold.wallet.ui.fragment.language_fragment;

import android.content.Context;
import android.util.Pair;

import org.fantasygold.wallet.datastorage.FantasyGoldSettingSharedPreference;
import org.fantasygold.wallet.datastorage.FantasyGoldSharedPreference;
import org.fantasygold.wallet.datastorage.listeners.LanguageChangeListener;

import java.util.ArrayList;
import java.util.List;

class LanguageInteractorImpl implements LanguageInteractor {

    private Context mContext;
    private List<Pair<String, String>> mLanguagesList;

    LanguageInteractorImpl(Context context) {
        mContext = context;
        mLanguagesList = new ArrayList<>();
        mLanguagesList.add(new Pair<>("us", "English"));
        mLanguagesList.add(new Pair<>("zh", "Chinese"));
    }

    @Override
    public String getLanguage() {
        return FantasyGoldSettingSharedPreference.getInstance().getLanguage(mContext);
    }

    @Override
    public void setLanguage(String language) {
        FantasyGoldSettingSharedPreference.getInstance().saveLanguage(mContext, language);
    }

    @Override
    public List<Pair<String, String>> getLanguagesList() {
        return mLanguagesList;
    }

    @Override
    public void removeLanguageListener(LanguageChangeListener languageChangeListener) {
        FantasyGoldSettingSharedPreference.getInstance().removeLanguageListener(languageChangeListener);
    }

    @Override
    public void addLanguageListener(LanguageChangeListener languageChangeListener) {
        FantasyGoldSettingSharedPreference.getInstance().addLanguageListener(languageChangeListener);
    }
}