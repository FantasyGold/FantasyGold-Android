package org.fantasygold.wallet.ui.fragment.watch_contract_fragment;

import org.fantasygold.wallet.model.ContractTemplate;

public interface OnTemplateClickListener {
    void updateSelection(int adapterPosition);

    void onTemplateClick(ContractTemplate contractTemplate);
}
