package com.example.arjitagarwal.helloworld;


import android.databinding.BindingAdapter;
import android.view.View;


public class BindingAdapterA {

    @BindingAdapter({"app:onClick", "app:eventName"})
    public static void setColorChangeListener(final View view,
                                              View.OnClickListener newListener,
                                              String eventName) {
        CompositeClickListener c = new CompositeClickListener();
        c.addOnClickListener(newListener);
        View.OnClickListener a = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(view.getContext(), eventName, Toast.LENGTH_SHORT).show();
            }
        };
        c.addOnClickListener(a);
        view.setOnClickListener(c);
    }


}
