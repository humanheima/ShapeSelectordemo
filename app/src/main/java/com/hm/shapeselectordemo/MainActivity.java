package com.hm.shapeselectordemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.Button1)
    Button Button1;
    @BindView(R.id.activity_main)
    ScrollView activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.Button1)
    public void onClick() {
        Toast.makeText(this, "button1 was clicked", Toast.LENGTH_SHORT).show();
    }
}
