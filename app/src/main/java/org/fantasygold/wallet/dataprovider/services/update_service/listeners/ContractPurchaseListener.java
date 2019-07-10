package org.fantasygold.wallet.dataprovider.services.update_service.listeners;

import org.fantasygold.wallet.model.gson.qstore.ContractPurchase;

public interface ContractPurchaseListener {
    void onContractPurchased(ContractPurchase purchaseData);
}
