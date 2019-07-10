package org.fantasygold.wallet.ui.fragment.templates_fragment;

import org.fantasygold.wallet.model.ContractTemplate;

import java.util.List;

public interface TemplatesInteractor {
    List<ContractTemplate> getContractTemplates();

    int compareDates(String date, String date1);
}
