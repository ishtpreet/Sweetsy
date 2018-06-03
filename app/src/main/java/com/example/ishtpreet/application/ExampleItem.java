package com.example.ishtpreet.application;

public class ExampleItem {
    private int mimageresource;
    private String mtext1;
    private String mtext2;

    public ExampleItem(int imageresource, String text1, String text2) {
        mimageresource = imageresource;
        mtext1 = text1;
        mtext2 = text2;
    }

    public int getimageresource() {
        return mimageresource;
    }

    public String gettext1() {
        return mtext1;
    }

    public String gettext2() {
        return mtext2;
    }
}
