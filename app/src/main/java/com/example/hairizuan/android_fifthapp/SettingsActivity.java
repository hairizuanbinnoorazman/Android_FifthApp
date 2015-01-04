package com.example.hairizuan.android_fifthapp;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Hairizuan on 4/1/2015.
 */
public class SettingsActivity extends PreferenceActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferences);

    }
}
