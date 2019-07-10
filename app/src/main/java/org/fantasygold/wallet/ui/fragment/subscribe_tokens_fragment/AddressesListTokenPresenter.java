package org.fantasygold.wallet.ui.fragment.subscribe_tokens_fragment;

import org.fantasygold.wallet.model.contract.Token;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentPresenter;

import java.util.List;

public interface AddressesListTokenPresenter extends BaseFragmentPresenter {
    void onSubscribeChanged(Token token);
}
