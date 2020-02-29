package com.sourav.localstorage.prefs;


    import android.content.Context;
import android.content.SharedPreferences;

    public class Prefs {

        private static final String EMPLOYEE_USER= "employee";
        private static final String EMPLOYEE_USERNAME = "employee_UserName";
        private static final String EMPLOYEE_PASSWORD= "employee_Password";


        public static void  saveEmployeeName(Context context, String name){
            SharedPreferences sharedPreferences = context.getSharedPreferences(EMPLOYEE_USER, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(EMPLOYEE_USERNAME, name).apply();
        }

        public static String getEmployeeUsername(Context context) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(EMPLOYEE_USER, Context.MODE_PRIVATE);
            return sharedPreferences.getString(EMPLOYEE_USERNAME, "null");

        }

        public static void  saveEmployeePassword (Context context, String username){
            SharedPreferences sharedPreferences = context.getSharedPreferences(EMPLOYEE_USER, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(EMPLOYEE_PASSWORD, username).apply();
        }

        public static String getEmployeePassword(Context context) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(EMPLOYEE_USER, Context.MODE_PRIVATE);
            return sharedPreferences.getString(EMPLOYEE_PASSWORD, "null");

        }


    }

