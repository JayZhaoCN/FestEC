package com.zhaojiabao.latte.app;

import android.content.Context;

import java.util.HashMap;

/**
 * @author zhaojiabao 2017/9/8
 */

public final class Latte {

    public static Configurator init(Context context) {
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static HashMap<String, Object> getConfigurations() {
        return Configurator.getInstance().getLatteConfigs();
    }

    public static final Context getApplication() {
        return (Context) getConfigurations().get(ConfigType.APPLICATION_CONTEXT.name());
    }
}
