package edu.washington.cs.ubicomplab.rdt_reader;

import org.opencv.core.Scalar;

/**
 * Created by cjparkuw on 3/9/2018.
 */

public final class Constants {
    public static final String TAG = "RDT-reader";
    public static final int MY_CAMERA_REQUEST_CODE = 100;
    public static final String[] DATE_FORMATS = {"YYYY/MM/DD","YYYY.MM.DD","YYYY-MM-DD"};

    public static double BLUR_THRESHOLD = 0.75;
    public static double OVER_EXP_THRESHOLD = 255;
    public static double UNDER_EXP_THRESHOLD = 120;

    public static String OK = "<font color='#00EE00'>✔</font>";
    public static String NOT_OK = "<font color='#EE0000'>✘</font>";

    public static Scalar RDT_COLOR_HSV = new Scalar(30, 21, 204, 0.0);

    public static double SIZE_THRESHOLD = 0.1;
    public static double POSITON_THRESHOLD = 0.1;

    public static int CALIBRATION_FRAME_COUTER = 10;
}
