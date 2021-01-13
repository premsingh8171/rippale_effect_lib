package com.premsinghdaksha.rippaleeffectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.premsinghdaksha.rippale_effect_lib.RippleEffectView;

public class MainActivity extends AppCompatActivity {
    RippleEffectView effectView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        effectView = findViewById(R.id.rippaleEffect_Id);
        effectView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"RippaleEffect",Toast.LENGTH_LONG);
            }
        });
    }
}