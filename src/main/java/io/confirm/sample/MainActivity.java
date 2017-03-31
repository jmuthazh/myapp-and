package io.confirm.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";

	//private StartFragment mFragment = null;
    private IntroFragment mFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG, "*** MainActivity::onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        mFragment = new IntroFragment();

        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, mFragment)
                    .commit();
        }

        /*super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_start);

        mFragment = new StartFragment();

        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, mFragment)
                    .commit();
        }*/
    }
}