package com.example.rahul.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    Button bt;
    Firebase url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        url = new Firebase("https://example-da4d1.firebaseio.com/");
        bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Firebase firebase = url.child("name");
                firebase.setValue("i am rahul");
            }
        });
    }
}

