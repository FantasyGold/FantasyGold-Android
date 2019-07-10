package org.fantasygold.wallet.ui.fragment.contract_confirm_fragment;

import org.fantasygold.wallet.FantasyGoldApplication;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentView;

public interface ContractConfirmView extends BaseFragmentView {

    void makeToast(String s);

    FantasyGoldApplication getApplication();

    String getContractName();

    void updateFee(double minFee, double maxFee);

    void updateGasPrice(int minGasPrice, int maxGasPrice);

    void updateGasLimit(int minGasLimit, int maxGasLimit);

    void closeFragments();
}
