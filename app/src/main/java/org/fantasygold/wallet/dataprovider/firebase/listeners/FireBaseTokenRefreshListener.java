package org.fantasygold.wallet.dataprovider.firebase.listeners;

public interface FireBaseTokenRefreshListener {
    void onRefresh(String prevToken, String currentToken);
}
