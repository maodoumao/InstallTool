package com.code.implementation;

import android.content.Context;

import com.code.interfacecode.AppInterface;
import com.code.tool.InstallReferrerUtil;
import com.code.tool.SharedPrefUtils;


public class AppImplementation implements AppInterface {

    @Override
    public void setup(Context context, InstallReferrerUtil.InstallReferrerCallback callback) {
        SharedPrefUtils.init(context);
        String schoolName = SharedPrefUtils.getInstance().getStrBykey("referrer","");
        if (schoolName.isEmpty()) {
            InstallReferrerUtil.setup(context,callback);
        } else {
            callback.onReferrerReceived(schoolName);
        }
    }

}
