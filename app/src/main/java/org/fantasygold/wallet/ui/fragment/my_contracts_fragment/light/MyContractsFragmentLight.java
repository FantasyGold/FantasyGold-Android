package org.fantasygold.wallet.ui.fragment.my_contracts_fragment.light;

import org.fantasygold.wallet.R;
import org.fantasygold.wallet.model.contract.Contract;
import org.fantasygold.wallet.ui.fragment.my_contracts_fragment.ContractItemListener;
import org.fantasygold.wallet.ui.fragment.my_contracts_fragment.MyContractsFragment;

import java.util.List;

public class MyContractsFragmentLight extends MyContractsFragment {

    @Override
    protected int getLayout() {
        return R.layout.fragment_my_contracts_light;
    }

    @Override
    public void setUpRecyclerView(List<Contract> contractList, ContractItemListener contractItemListener) {
        mContractAdapter = new ContractAdapter(contractList, R.layout.item_contract_list_light, contractItemListener);
        mRecyclerView.setAdapter(mContractAdapter);
    }
}
