package org.fantasygold.wallet.ui.fragment.template_library_fragment;

import org.fantasygold.wallet.model.ContractTemplate;

import java.util.List;

public interface TemplateLibraryInteractor {
    List<ContractTemplate> getContactTemplates();

    int compareDates(String date, String date1);
}
