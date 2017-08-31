package com.videomaker.photowithsong.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;

/**
 * Created by Peih Gnaoh on 8/21/2017.
 */

public class Constant {

    public static final String IMAGE = "IMAGE";
    public static final String IMAGE_ARR = "IMAGE_ARR";
    public static final String PATH_VIDEO = Environment.getExternalStorageDirectory().getPath() + "/Make Video/My video/";
    public static final String PATH_TEMP = Environment.getExternalStorageDirectory().getPath() + "/Make Video/Temp/";
    public static final String PATH = Environment.getExternalStorageDirectory().getPath() + "/Make Video/";

    public class Intents {
    }

    public class SharedPreferences {
    }

    public static Bitmap getBitmapFromLocalPath(String path, int sampleSize) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = sampleSize;
            return BitmapFactory.decodeFile(path, options);
        } catch (Exception e) {
            //  Logger.e(e.toString());
        }
        return null;
    }
}
