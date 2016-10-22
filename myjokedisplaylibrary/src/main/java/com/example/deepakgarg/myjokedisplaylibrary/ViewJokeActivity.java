package com.example.deepakgarg.myjokedisplaylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ViewJokeActivity extends AppCompatActivity {
    public static final String INTENT_LABEL="joke";
    String joke;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_joke);

        textView=(TextView)findViewById(R.id.textView);
        joke= getIntent().getStringExtra(INTENT_LABEL);

        textView.setText(joke);
        Toast.makeText(getApplicationContext(),getResources().getString(R.string.toast_message),Toast.LENGTH_SHORT).show();
    }
}
