package org.fantasygold.wallet.ui.fragment.contract_function_fragment.contract_default_function_fragment;

import org.fantasygold.wallet.model.AddressWithBalance;
import org.fantasygold.wallet.model.contract.ContractMethodParameter;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface ContractFunctionDefaultView extends BaseFragmentView {
    void setUpParameterList(List<ContractMethodParameter> contractMethodParameterList);

    String getContractTemplateUiid();

    String getMethodName();

    void updateFee(double minFee, double maxFee);

    void updateGasPrice(int minGasPrice, int maxGasPrice);

    void updateGasLimit(int minGasLimit, int maxGasLimit);

    void showEtSendToContract();

    void hideEtSendToContract();

    void updateAddressWithBalanceSpinner(List<AddressWithBalance> addressWithBalances);

}
