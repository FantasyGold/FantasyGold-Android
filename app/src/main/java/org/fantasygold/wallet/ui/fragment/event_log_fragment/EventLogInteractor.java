package org.fantasygold.wallet.ui.fragment.event_log_fragment;


import org.fantasygold.wallet.model.gson.history.History;

public interface EventLogInteractor {
    History getHistory(String txHash);
}
