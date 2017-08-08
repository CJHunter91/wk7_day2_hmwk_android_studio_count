package com.codeclan.wordcounthomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

    public void onButtonClicked(View button){
        String userString = textString.getText().toString();
        String count = Integer.toString(WordCount.getCount(userString));
        Log.d("Text:", "The text in the box is " + userString );
        Log.d("Count:", "The word count is" + count );

        Intent intent = new Intent(this, CountActivity.class);
        intent.putExtra("count", count);
        startActivity(intent);
    }
}
