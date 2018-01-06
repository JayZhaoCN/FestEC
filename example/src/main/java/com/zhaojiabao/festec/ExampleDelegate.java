package com.zhaojiabao.festec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.zhaojiabao.latte.delegates.LatteDelegate;
import com.zhaojiabao.latte.net.RestClient;
import com.zhaojiabao.latte.net.callbacks.IError;
import com.zhaojiabao.latte.net.callbacks.IFailure;
import com.zhaojiabao.latte.net.callbacks.IRequest;
import com.zhaojiabao.latte.net.callbacks.ISuccess;

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
        testRestClient();
    }

    private void testRestClient() {
        RestClient.builder()
                .url("https://www.baidu.com/duty/")
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {
                        Log.i("JayLog", "response: " + response);
                    }
                })
                .failure(new IFailure() {
                    @Override
                    public void onFailure() {

                    }
                })
                .error(new IError() {
                    @Override
                    public void onError(int errorCode, String msg) {

                    }
                })
                .request(new IRequest() {
                    @Override
                    public void onRequestStart() {
                        Log.i("JayLog", "onRequest start");
                    }

                    @Override
                    public void onRequestEnd() {
                        Log.i("JayLog", "onRequest end");
                    }
                })
                .build()
                .get();
    }
}
