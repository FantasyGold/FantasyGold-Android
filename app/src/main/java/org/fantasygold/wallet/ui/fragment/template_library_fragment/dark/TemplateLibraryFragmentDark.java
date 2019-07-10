package org.fantasygold.wallet.ui.fragment.template_library_fragment.dark;

import org.fantasygold.wallet.model.ContractTemplate;
import org.fantasygold.wallet.ui.fragment.template_library_fragment.TemplateLibraryFragment;

import java.util.List;

public class TemplateLibraryFragmentDark extends TemplateLibraryFragment {

    @Override
    protected int getLayout() {
        return org.fantasygold.wallet.R.layout.fragment_template_library;
    }

    @Override
    public void setUpTemplateList(List<ContractTemplate> contractTemplateList) {
        initializeRecyclerView(contractTemplateList, org.fantasygold.wallet.R.layout.item_template);
    }
}
