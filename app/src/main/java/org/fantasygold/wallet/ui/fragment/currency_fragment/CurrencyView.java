package org.fantasygold.wallet.ui.fragment.currency_fragment;

import org.fantasygold.wallet.model.Currency;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface CurrencyView extends BaseFragmentView {
    void setCurrencyList(List<Currency> currencyList);
}
