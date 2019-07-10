package org.fantasygold.wallet.ui.fragment.addresses_fragment.light;

import android.support.v4.content.ContextCompat;
import android.view.View;

import org.fantasygold.wallet.R;
import org.fantasygold.wallet.datastorage.KeyStorage;
import org.fantasygold.wallet.ui.fragment.addresses_fragment.AddressHolder;
import org.fantasygold.wallet.ui.fragment.addresses_fragment.OnAddressClickListener;

public class AddressHolderLight extends AddressHolder {

    protected AddressHolderLight(View itemView, OnAddressClickListener listener) {
        super(itemView, listener);
    }

    public void bindAddress(String address, int position) {
        if (position == KeyStorage.getInstance().getCurrentKeyPosition()) {
            mImageViewCheckIndicator.setVisibility(View.VISIBLE);
            mLinearLayoutAddress.setBackgroundColor(ContextCompat.getColor(mLinearLayoutAddress.getContext(), R.color.qr_code_background));
        } else {
            mImageViewCheckIndicator.setVisibility(View.GONE);
            mLinearLayoutAddress.setBackgroundColor(ContextCompat.getColor(mLinearLayoutAddress.getContext(), android.R.color.transparent));
        }
        mTextViewAddress.setText(address);
    }
}
