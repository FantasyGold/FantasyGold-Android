package org.fantasygold.wallet.ui.fragment.other_tokens.dark;

import org.fantasygold.wallet.R;
import org.fantasygold.wallet.model.contract.Contract;
import org.fantasygold.wallet.model.contract.Token;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragment;
import org.fantasygold.wallet.ui.fragment.other_tokens.OtherTokensFragment;
import org.fantasygold.wallet.ui.fragment.token_fragment.TokenFragment;

import java.util.List;

public class OtherTokensFragmentDark extends OtherTokensFragment {

    @Override
    protected int getLayout() {
        return R.layout.fragment_other_tokens;
    }

    @Override
    public void setTokensData(List<Token> tokensData) {
        tokensList.setAdapter(new TokensAdapterDark(tokensData, this, this));
    }

    @Override
    public void onTokenClick(int adapterPosition) {
        Token token = (Token) ((TokensAdapterDark) tokensList.getAdapter()).get(adapterPosition);
        if (token.getSupportFlag()) {
            BaseFragment tokenFragment = TokenFragment.newInstance(getContext(), token);
            openFragment(tokenFragment);
        } else {
            setAlertDialog(getString(R.string.token_unsupported_reason), getString(R.string.ok), PopUpType.error);
        }

    }
}
