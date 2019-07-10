package org.fantasygold.wallet.ui.fragment.store_categories;

import org.fantasygold.wallet.model.gson.QstoreContractType;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentPresenter;

import java.util.List;

import rx.Observable;

public interface StoreCategoriesPresenter extends BaseFragmentPresenter {
    List<QstoreContractType> getFilter(String filter);

    Observable<List<QstoreContractType>> categoriesObservable();

    void setContractTypes(List<QstoreContractType> types);
}
