package app.recorder.audiorecorder.activities;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import app.recorder.audiorecorder.R;

public class PrefsActivity extends PreferenceActivity {
    //CREAR EL MENÚ DE PREFERENCIAS
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
    }
}