package org.fantasygold.wallet.ui.fragment.fantasygold_cash_management_fragment;

import org.fantasygold.wallet.model.AddressWithBalance;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface AddressListView extends BaseFragmentView {
    void updateAddressList(List<AddressWithBalance> deterministicKeyWithBalance);
}
