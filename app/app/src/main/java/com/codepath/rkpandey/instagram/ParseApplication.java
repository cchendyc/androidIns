package com.codepath.rkpandey.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VlABvk9reSTxndGC3Ww9U3b6g3aEtiDRHSod1ktH")
                .clientKey("5xLf3D56GK0m0druOGR8a89Y5m5Oi8unJvhD8X7a")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
