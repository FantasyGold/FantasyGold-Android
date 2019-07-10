package org.fantasygold.wallet.ui.fragment.subscribe_tokens_fragment;

import org.fantasygold.wallet.model.contract.Token;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface SubscribeTokensView extends BaseFragmentView {

    void setTokenList(List<Token> tokenList);

    void setPlaceHolder();
}
