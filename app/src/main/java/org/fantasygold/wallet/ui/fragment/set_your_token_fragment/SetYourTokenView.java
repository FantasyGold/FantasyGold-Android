package org.fantasygold.wallet.ui.fragment.set_your_token_fragment;

import org.fantasygold.wallet.model.contract.ContractMethodParameter;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface SetYourTokenView extends BaseFragmentView {
    void onContractConstructorPrepared(List<ContractMethodParameter> params);
}
