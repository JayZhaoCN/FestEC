package com.zhaojiabao.festec;

import android.app.Application;

import com.zhaojiabao.latte.app.Latte;

/**
 * @author zhaojiabao 2017/9/8
 */

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Latte.init(this)
                .withApiHost("http://127.0.0.1")
                .configure();
    }
}
