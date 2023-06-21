package com.code.app;

import android.content.Context;

import com.code.interfacecode.AppInterface;
import com.code.interfacefactory.InterfaceFactory;
import com.code.tool.InstallReferrerUtil;

public class AppTool {
    public static void setup(Context context, InstallReferrerUtil.InstallReferrerCallback callback) {
        AppInterface myInterface = InterfaceFactory.createInstance();
        myInterface.setup(context,callback);
    }
}
