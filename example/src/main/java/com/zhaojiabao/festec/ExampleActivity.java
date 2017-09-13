package com.zhaojiabao.festec;

import com.zhaojiabao.latte.activities.ProxyActivity;
import com.zhaojiabao.latte.delegates.LatteDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
