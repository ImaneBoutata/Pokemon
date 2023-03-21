package com.example.pokemon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.pokemon.databinding.ActivityFairyCardBinding;
import com.example.pokemon.databinding.ActivityMainBinding;

import java.time.temporal.ValueRange;

public class fairyCard extends AppCompatActivity {

    ActivityFairyCardBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fairy_card);
        binding = ActivityFairyCardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        startAnimationCounter(0,60);
    }

    private void startAnimationCounter(int start_no ,int end_no){
        ValueAnimator animator = ValueAnimator.ofInt(start_no, end_no);
        animator.setDuration(5000);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                 binding.tvcounter.setText(animation.getAnimatedValue().toString()+"");
                binding.progressbar.setProgress(Integer.parseInt(animation.getAnimatedValue().toString()));
                animator.start();
            }
        });

    }

    @Override
    protected void onDestroy(){
    super.onDestroy();
    binding=null;}
}