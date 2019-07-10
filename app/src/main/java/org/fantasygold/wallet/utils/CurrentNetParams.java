package org.fantasygold.wallet.utils;

import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.params.FantasyGoldMainNetParams;
import org.bitcoinj.params.FantasyGoldTestNetParams;
import org.fantasygold.wallet.BuildConfig;

public class CurrentNetParams {

    public  CurrentNetParams(){}

    public static NetworkParameters getNetParams(){
        return BuildConfig.USE_MAIN_NET? FantasyGoldMainNetParams.get() : FantasyGoldTestNetParams.get();
    }

    public static String getUrl(){
        return BuildConfig.API_URL;
    }
}
