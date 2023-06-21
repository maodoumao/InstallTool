package com.code.interfacecode;

import android.content.Context;

import com.code.tool.InstallReferrerUtil;


public interface AppInterface {
    void setup(Context context, InstallReferrerUtil.InstallReferrerCallback callback);
}
