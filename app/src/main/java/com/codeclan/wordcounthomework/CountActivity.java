package com.codeclan.wordcounthomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {

    TextView finalCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        finalCount = (TextView)findViewById(R.id.final_count);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String count = extras.getString("count");

        finalCount.setText(count);

    }
}
