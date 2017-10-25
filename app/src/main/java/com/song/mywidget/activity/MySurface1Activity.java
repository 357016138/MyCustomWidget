package com.song.mywidget.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.song.mywidget.R;
import com.song.mywidget.widget.MySurfaceView;
import com.song.mywidget.widget.MySurfaceView1;

public class MySurface1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MySurfaceView1(this));
    }
}
