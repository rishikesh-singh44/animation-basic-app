package com.example.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtAnim;
Button btnTrans, btnRotate,btnScale,btnAlpha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAnim = findViewById(R.id.txtAnim);
        btnTrans= findViewById(R.id.btnTrans);
        btnAlpha=findViewById(R.id.btnAlpha);
        btnRotate=findViewById(R.id.btnRotate);
        btnScale=findViewById(R.id.btnScale);
        Animation move= AnimationUtils.loadAnimation(this,R.anim.move);
        Animation scale= AnimationUtils.loadAnimation(this,R.anim.scale);
        Animation alpha= AnimationUtils.loadAnimation(this,R.anim.alpha);
        Animation rotate= AnimationUtils.loadAnimation(this,R.anim.rotate);

        btnTrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAnim.startAnimation(move);
            }
        });

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAnim.startAnimation(scale);
            }
        });

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAnim.startAnimation(alpha);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAnim.startAnimation(rotate);
            }
        });

    }
}