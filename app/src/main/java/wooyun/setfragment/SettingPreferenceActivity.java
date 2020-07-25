package wooyun.setfragment;

import android.app.Activity;
import android.os.Bundle;



public class SettingPreferenceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_preference);
        getFragmentManager().beginTransaction()
                .replace(R.id.fm_pref, new SettingsFragment()).commit();
    }

}
