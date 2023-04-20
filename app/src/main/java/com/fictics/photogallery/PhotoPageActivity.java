package com.fictics.photogallery;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

public class PhotoPageActivity extends SingleFragmentActivity implements PhotoPageFragment.Callbacks {

    private WebView mWebView;

    public static Intent newIntent(Context context, Uri photoPageUri) {
        Intent i = new Intent(context, PhotoPageActivity.class);
        i.setData(photoPageUri);
        return i;
    }

    @Override
    protected Fragment createFragment() {
        mWebView=null;
        return PhotoPageFragment.newInstance(getIntent().getData());
    }

    @Override
    public void updateWebview(WebView webView) {
        this.mWebView=webView;

    }

    @Override
    public void onBackPressed() {
        if(mWebView!=null&&mWebView.canGoBack()){
            mWebView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}
