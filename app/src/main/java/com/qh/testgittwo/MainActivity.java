package com.qh.testgittwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initView();
    }

    private void initView() {
        Log.i("wtt","测试分支1");
        Log.i("wtt","2测试分支1");
        Log.i("wtt","3测试分支1");
        Log.i("wtt","4测试分支2");
        Log.i("wtt","5测试分支2");
    }
}
