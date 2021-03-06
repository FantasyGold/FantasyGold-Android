package org.fantasygold.wallet.ui.fragment.token_cash_management_fragment;

import android.os.Handler;

import org.fantasygold.wallet.dataprovider.services.update_service.UpdateService;
import org.fantasygold.wallet.model.AddressWithTokenBalance;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface AddressesListTokenView extends BaseFragmentView {
    void updateAddressList(List<AddressWithTokenBalance> deterministicKeyWithBalance, String currency);

    UpdateService getSocketInstance();

    Handler getHandler();

    void hideTransferDialog();

    void goToSendFragment(AddressWithTokenBalance keyWithTokenBalanceFrom, AddressWithTokenBalance keyWithBalanceTo, String amountString, String contractAddress);
}
