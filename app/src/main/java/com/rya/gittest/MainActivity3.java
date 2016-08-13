package com.rya.gittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Hello...Good");
        Toast.makeText(getApplicationContext(), "ryaHere!~", Toast.LENGTH_LONG).show();

        System.out.println("Hello...Good World!~");
    }
}
