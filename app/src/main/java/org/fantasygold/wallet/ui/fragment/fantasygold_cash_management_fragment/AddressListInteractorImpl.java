package org.fantasygold.wallet.ui.fragment.fantasygold_cash_management_fragment;

import android.content.Context;

import org.fantasygold.wallet.dataprovider.rest_api.fantasygold.FantasyGoldService;
import org.fantasygold.wallet.datastorage.KeyStorage;

import org.fantasygold.wallet.model.gson.UnspentOutput;

import java.lang.ref.WeakReference;
import java.util.List;

import rx.Observable;

public class AddressListInteractorImpl implements AddressListInteractor {

    AddressListInteractorImpl() {
    }

    @Override
    public List<String> getAddresses() {
        return KeyStorage.getInstance().getAddresses();
    }

    @Override
    public Observable<List<UnspentOutput>> getUnspentOutputs(List<String> addresses) {
        return FantasyGoldService.newInstance().getUnspentOutputsForSeveralAddresses(addresses);
    }
}
