package org.fantasygold.wallet.ui.fragment.backup_wallet_fragment;

import android.content.Context;
import android.util.Base64;

import org.fantasygold.wallet.datastorage.FantasyGoldSharedPreference;
import org.fantasygold.wallet.utils.crypto.AESUtil;
import org.fantasygold.wallet.utils.crypto.KeyStoreHelper;

class BackUpWalletInteractorImpl implements BackUpWalletInteractor {

    private Context mContext;

    private final String FGC_PIN_ALIAS = "fantasygold_alias";

    BackUpWalletInteractorImpl(Context context) {
        mContext = context;
    }

    @Override
    public String getPassphrase(String pin) {
       return KeyStoreHelper.getSeed(mContext, pin);
    }
}
