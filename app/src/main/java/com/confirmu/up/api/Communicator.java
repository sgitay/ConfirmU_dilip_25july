package com.confirmu.up.api;

import android.content.Context;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import java.security.KeyStore;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.entity.StringEntity;


public class Communicator {

    public void post(final String reqCode, final Context context, String url, RequestParams params, final CustomResponseListener responseListener) {
        AsyncHttpClient client = new AsyncHttpClient();
        client.setTimeout(30000);
        client.setResponseTimeout(30000);
        client.addHeader("Access-Token","0662aba4-555a-41ea-b6c2-d2644d7616df");
        client.addHeader("Partner","mobileapp");
        /// We initialize a default Keystore
        try {
            KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
            // We load the KeyStore
            trustStore.load(null, null);

            com.loopj.android.http.MySSLSocketFactory sslSocketFactory = new com.loopj.android.http.MySSLSocketFactory(trustStore);
            sslSocketFactory.setHostnameVerifier(com.loopj.android.http.MySSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            client.setSSLSocketFactory(sslSocketFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }
        client.post(context, url, params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String response = new String(responseBody);
                responseListener.onResponse(reqCode, response.trim());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                responseListener.onError(reqCode, error);
            }

        });

    }

    public void post(Context context, final String reqCode, String url, StringEntity entity, final CustomResponseListener responseHandler){
        AsyncHttpClient client = new AsyncHttpClient();
        client.setTimeout(30000);
        client.setResponseTimeout(30000);
        client.addHeader("Access-Token","0662aba4-555a-41ea-b6c2-d2644d7616df");
        client.addHeader("Partner","mobileapp");
        /// We initialize a default Keystore
        try {
            KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
            // We load the KeyStore
            trustStore.load(null, null);

            com.loopj.android.http.MySSLSocketFactory sslSocketFactory = new com.loopj.android.http.MySSLSocketFactory(trustStore);
            sslSocketFactory.setHostnameVerifier(com.loopj.android.http.MySSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            client.setSSLSocketFactory(sslSocketFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }
        client.post(context, url, entity, "application/json", new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String response = new String(responseBody);
                responseHandler.onResponse(reqCode, response.trim());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                responseHandler.onError(reqCode, error);
            }
        });
    }

    public void postMultipart(final String reqCode, final Context context, String url, RequestParams params, final CustomResponseListener responseListener) {
        AsyncHttpClient client = new AsyncHttpClient();
        client.addHeader("Content-Type", "multipart/form-data");
        client.setTimeout(10000);
        client.setResponseTimeout(10000);
        client.addHeader("Access-Token","0662aba4-555a-41ea-b6c2-d2644d7616df");
        client.addHeader("Partner","mobileapp");
        try {
            KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
// We load the KeyStore
            trustStore.load(null, null);
            com.loopj.android.http.MySSLSocketFactory sslSocketFactory = new com.loopj.android.http.MySSLSocketFactory(trustStore);
            sslSocketFactory.setHostnameVerifier(com.loopj.android.http.MySSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            client.setSSLSocketFactory(new com.loopj.android.http.MySSLSocketFactory(trustStore));
        } catch (Exception e) {
            e.printStackTrace();
        }
        client.post(context, url, params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String response = new String(responseBody);
                responseListener.onResponse(reqCode, response.trim());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                responseListener.onError(reqCode, error);
            }

        });

    }

    public void get(final String reqCode, final Context context, String url, final CustomResponseListener responseListener) {
        AsyncHttpClient client = new AsyncHttpClient();
        client.addHeader("Access-Token","0662aba4-555a-41ea-b6c2-d2644d7616df");
        client.addHeader("Partner","mobileapp");
        client.setMaxRetriesAndTimeout(1, 10000);
        try {
            KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
// We load the KeyStore
            trustStore.load(null, null);
            com.loopj.android.http.MySSLSocketFactory sslSocketFactory = new com.loopj.android.http.MySSLSocketFactory(trustStore);
            sslSocketFactory.setHostnameVerifier(com.loopj.android.http.MySSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            client.setSSLSocketFactory(sslSocketFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }
        client.get(context, url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String response = new String(responseBody);
                responseListener.onResponse(reqCode, response.trim());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                responseListener.onError(reqCode, error);
            }

        });

    }

    public void get(final String reqCode, final Context context, String url, RequestParams params, final CustomResponseListener responseListener) {
        AsyncHttpClient client = new AsyncHttpClient();
        client.setMaxRetriesAndTimeout(2, 10000);
        client.addHeader("Access-Token","0662aba4-555a-41ea-b6c2-d2644d7616df");
        client.addHeader("Partner","mobileapp");
        try {
            KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
// We load the KeyStore
            trustStore.load(null, null);
            com.loopj.android.http.MySSLSocketFactory sslSocketFactory = new com.loopj.android.http.MySSLSocketFactory(trustStore);
            sslSocketFactory.setHostnameVerifier(com.loopj.android.http.MySSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            client.setSSLSocketFactory(sslSocketFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }
        client.get(context, url, params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String response = new String(responseBody);
                responseListener.onResponse(reqCode, response.trim());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                responseListener.onError(reqCode, error);
            }

        });

    }


}