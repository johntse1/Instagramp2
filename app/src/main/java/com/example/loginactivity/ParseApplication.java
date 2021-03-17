package com.example.loginactivity;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("kkEwJfhKSk02EeMXc3hQYrEzAcaUxPgTGW19q4j0")
                .clientKey("NZA8UY8VKhJayNHj5sO0ODRHNIow5sfmNN0slkBi")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
