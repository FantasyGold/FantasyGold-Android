package org.fantasygold.wallet.ui.fragment.templates_fragment.dark;

import org.fantasygold.wallet.model.ContractTemplate;
import org.fantasygold.wallet.ui.fragment.templates_fragment.TemplatesFragment;

import java.util.List;

public class TemplatesFragmentDark extends TemplatesFragment {

    @Override
    protected int getLayout() {
        return org.fantasygold.wallet.R.layout.fragment_templates;
    }

    @Override
    public void setUpTemplateList(List<ContractTemplate> contractTemplateList) {
        initializeRecyclerView(contractTemplateList, org.fantasygold.wallet.R.layout.item_template);
    }
}
