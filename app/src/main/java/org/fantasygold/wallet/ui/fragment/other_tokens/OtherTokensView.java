package org.fantasygold.wallet.ui.fragment.other_tokens;

import org.fantasygold.wallet.model.contract.Token;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface OtherTokensView extends BaseFragmentView {
    void setTokensData(List<Token> tokensData);

    void updateTokensData(List<Token> tokensData);
}
