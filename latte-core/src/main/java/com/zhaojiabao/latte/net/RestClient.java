package com.zhaojiabao.latte.net;

import android.util.Log;

import com.zhaojiabao.latte.net.callbacks.IError;
import com.zhaojiabao.latte.net.callbacks.IFailure;
import com.zhaojiabao.latte.net.callbacks.IRequest;
import com.zhaojiabao.latte.net.callbacks.ISuccess;
import com.zhaojiabao.latte.net.callbacks.RequestCallbacks;

import java.util.Map;
import java.util.WeakHashMap;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;

/**
 * @author zhaojiabao (zhaojiabao@huami.com)
 */

public class RestClient {
    private final String URL;
    private static final WeakHashMap<String, Object> PARAMS = RestCreator.getParams();
    private final IRequest REQUEST;
    private final ISuccess SUCCESS;
    private final IFailure FAILURE;
    private final IError ERROR;
    private final RequestBody BODY;


    public RestClient(String url,
                      Map<String, Object> params,
                      IRequest request, ISuccess success,
                      IFailure failure, IError error, RequestBody body) {
        URL = url;
        PARAMS.putAll(params);
        REQUEST = request;
        SUCCESS = success;
        FAILURE = failure;
        ERROR = error;
        BODY = body;
    }

    public static RestClientBuilder builder() {
        return new RestClientBuilder();
    }

    private void request(HttpMethod method) {
        final RestService service = RestCreator.getService();
        Call<String> call = null;
        Log.i("JayLog", "request is null: " + (REQUEST == null));
        if (REQUEST != null) {
            REQUEST.onRequestStart();
            switch (method) {
                case GET:
                    call = service.get(URL, PARAMS);
                    break;
                case POST:
                    call = service.post(URL, PARAMS);
                    break;
                case PUT:
                    call = service.put(URL, PARAMS);
                    break;
                case DELETE:
                    call = service.delete(URL, PARAMS);
                    break;
                default:
                    break;
            }
            Log.i("JayLog", "call is null: " + (call == null));
            if (call != null) {
                call.enqueue(getRequestCallback());
            }
        }
    }

    private Callback<String> getRequestCallback() {
        return new RequestCallbacks(REQUEST, SUCCESS, FAILURE, ERROR);
    }

    public final void get() {
        request(HttpMethod.GET);
    }

    public final void post() {
        request(HttpMethod.POST);
    }

    public final void put() {
        request(HttpMethod.PUT);
    }

    public final void delete() {
        request(HttpMethod.DELETE);
    }
}