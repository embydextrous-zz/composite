package com.example.arjitagarwal.helloworld;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class CompositeClickListener implements View.OnClickListener {

    private List<View.OnClickListener> listeners = new ArrayList<>();

    public void addOnClickListener(View.OnClickListener listener){
        listeners.add(listener);
    }

    @Override
    public void onClick(View v){
        for(View.OnClickListener listener : listeners){
            listener.onClick(v);
        }
    }

}
