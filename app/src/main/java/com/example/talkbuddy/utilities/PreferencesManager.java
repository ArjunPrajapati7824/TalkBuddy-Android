package com.example.talkbuddy.utilities;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesManager {

    private SharedPreferences sharedPreferences;

    public PreferencesManager(Context context){
        //set preference when object is created
        sharedPreferences=context.getSharedPreferences(Constants.KEY_PREFERENCE_NAME,context.MODE_PRIVATE);
    }


    public void putBoolean(String key,Boolean value){
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putBoolean(key,value);
        editor.apply();
    }

    public boolean getBoolean(String key){
        return sharedPreferences.getBoolean(key,false);
    }

    public void putString(String key,String value){
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putString(key,value);
        editor.apply();
    }

    public String getString(String key){
        return sharedPreferences.getString(key,null);
    }

    public void clear(){

        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }
}
