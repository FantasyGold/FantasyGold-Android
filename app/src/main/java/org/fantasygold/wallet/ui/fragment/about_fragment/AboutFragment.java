package org.fantasygold.wallet.ui.fragment.about_fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import org.fantasygold.wallet.model.Version;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragment;
import org.fantasygold.wallet.ui.fragment_factory.Factory;
import org.fantasygold.wallet.utils.FontTextView;

import butterknife.BindView;
import butterknife.OnClick;

public abstract class AboutFragment extends BaseFragment implements AboutView {

    AboutPresenter mAboutFragmentPresenter;

    @OnClick({org.fantasygold.wallet.R.id.ibt_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case org.fantasygold.wallet.R.id.ibt_back:
                getActivity().onBackPressed();
                break;
        }
    }

    @BindView(org.fantasygold.wallet.R.id.tv_fantasygold_version)
    FontTextView mTextViewFantasyGoldVersion;

    public static BaseFragment newInstance(Context context) {
        Bundle args = new Bundle();
        BaseFragment fragment = Factory.instantiateFragment(context, AboutFragment.class);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void updateVersion(Version version) {
        String footer = getString(org.fantasygold.wallet.R.string._2019_fantasygold_n_testnet_version) + "Version " + version.getVersionName() + "(" + String.valueOf(version.getVersionCode()) + ")";
        mTextViewFantasyGoldVersion.setText(footer);
    }

    @Override
    protected void createPresenter() {
        mAboutFragmentPresenter = new AboutPresenterImpl(this, new AboutInteractorImpl(getContext()));
    }

    @Override
    protected AboutPresenter getPresenter() {
        return mAboutFragmentPresenter;
    }
}