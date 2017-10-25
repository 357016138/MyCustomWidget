package com.song.mywidget.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.song.mywidget.R;
import com.song.mywidget.widget.MyLayer;

public class LayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyLayer(this));
    }
}
