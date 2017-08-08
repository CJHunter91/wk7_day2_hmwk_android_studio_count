package com.codeclan.wordcounthomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class EditText extends AppCompatActivity {

    TextView textString;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        textString = (TextView) findViewById(R.id.edit_text);
        button = (Button) findViewById(R.id.button);

    }

    public void onClick(){
        Log.d("Text:", "The text in the box is" + textString.getText().toString());
    }
}
