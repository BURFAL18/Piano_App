package com.example.piano;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    View b1,b2,b3,b4,b5,b6,b7,b8,b9;
    View w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11,w12;
private MediaPlayer mb1,mb2,mb3,mb4,mb5,mb6,mb7,mb8,mb9;
    private MediaPlayer   mw1,mw2,mw3,mw4,mw5,mw6,mw7,mw8,mw9,mw10,mw11,mw12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        w1=findViewById(R.id.w1);
        w2=findViewById(R.id.w2);
        w3=findViewById(R.id.w3);
        w4=findViewById(R.id.w4);
        w5=findViewById(R.id.w5);
        w6=findViewById(R.id.w6);
        w7=findViewById(R.id.w7);
        w8=findViewById(R.id.w8);
        w9=findViewById(R.id.w9);
        w10=findViewById(R.id.w10);
        w11=findViewById(R.id.w11);
        w12=findViewById(R.id.w12);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);


        mw1 = MediaPlayer.create(this, R.raw.w1);
        mw2 = MediaPlayer.create(this, R.raw.w2);
        mw3 = MediaPlayer.create(this, R.raw.w3);
        mw4 = MediaPlayer.create(this, R.raw.w4);
        mw5 = MediaPlayer.create(this, R.raw.w5);
        mw6 = MediaPlayer.create(this, R.raw.w6);
        mw7 = MediaPlayer.create(this, R.raw.w7);
        mw8 = MediaPlayer.create(this, R.raw.w8);
        mw9 = MediaPlayer.create(this, R.raw.w9);
        mw10 = MediaPlayer.create(this, R.raw.w10);
        mw11 = MediaPlayer.create(this, R.raw.w11);
        mw12 = MediaPlayer.create(this, R.raw.w12);

        mb1 = MediaPlayer.create(this, R.raw.t1);
        mb2 = MediaPlayer.create(this, R.raw.t2);
        mb3 = MediaPlayer.create(this, R.raw.t3);
        mb4 = MediaPlayer.create(this, R.raw.t4);
        mb5 = MediaPlayer.create(this, R.raw.t5);
        mb6 = MediaPlayer.create(this, R.raw.t6);
        mb7 = MediaPlayer.create(this, R.raw.t7);
        mb8 = MediaPlayer.create(this, R.raw.t8);
        mb9 = MediaPlayer.create(this, R.raw.t9);

        w1.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mw1.start();
                w1.setBackgroundColor(getColor(R.color.touch));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        w1.setBackgroundColor(getColor(R.color.untouched));
                    }
                }.start();

                return false;
            }
        });

        w2.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mw2.start();
                w2.setBackgroundColor(getColor(R.color.touch));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        w2.setBackgroundColor(getColor(R.color.untouched));
                    }
                }.start();

                return false;
            }
        });

        w3.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mw3.start();
                w3.setBackgroundColor(getColor(R.color.touch));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        w3.setBackgroundColor(getColor(R.color.untouched));
                    }
                }.start();

                return false;
            }
        });

        w4.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mw4.start();
                w4.setBackgroundColor(getColor(R.color.touch));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        w4.setBackgroundColor(getColor(R.color.untouched));
                    }
                }.start();

                return false;
            }
        });


        w5.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mw5.start();
                w5.setBackgroundColor(getColor(R.color.touch));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        w5.setBackgroundColor(getColor(R.color.untouched));
                    }
                }.start();

                return false;
            }
        });
        w6.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mw6.start();
                w6.setBackgroundColor(getColor(R.color.touch));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        w6.setBackgroundColor(getColor(R.color.untouched));
                    }
                }.start();

                return false;
            }
        });
        w7.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mw7.start();
                w7.setBackgroundColor(getColor(R.color.touch));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        w7.setBackgroundColor(getColor(R.color.untouched));
                    }
                }.start();

                return false;
            }
        });
        w8.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mw8.start();
                w8.setBackgroundColor(getColor(R.color.touch));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        w8.setBackgroundColor(getColor(R.color.untouched));
                    }
                }.start();

                return false;
            }
        });

        w9.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mw9.start();
                w9.setBackgroundColor(getColor(R.color.touch));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        w9.setBackgroundColor(getColor(R.color.untouched));
                    }
                }.start();

                return false;
            }
        });

        w10.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mw10.start();
                w10.setBackgroundColor(getColor(R.color.touch));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        w10.setBackgroundColor(getColor(R.color.untouched));
                    }
                }.start();

                return false;
            }
        });
        w11.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mw11.start();
                w11.setBackgroundColor(getColor(R.color.touch));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        w11.setBackgroundColor(getColor(R.color.untouched));
                    }
                }.start();

                return false;
            }
        });
        w12.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mw12.start();
                w12.setBackgroundColor(getColor(R.color.touch));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        w12.setBackgroundColor(getColor(R.color.untouched));
                    }
                }.start();

                return false;
            }
        });

        //black keys
        b1.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mb1.start();
                b1.setBackgroundColor(getColor(R.color.Btouched));
                b1.setEnabled(false);

                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        b1.setEnabled(true);
                        b1.setBackgroundColor(getColor(R.color.Buntouched));
                    }
                }.start();

                return false;
            }
        });

        b2.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mb2.start();
                b2.setBackgroundColor(getColor(R.color.Btouched));
                b2.setEnabled(false);

                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        b2.setEnabled(true);
                        b2.setBackgroundColor(getColor(R.color.Buntouched));
                    }
                }.start();

                return false;
            }
        });
        b3.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mb3.start();
                b3.setBackgroundColor(getColor(R.color.Btouched));
                b3.setEnabled(false);

                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        b3.setEnabled(true);
                        b3.setBackgroundColor(getColor(R.color.Buntouched));
                    }
                }.start();

                return false;
            }
        });
        b4.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mb4.start();
                b4.setBackgroundColor(getColor(R.color.Btouched));
                b4.setEnabled(false);

                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        b4.setEnabled(true);
                        b4.setBackgroundColor(getColor(R.color.Buntouched));
                    }
                }.start();

                return false;
            }
        });
        b5.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mb5.start();
                b5.setBackgroundColor(getColor(R.color.Btouched));
                b5.setEnabled(false);

                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        b5.setEnabled(true);
                        b5.setBackgroundColor(getColor(R.color.Buntouched));
                    }
                }.start();

                return false;
            }
        });
        b6.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mb6.start();
                b6.setBackgroundColor(getColor(R.color.Btouched));
                b6.setEnabled(false);

                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        b6.setEnabled(true);
                        b6.setBackgroundColor(getColor(R.color.Buntouched));
                    }
                }.start();

                return false;
            }
        });
        b7.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mb7.start();
                b7.setBackgroundColor(getColor(R.color.Btouched));
                b7.setEnabled(false);

                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        b7.setEnabled(true);
                        b7.setBackgroundColor(getColor(R.color.Buntouched));
                    }
                }.start();

                return false;
            }
        });
        b8.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mb8.start();
                b8.setBackgroundColor(getColor(R.color.Btouched));
                b8.setEnabled(false);

                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        b8.setEnabled(true);
                        b8.setBackgroundColor(getColor(R.color.Buntouched));
                    }
                }.start();

                return false;
            }
        });
        b9.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mb9.start();
                b9.setBackgroundColor(getColor(R.color.Btouched));
                b9.setEnabled(false);

                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        b9.setEnabled(true);
                        b9.setBackgroundColor(getColor(R.color.Buntouched));
                    }
                }.start();

                return false;
            }
        });




    }

}