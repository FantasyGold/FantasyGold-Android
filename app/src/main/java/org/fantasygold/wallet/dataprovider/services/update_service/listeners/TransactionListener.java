package org.fantasygold.wallet.dataprovider.services.update_service.listeners;

import org.fantasygold.wallet.model.gson.history.History;

public interface TransactionListener {
    void onNewHistory(History history);

    boolean getVisibility();
}
