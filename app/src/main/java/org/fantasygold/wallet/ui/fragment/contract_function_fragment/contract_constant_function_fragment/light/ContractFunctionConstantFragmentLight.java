package org.fantasygold.wallet.ui.fragment.contract_function_fragment.contract_constant_function_fragment.light;

import org.fantasygold.wallet.model.contract.ContractMethodParameter;
import org.fantasygold.wallet.ui.fragment.contract_function_fragment.ParameterAdapter;
import org.fantasygold.wallet.ui.fragment.contract_function_fragment.contract_constant_function_fragment.ContractFunctionConstantFragment;

import java.util.List;

public class ContractFunctionConstantFragmentLight extends ContractFunctionConstantFragment {

    @Override
    protected int getLayout() {
        return org.fantasygold.wallet.R.layout.fragment_function_constant_detail_light;
    }

    @Override
    public void setUpParameterList(List<ContractMethodParameter> contractMethodParameterList) {
        mParameterAdapter = new ParameterAdapter(contractMethodParameterList, org.fantasygold.wallet.R.layout.lyt_constructor_input_light);
        mParameterList.setAdapter(mParameterAdapter);
    }
}
