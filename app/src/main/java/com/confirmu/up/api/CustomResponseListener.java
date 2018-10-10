package com.confirmu.up.api;


public interface CustomResponseListener {
    void onResponse(String requestCode, String response);
    void onError(String requestCode, Throwable response);
}
