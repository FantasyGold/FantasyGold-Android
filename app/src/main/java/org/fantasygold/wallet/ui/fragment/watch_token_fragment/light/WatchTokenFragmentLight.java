package org.fantasygold.wallet.ui.fragment.watch_token_fragment.light;

import org.fantasygold.wallet.model.ContractTemplate;
import org.fantasygold.wallet.ui.fragment.watch_contract_fragment.OnTemplateClickListener;
import org.fantasygold.wallet.ui.fragment.watch_contract_fragment.TemplatesAdapter;
import org.fantasygold.wallet.ui.fragment.watch_contract_fragment.WatchContractFragment;
import org.fantasygold.wallet.ui.fragment.watch_token_fragment.WatchTokenFragment;
import org.fantasygold.wallet.utils.FontManager;

import java.util.List;

public class WatchTokenFragmentLight extends WatchTokenFragment {

    @Override
    protected int getLayout() {
        return org.fantasygold.wallet.R.layout.fragment_watch_token_light;
    }

    @Override
    public void initializeViews() {
        super.initializeViews();
        mEditTextContractName.setTypeface(FontManager.getInstance().getFont(getResources().getString(org.fantasygold.wallet.R.string.proximaNovaSemibold)));
        mEditTextContractAddress.setTypeface(FontManager.getInstance().getFont(getResources().getString(org.fantasygold.wallet.R.string.proximaNovaSemibold)));
    }

}
