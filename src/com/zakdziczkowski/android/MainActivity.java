package com.zakdziczkowski.android;

import org.apache.cordova.*;
import android.os.Bundle;

public class MainActivity extends DroidGap {
   
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setIntegerProperty("loadUrlTimeoutValue", 60000);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}