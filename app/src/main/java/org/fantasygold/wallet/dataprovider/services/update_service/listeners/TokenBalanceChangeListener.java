package org.fantasygold.wallet.dataprovider.services.update_service.listeners;

import org.fantasygold.wallet.model.gson.token_balance.TokenBalance;

public interface TokenBalanceChangeListener {
    void onBalanceChange(TokenBalance tokenBalance);
}
