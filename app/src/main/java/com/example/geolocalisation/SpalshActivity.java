package com.example.geolocalisation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowInsetsAnimationController;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class SpalshActivity extends AppCompatActivity {

    WindowInsetsAnimationController mViewModel = null;
    private TextView titre ;
    private ImageView logo ;
    private LottieAnimationView lottieAnimationView  ;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        lottieAnimationView = (LottieAnimationView) findViewById(R.id.lottie_layer_name);
        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {


                Thread t = new Thread() {
                    public void run(){
                        try {
                            sleep(400);
                            Intent intent =new Intent(SpalshActivity.this, MainActivity.class);
                            startActivity(intent);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                };
                t.start();


            }
        });


    }

}
