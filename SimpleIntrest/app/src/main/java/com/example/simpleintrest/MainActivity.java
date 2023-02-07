package com.example.simpleintrest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar sb1, sb2, sb3;
    TextView tv1, amtValue, roiValue, noyValue;
    Integer principal, ROI, Interest, noYear = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sb1 = findViewById(R.id.PA);
        sb2 = findViewById(R.id.IR);
        sb3 = findViewById(R.id.NOY);
        amtValue = findViewById(R.id.tv3);
        roiValue = findViewById(R.id.tv5);
        noyValue = findViewById(R.id.tv7);
        tv1 = findViewById(R.id.result);

        sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                amtValue.setText("Principal: Rs."+i+"Lakhs");
                principal=i;
                ROI=sb2.getProgress();
                noYear=sb3.getProgress();
                Interest=(principal*ROI*noYear/100);
                tv1.setText("Interest : "+Interest+"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                roiValue.setText("Rate of Interest: "+i+"%");
                principal=sb1.getProgress();
                ROI=i;
                noYear=sb3.getProgress();
                Interest=(principal*ROI*noYear/100);
                tv1.setText("Interest : "+Interest+"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                noyValue.setText("No.of Years: "+i+"years");
                principal=sb1.getProgress();
                ROI=sb2.getProgress();
                noYear=i;
                Interest=(principal*ROI*noYear/100);
                tv1.setText("Interest : "+Interest+"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}