package org.fantasygold.wallet.ui.fragment.qstore;

import org.fantasygold.wallet.model.gson.qstore.QSearchItem;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentView;
import org.fantasygold.wallet.ui.fragment.qstore.categories.QstoreCategory;

import java.util.List;

public interface QStoreView extends BaseFragmentView {
    void setCategories(List<QstoreCategory> categories);

    void setSearchResult(List<QSearchItem> items);

    void setSearchBarText(String text);

    String getSeacrhBarText();
}
