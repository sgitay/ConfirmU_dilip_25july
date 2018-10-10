package com.confirmu.up.api;


import android.net.Uri;

import org.json.JSONArray;


public class Constants {

    private static String BASE_URL = "https://api.confirmu.com/api/";
    public static String GET_QUESTIONS = BASE_URL + "getquestions/";
    public static String SMS = BASE_URL + "sms";
    public static String GET_SCORES = BASE_URL + "getscores/";

    public static Uri PROFILE_PIC;
    public static JSONArray smsArray = new JSONArray();
    public static JSONArray locationArray;
    public static JSONArray jobsArray;

    public static class Keys{
        public static final String LOAN_NAME = "loan_name";
        public static String LOAN_TYPE = "loan_type";
        public static String QUESTIONS = "Questions";
        public static String CAR = "car";
        public static String HOME_LOAN = "homeloan";
        public static String WEDDING = "wedding";
        public static String WHEELERS = "wheelers";
        public static String QUESTION_ = "question_";
    }
}
