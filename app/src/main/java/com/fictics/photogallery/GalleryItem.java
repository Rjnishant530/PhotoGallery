package com.fictics.photogallery;

import android.net.Uri;

public class GalleryItem {

    private String mCaption;

    private String mId;

    private String mUrl;

    private String mOwner;

    public GalleryItem(String id, String title, String url,String owner) {
        this.mId=id;
        this.mCaption=title;
        this.mUrl=url;
        this.mOwner=owner;
    }
    public GalleryItem(){
        this.mUrl="";
        this.mCaption="";
        this.mId="";
        this.mOwner="";
    }

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String owner) {
        mOwner = owner;
    }

    public Uri getPhotoPageUri() {
        return Uri.parse("https://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(mOwner)
                .appendPath(mId)
                .build();
    }

    @Override
    public String toString() {
        return mCaption;
    }

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String mCaption) {
        this.mCaption = mCaption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String mUrl) {
        this.mUrl = mUrl;
    }
}
