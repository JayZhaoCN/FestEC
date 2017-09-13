package com.zhaojiabao.festec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.zhaojiabao.latte.delegates.LatteDelegate;

/**
 * @author zhaojiabao 2017/9/13
 */

public class ExampleDelegate extends LatteDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }
}
