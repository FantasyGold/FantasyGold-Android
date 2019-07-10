package org.fantasygold.wallet.ui.fragment.template_library_fragment;

import org.fantasygold.wallet.model.ContractTemplate;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface TemplateLibraryView extends BaseFragmentView {

    void setUpTemplateList(List<ContractTemplate> contractTemplateList);

}
