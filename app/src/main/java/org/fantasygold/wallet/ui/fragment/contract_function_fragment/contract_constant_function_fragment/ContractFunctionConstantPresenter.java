package org.fantasygold.wallet.ui.fragment.contract_function_fragment.contract_constant_function_fragment;

import org.fantasygold.wallet.model.contract.ContractMethodParameter;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentPresenter;

import java.util.List;

public interface ContractFunctionConstantPresenter extends BaseFragmentPresenter {
    void onQueryClick(List<ContractMethodParameter> contractMethodParameterList, final String contractAddress, String methodName);
}
