package org.fantasygold.wallet.ui.fragment.currency_fragment.light;

import org.fantasygold.wallet.model.Currency;
import org.fantasygold.wallet.ui.fragment.currency_fragment.CurrencyFragment;

import java.util.List;

public class CurrencyFragmentLight extends CurrencyFragment {

    @Override
    protected int getLayout() {
        return org.fantasygold.wallet.R.layout.fragment_currency_light;
    }

    @Override
    public void setCurrencyList(List<Currency> currencyList) {
        mCurrencyAdapter = new CurrencyAdapter(currencyList, org.fantasygold.wallet.R.layout.lyt_token_list_item_light);
        mCurrentList = currencyList;
        mRecyclerView.setAdapter(mCurrencyAdapter);
    }
}
