package org.fantasygold.wallet.ui.fragment.contract_function_fragment.contract_default_function_fragment.light;

import org.fantasygold.wallet.model.AddressWithBalance;
import org.fantasygold.wallet.model.contract.ContractMethodParameter;
import org.fantasygold.wallet.ui.fragment.contract_function_fragment.ParameterAdapter;
import org.fantasygold.wallet.ui.fragment.contract_function_fragment.contract_default_function_fragment.AddressesWithBalanceSpinnerAdapter;
import org.fantasygold.wallet.ui.fragment.contract_function_fragment.contract_default_function_fragment.ContractFunctionDefaultFragment;

import java.util.List;

public class ContractFunctionDefaultFragmentLight extends ContractFunctionDefaultFragment {

    @Override
    protected int getLayout() {
        return org.fantasygold.wallet.R.layout.fragment_function_detail_light;
    }

    @Override
    public void setUpParameterList(List<ContractMethodParameter> contractMethodParameterList) {
        mParameterAdapter = new ParameterAdapter(contractMethodParameterList, org.fantasygold.wallet.R.layout.lyt_constructor_input_light);
        mParameterList.setAdapter(mParameterAdapter);
    }

    @Override
    public void updateAddressWithBalanceSpinner(List<AddressWithBalance> addressWithBalances) {
        AddressesWithBalanceSpinnerAdapter adapter = new AddressesWithBalanceSpinnerAdapterLight(getContext(), addressWithBalances);
        mSpinner.setAdapter(adapter);
    }
}
