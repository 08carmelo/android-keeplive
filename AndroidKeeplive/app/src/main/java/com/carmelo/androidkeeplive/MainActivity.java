package com.carmelo.androidkeeplive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.carmelo.library.SettingUtils;

public class MainActivity extends Activity {

    private Button startBtn;

    private Button settingBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("keeplive","MainActivity process = " + android.os.Process.myPid());

        startBtn = (Button) findViewById(R.id.btn1);

        settingBtn = (Button) findViewById(R.id.btn2);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(MainActivity.this,DemoService.class));
            }
        });

        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SettingUtils.enterWhiteListSetting(MainActivity.this);
            }
        });
    }
}
