package com.example.arjitagarwal.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.slf4j.LoggerFactory

class BActivity : AppCompatActivity() {

    companion object {
        val logger = LoggerFactory.getLogger(BActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logger.debug("onCreateCalled Activity B")
        setContentView(R.layout.activity_b)
        val s = intent.getStringExtra("Hell")
        val tv = findViewById(R.id.tv) as TextView
        logger.warn("Text obtained! haha")
        tv.text = s
    }

    override fun onResume() {
        super.onResume()
        logger.debug("onResumeCalled Activity B")
    }

    override fun onPause() {
        super.onPause()
        logger.debug("onPauseCalled Activity B")
    }

    override fun onStop() {
        super.onStop()
        logger.debug("onStopCalled Activity B")
    }
}
