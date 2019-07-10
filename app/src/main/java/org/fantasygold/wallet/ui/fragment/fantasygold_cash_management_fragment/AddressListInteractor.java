package org.fantasygold.wallet.ui.fragment.fantasygold_cash_management_fragment;

import org.fantasygold.wallet.model.gson.UnspentOutput;

import java.util.List;

import rx.Observable;

public interface AddressListInteractor {
    List<String> getAddresses();

    Observable<List<UnspentOutput>> getUnspentOutputs(List<String> addresses);
}
