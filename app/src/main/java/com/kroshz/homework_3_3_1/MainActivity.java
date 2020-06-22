package com.kroshz.homework_3_3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import static android.view.View.GONE;


public class MainActivity extends AppCompatActivity {

    private TextView tv_res;
    String res="";
    private FrameLayout fr_normal;
    private ConstraintLayout fr_ing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews() {
        fr_normal=findViewById(R.id.fr_normal);
        fr_ing = findViewById(R.id.fr_ing);
        tv_res = findViewById(R.id.textView);
        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btnCom = findViewById(R.id.btnCom);
        Button btnC = findViewById(R.id.btnC);
        Button btnDrop = findViewById(R.id.btnDrop);
        Button btnPer = findViewById(R.id.btnPer);
        Button btnDiv = findViewById(R.id.btnDiv);
        Button btnMul = findViewById(R.id.btnMul);
        Button btnMin = findViewById(R.id.btnMin);
        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnRes = findViewById(R.id.btnRes);
        Button btnSwitch = findViewById(R.id.btn_switch);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    tv_res.setText("0");
                } else {res = res+0;
                    tv_res.setText(res);
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "1";
                    tv_res.setText(res);
                } else {res = res+1;
                    tv_res.setText(res);
                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "2";
                    tv_res.setText(res);
                } else {res = res+2;
                    tv_res.setText(res);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "3";
                    tv_res.setText(res);
                } else {res = res+3;
                    tv_res.setText(res);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "4";
                    tv_res.setText(res);
                } else {res = res+4;
                    tv_res.setText(res);
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "5";
                    tv_res.setText(res);
                } else {res = res+5;
                    tv_res.setText(res);
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "6";
                    tv_res.setText(res);
                } else {res = res+6;
                    tv_res.setText(res);
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "7";
                    tv_res.setText(res);
                } else {res = res+7;
                    tv_res.setText(res);
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "8";
                    tv_res.setText(res);
                } else {res = res+8;
                    tv_res.setText(res);
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "9";
                    tv_res.setText(res);
                } else {res = res+9;
                    tv_res.setText(res);
                }
            }
        });

        btnCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = ",";
                if (res.isEmpty())  {
                    res = "0,";
                    tv_res.setText(res);
                } else if (res.indexOf(sub) != -1) {
                    tv_res.setText(res);
                } else {res = res+",";
                    tv_res.setText(res);
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = "";
                tv_res.setText("0");
            }
        });

        btnDrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String subMin = "-";
                if (res.indexOf(subMin) != -1) {
                    res=res.substring(1);
                    tv_res.setText(res);
                } else {res = "-"+res;
                    tv_res.setText(res);
                }
            }
        });

        btnPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fr_ing.getVisibility() == View.GONE) {
                    fr_ing.setVisibility(View.VISIBLE);
                } else {fr_ing.setVisibility(View.GONE);}

            }
        });
    }
}
