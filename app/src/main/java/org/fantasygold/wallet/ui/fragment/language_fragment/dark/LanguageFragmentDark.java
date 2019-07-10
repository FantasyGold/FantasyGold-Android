package org.fantasygold.wallet.ui.fragment.language_fragment.dark;

import android.util.Pair;

import org.fantasygold.wallet.ui.fragment.language_fragment.LanguageFragment;

import java.util.List;

public class LanguageFragmentDark extends LanguageFragment {
    @Override
    protected int getLayout() {
        return org.fantasygold.wallet.R.layout.fragment_language;
    }

    @Override
    public void setUpLanguagesList(List<Pair<String, String>> languagesList) {
        mLanguagesList = languagesList;
        mLanguageAdapter = new LanguageAdapterDark(languagesList, this);
        mRecyclerView.setAdapter(mLanguageAdapter);
    }
}
