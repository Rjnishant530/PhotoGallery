package com.fictics.photogallery;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Photos {
private int pages;
private int perpage;
private int total;
private List<GalleryItem> photo;

    public int getPages() {
        return pages;
    }

    public List<GalleryItem> getPhoto() {
        return photo;
    }

}
