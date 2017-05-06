package com.example.arjitagarwal.helloworld;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setVariable(BR.namewa, "Arjit");
        binding.setVariable(BR.namewa2, "Pacmdkcm");
    }
}
