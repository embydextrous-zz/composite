package com.example.arjitagarwal.myapplication;

import android.app.Application;
import android.util.Log;

import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;

/**
 * Created by ArjitAgarwal on 5/3/17.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        configureLogbackByFilePath();
    }

    private void configureLogbackByFilePath() {
        // reset the default context (which may already have been initialized)
        // since we want to reconfigure it
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        lc.reset();

        JoranConfigurator config = new JoranConfigurator();
        config.setContext(lc);

        try {
            InputStream stream = getAssets().open("logback.xml");
            config.doConfigure(stream);
        } catch (JoranException|IOException e) {
            e.printStackTrace();
        }
    }
}
