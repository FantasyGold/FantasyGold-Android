package org.fantasygold.wallet.ui.fragment.transaction_fragment;

import org.fantasygold.wallet.model.gson.history.History;
import org.fantasygold.wallet.model.gson.history.TransactionReceipt;
import org.fantasygold.wallet.model.gson.token_history.TokenHistory;

import io.realm.Realm;

public interface TransactionInteractor {

    History getHistory(String txHash);

    TokenHistory getTokenHistory(String txHash);

    String getFullDate(long l);

    String getUnconfirmedDate();

    TransactionReceipt getHistoryReceipt(Realm realm, String txHash);
}
