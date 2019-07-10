package org.fantasygold.wallet.ui.activity.main_activity;

import android.content.Context;

import org.fantasygold.wallet.dataprovider.rest_api.fantasygold.FantasyGoldService;
import org.fantasygold.wallet.datastorage.KeyStorage;
import org.fantasygold.wallet.datastorage.FantasyGoldSettingSharedPreference;
import org.fantasygold.wallet.datastorage.FantasyGoldSharedPreference;
import org.fantasygold.wallet.datastorage.listeners.LanguageChangeListener;
import org.fantasygold.wallet.model.gson.DGPInfo;
import org.fantasygold.wallet.model.gson.FeePerKb;

import java.math.BigDecimal;

import rx.Observable;

class MainActivityInteractorImpl implements MainActivityInteractor {

    private Context mContext;

    private boolean isDGPInfoLoaded = false;
    private boolean isFeePerkbLoaded = false;

    MainActivityInteractorImpl(Context context) {
        mContext = context;
    }

    @Override
    public boolean getKeyGeneratedInstance() {
        return FantasyGoldSharedPreference.getInstance().getKeyGeneratedInstance(mContext);
    }

    @Override
    public void clearStatic() {
        KeyStorage.getInstance().clearKeyStorage();
    }

    @Override
    public Observable<DGPInfo> getDGPInfo() {
        return FantasyGoldService.newInstance().getDGPInfo();
    }

    @Override
    public boolean isDGPInfoLoaded() {
        return isDGPInfoLoaded;
    }

    @Override
    public boolean isFeePerkbLoaded() {
        return isFeePerkbLoaded;
    }

    @Override
    public void addLanguageChangeListener(LanguageChangeListener languageChangeListener) {
        FantasyGoldSettingSharedPreference.getInstance().addLanguageListener(languageChangeListener);
    }

    @Override
    public void removeLanguageChangeListener(LanguageChangeListener languageChangeListener) {
        FantasyGoldSettingSharedPreference.getInstance().removeLanguageListener(languageChangeListener);
    }

    @Override
    public Observable<FeePerKb> getFeePerKb() {
        return FantasyGoldService.newInstance().getEstimateFeePerKb(2);
    }

    @Override
    public void setDGPInfo(DGPInfo dgpInfo) {
        isDGPInfoLoaded = true;
        FantasyGoldSharedPreference.getInstance().setMinGasPrice(mContext, dgpInfo.getMingasprice());
    }

    @Override
    public void setFeePerKb(FeePerKb feePerKb) {
        isFeePerkbLoaded = true;
        FantasyGoldSettingSharedPreference fantasygoldSettingSharedPreference = FantasyGoldSettingSharedPreference.getInstance();
        fantasygoldSettingSharedPreference.setFeePerKb(mContext, feePerKb.getFeePerKb().setScale(5, BigDecimal.ROUND_HALF_DOWN).toPlainString());
    }
}
