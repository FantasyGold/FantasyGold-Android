package org.fantasygold.wallet.ui.fragment.templates_fragment.light;

import org.fantasygold.wallet.R;
import org.fantasygold.wallet.model.ContractTemplate;
import org.fantasygold.wallet.ui.fragment.templates_fragment.TemplatesFragment;

import java.util.List;

public class TemplatesFragmentLight extends TemplatesFragment {

    @Override
    protected int getLayout() {
        return R.layout.fragment_templates_light;
    }

    @Override
    public void setUpTemplateList(List<ContractTemplate> contractTemplateList) {
        initializeRecyclerView(contractTemplateList, R.layout.item_template_light);
    }
}
