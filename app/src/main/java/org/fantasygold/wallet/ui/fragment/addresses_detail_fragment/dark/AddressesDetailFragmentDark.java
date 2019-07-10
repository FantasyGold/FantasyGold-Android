package org.fantasygold.wallet.ui.fragment.addresses_detail_fragment.dark;

import org.fantasygold.wallet.R;
import org.fantasygold.wallet.model.gson.history.TransactionInfo;
import org.fantasygold.wallet.model.gson.history.Vin;
import org.fantasygold.wallet.model.gson.history.Vout;
import org.fantasygold.wallet.ui.fragment.addresses_detail_fragment.AddressesDetailFragment;

import java.util.List;

public class AddressesDetailFragmentDark extends AddressesDetailFragment {


    @Override
    protected int getLayout() {
        return R.layout.fragment_addresses_detail;
    }


    @Override
    public void setUpRecyclerView(List<Vin> transactionFrom, List<Vout> transactionTo, String symbol) {
        mAddressesDetailAdapterTo = new AddressesDetailAdapterDark<>(transactionTo,symbol);
        mAddressesDetailAdapterFrom = new AddressesDetailAdapterDark<>(transactionFrom,symbol);
        mRecyclerViewFrom.setAdapter(mAddressesDetailAdapterFrom);
        mRecyclerViewTo.setAdapter(mAddressesDetailAdapterTo);
    }
}
