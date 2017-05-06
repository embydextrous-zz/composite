package com.example.arjitagarwal.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainActivity extends AppCompatActivity {

    private final static Logger logger = LoggerFactory.getLogger(MainActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        logger.debug("onCreateCalled Activity A");
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BActivity.class);
                i.putExtra("Hell", "Haily");
                logger.debug("Button pressed");
                logger.error("New Activity Called");
                startActivity(i);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        logger.debug("onResumeCalled Activity A");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logger.debug("onPauseCalled Activity A");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logger.debug("onStopCalled Activity A");
    }
}
