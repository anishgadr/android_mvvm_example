package com.gthecoder.mymvvmapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gthecoder.mymvvmapp.databinding.ActivityMainBinding;
import com.gthecoder.mymvvmapp.model.MainViewModel;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    private MainViewModel mainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        activityMainBinding.text.setText(String.valueOf(mainViewModel.getScore()));
        activityMainBinding.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainViewModel.increment();
                activityMainBinding.text.setText(String.valueOf(mainViewModel.getScore()));
            }
        });

        activityMainBinding.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 mainViewModel.decrement();
                activityMainBinding.text.setText(String.valueOf(mainViewModel.getScore()));
            }
        });
    }
}