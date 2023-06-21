package com.code.tool;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.code.app.AppTool;


public class MyApp extends Application {

    private static MyApp instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        AppTool.setup(getApplicationContext(),new InstallReferrerUtil.InstallReferrerCallback() {
            @Override
            public void onReferrerReceived(String referrer) {
                boolean organic = SharedPrefUtils.getInstance().getBooleanByKey(getPackageName(),true);
//                Log.e("referrer",referrer);
//                Log.e("organic",organic+"");
                if (organic) {
                    //自然量

                } else {
                    //非自然量
                }
            }
        });
    }


    public static MyApp getInstance(){
        return instance;
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
//        AppLib.setDebug(base,"B6631F6B6F6865D9836C24B0");
//        AppLib.initApp(base);
    }
}
