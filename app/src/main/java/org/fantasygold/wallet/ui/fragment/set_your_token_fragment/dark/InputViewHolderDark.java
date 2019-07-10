package org.fantasygold.wallet.ui.fragment.set_your_token_fragment.dark;

import android.view.View;

import org.fantasygold.wallet.ui.fragment.set_your_token_fragment.InputViewHolder;
import org.fantasygold.wallet.ui.fragment.set_your_token_fragment.OnValidateParamsListener;
import org.fantasygold.wallet.utils.FontManager;

public class InputViewHolderDark extends InputViewHolder {

    public InputViewHolderDark(View itemView, OnValidateParamsListener listener) {
        super(itemView, listener);
        tilParam.setTypeface(FontManager.getInstance().getFont(tilParam.getContext().getString(org.fantasygold.wallet.R.string.simplonMonoRegular)));
        etParam.setTypeface(FontManager.getInstance().getFont(etParam.getContext().getString(org.fantasygold.wallet.R.string.simplonMonoRegular)));
    }
}
