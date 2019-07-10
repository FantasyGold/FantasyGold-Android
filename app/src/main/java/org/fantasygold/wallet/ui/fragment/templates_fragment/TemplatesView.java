package org.fantasygold.wallet.ui.fragment.templates_fragment;

import org.fantasygold.wallet.model.ContractTemplate;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface TemplatesView extends BaseFragmentView {
    void setUpTemplateList(List<ContractTemplate> contractTemplateList);
}
