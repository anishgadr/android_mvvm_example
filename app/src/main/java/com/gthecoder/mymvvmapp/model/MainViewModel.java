package com.gthecoder.mymvvmapp.model;

import android.util.Log;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

     int score = 0;

    public MainViewModel() {
        Log.e("Main","Mainview Model created");
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void increment(){
        score++;
    }

    public void decrement(){
        score--;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.e("mainView Model","Data Cleared");
    }
}
