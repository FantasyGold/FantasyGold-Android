package org.fantasygold.wallet.ui.fragment.store_contract.dark;

import org.fantasygold.wallet.model.gson.qstore.QstoreContract;
import org.fantasygold.wallet.ui.fragment.store_contract.StoreContractFragment;
import org.fantasygold.wallet.ui.fragment.store_contract.TagRecyclerViewAdapter;
import org.fantasygold.wallet.utils.DateCalculator;

import butterknife.OnClick;

public class StoreContractFragmentDark extends StoreContractFragment {

    @Override
    protected int getLayout() {
        return org.fantasygold.wallet.R.layout.lyt_store_contract;
    }

    @OnClick(org.fantasygold.wallet.R.id.tv_view_abi)
    public void onViewAbiClick() {
        getPresenter().getContractAbiById(getPresenter().getContract().id);
    }

    @Override
    public void setContractData(QstoreContract contract) {
        toolbarTitle.setText(contract.name);
        tvCost.setText(String.valueOf(contract.price));
        tvDescription.setText(contract.description);
        rvTags.setAdapter(new TagRecyclerViewAdapter(contract.tags, this, org.fantasygold.wallet.R.layout.item_tag));
        tvPublishDate.setText(DateCalculator.getShortDate(contract.creationDate));
        tvSizeInBytes.setText(String.valueOf(contract.sizeInBytes));
        tvCompiledOn.setText(contract.completedOn);
        tvSourceCode.setText(contract.withSourceCode ? "Yes" : "No");
        tvPublishedBy.setText(contract.publisherAddress);
        tvDownloads.setText(String.valueOf(contract.countDownloads));
    }
}
