package wooyun.setfragment;

import android.os.Build;
import android.os.Bundle;


import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragment;


public class SettingsFragment extends PreferenceFragment {

    private Preference account_management2;
    private Preference account_management3;
    private Preference account_management4;
    private Preference account_management5;

    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.settingprefragment);
        init();
        initView();
    }

    private void initView() {
        account_management2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {

                return false;
            }
        });

        account_management3.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {

                return false;
            }
        });

        account_management4.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {

                return false;
            }
        });

        account_management5.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {

                return false;
            }
        });
    }

    private void init() {
        account_management2 = findPreference("Push_management");
        account_management3 = findPreference("Clear_cache");
        account_management4 = findPreference("feedback");
        account_management5 = findPreference("about_me");
    }
}