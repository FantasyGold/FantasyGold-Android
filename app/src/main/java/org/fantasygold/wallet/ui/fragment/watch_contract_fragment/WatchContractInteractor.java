package org.fantasygold.wallet.ui.fragment.watch_contract_fragment;

import org.fantasygold.wallet.model.ContractTemplate;
import org.fantasygold.wallet.model.contract.Contract;

import java.util.List;

public interface WatchContractInteractor {
    List<ContractTemplate> getContractTemplates();

    int compareDates(String date, String date1);

    String readAbiContract(String uuid);

    boolean isValidContractAddress(String address);

    List<Contract> getContracts();

    void handleContractWithoutToken(String name, String address, String ABIInterface);
}
