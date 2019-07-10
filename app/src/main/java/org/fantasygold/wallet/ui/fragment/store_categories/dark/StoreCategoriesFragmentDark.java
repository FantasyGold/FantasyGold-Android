package org.fantasygold.wallet.ui.fragment.store_categories.dark;

import org.fantasygold.wallet.R;
import org.fantasygold.wallet.model.gson.QstoreContractType;
import org.fantasygold.wallet.ui.fragment.store_categories.StoreCategoriesAdapter;
import org.fantasygold.wallet.ui.fragment.store_categories.StoreCategoriesFragment;
import org.fantasygold.wallet.ui.fragment.store_categories.StoreCategoryViewHolder;

import java.util.List;

public class StoreCategoriesFragmentDark extends StoreCategoriesFragment {

    @Override
    protected int getLayout() {
        return R.layout.lyt_store_categories;
    }

    @Override
    public void setUpCategoriesList(List<QstoreContractType> list, StoreCategoryViewHolder.OnCategoryClickListener listener) {
        adapter = new StoreCategoriesAdapter(list, R.layout.lyt_store_category_list_item, listener);
        contentList.setAdapter(adapter);
    }
}
