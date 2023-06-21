package com.code.interfacefactory;

import com.code.implementation.AppImplementation;
import com.code.interfacecode.AppInterface;

public class InterfaceFactory {
    public static AppInterface createInstance() {
        // 在这里动态加载实现类，并返回接口实例
        return new AppImplementation();
    }
}
