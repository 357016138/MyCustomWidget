package com.song.mywidget.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.song.mywidget.R;
import com.song.mywidget.widget.Clock;
import com.song.mywidget.widget.MySurfaceView;

public class MySurfaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MySurfaceView(this));
    }
}
