package com.thanhcs.loadingcircle;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView amimagetedview = (ImageView)findViewById(R.id.circleimageview);
        final ImageView amimagetedview2 = (ImageView)findViewById(R.id.circleimageview2);
        final Animation anime = AnimationUtils.loadAnimation(this, R.anim.zoomin);
        final Animation anime2 = AnimationUtils.loadAnimation(this, R.anim.zoomin);
        amimagetedview.startAnimation(anime);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                amimagetedview2.startAnimation(anime2);
            }
        }, 1000);
    }
}
