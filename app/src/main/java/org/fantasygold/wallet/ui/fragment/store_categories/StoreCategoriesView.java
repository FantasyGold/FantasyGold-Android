package org.fantasygold.wallet.ui.fragment.store_categories;

import org.fantasygold.wallet.model.gson.QstoreContractType;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface StoreCategoriesView extends BaseFragmentView {
    void setUpCategoriesList(List<QstoreContractType> list, StoreCategoryViewHolder.OnCategoryClickListener listener);
}
