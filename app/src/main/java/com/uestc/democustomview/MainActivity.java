package com.uestc.democustomview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SignView signView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signView = findViewById(R.id.sign_view);
    }

    public void clear(View view) {
        signView.clearDraw();
    }
}
