package org.fantasygold.wallet.ui.fragment.contract_management_fragment.light;

import org.fantasygold.wallet.model.contract.ContractMethod;
import org.fantasygold.wallet.ui.fragment.contract_management_fragment.ContractManagementFragment;

import java.util.List;

public class ContractManagementFragmentLight extends ContractManagementFragment {

    @Override
    protected int getLayout() {
        return org.fantasygold.wallet.R.layout.fragment_contract_management_light;
    }

    @Override
    public void setRecyclerView(List<ContractMethod> contractMethodList, boolean needToGetValue) {
        mMethodAdapter = new MethodAdapter(contractMethodList, org.fantasygold.wallet.R.layout.item_contract_property_light, org.fantasygold.wallet.R.layout.item_contract_method_light, needToGetValue);
        mRecyclerView.setAdapter(mMethodAdapter);
    }
}

