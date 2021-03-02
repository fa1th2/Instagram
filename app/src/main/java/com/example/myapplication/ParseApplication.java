package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("UallScndF4SrFEx8uPLRXUjxM7JtJ2GxBJqioTHn")
                .clientKey("QwkWsr3XqznzgfvknvAFYgO3n3oBgYq6BVAM54g8")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }

}
