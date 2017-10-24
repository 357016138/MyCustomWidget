package com.song.mywidget.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.song.mywidget.R;
import com.song.mywidget.widget.Clock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ClockActivity.class));
            }
        });

//        TextView textView = (TextView) findViewById(R.id.text1);
//        String systemInfoStr = SystemInfoTools.getBuildInfo();
//        systemInfoStr += "-------------------------------------\r\n";
//        systemInfoStr += SystemInfoTools.getSystemPropertyInfo();
//        textView.setText(systemInfoStr);




    }
}
