package com.example.addwe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;

    private TextView textView3;

    private EditText editTextTextPersonName;
    private EditText editTextTextPersonName2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);

        textView3 = findViewById(R.id.textView3);

        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String checkStr = editTextTextPersonName.getText().toString();
                String checkStr2 = editTextTextPersonName2.getText().toString();


                boolean c11 = checkStr.isEmpty();
                boolean c22 = checkStr2.isEmpty();

                if(c11 || c22) {

                    textView3.setText("Enter the Values");

                }else {

                    String dVal1 = editTextTextPersonName.getText().toString();
                    String dVal2 = editTextTextPersonName2.getText().toString();

                    int dVal11 = Integer.parseInt(dVal2);
                    int dVal22 = Integer.parseInt(dVal1);

                    double divi = (double) dVal11 / (double)dVal22;

                    textView3.setText("Answer is  =  " + divi);

                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String checkStr = editTextTextPersonName.getText().toString();
                String checkStr2 = editTextTextPersonName2.getText().toString();

                boolean c11 = checkStr.isEmpty();
                boolean c22 = checkStr2.isEmpty();

                if(c11 || c22) {

                    textView3.setText("Enter the Values");

                }else {

                    String sVal1 = editTextTextPersonName.getText().toString();
                    String sVal2 = editTextTextPersonName2.getText().toString();

                    int sVal11 = Integer.parseInt(sVal2);
                    int sVal22 = Integer.parseInt(sVal1);

                    double sub = (double) sVal11 - (double)sVal22;

                    textView3.setText("Answer is  =  " + sub);

                }


            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String checkStr = editTextTextPersonName.getText().toString();
                String checkStr2 = editTextTextPersonName2.getText().toString();

                boolean c11 = checkStr.isEmpty();
                boolean c22 = checkStr2.isEmpty();

                if(c11 || c22) {

                    textView3.setText("Enter the Values");

                }else {

                    String aVal1 = editTextTextPersonName.getText().toString();
                    String aVal2 = editTextTextPersonName2.getText().toString();

                    int aVal11 = Integer.parseInt(aVal2);
                    int aVal22 = Integer.parseInt(aVal1);

                    double addi = (double)aVal11 + (double)aVal22;

                    textView3.setText("Answer is  =  " + addi);

                }

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String checkStr = editTextTextPersonName.getText().toString();
                String checkStr2 = editTextTextPersonName2.getText().toString();

                boolean c11 = checkStr.isEmpty();
                boolean c22 = checkStr2.isEmpty();

                if(c11 || c22) {

                    textView3.setText("Enter the Values");

                }else {

                    String mVal1 = editTextTextPersonName.getText().toString();
                    String mVal2 = editTextTextPersonName2.getText().toString();

                    int mVal11 = Integer.parseInt(mVal2);
                    int mVal22 = Integer.parseInt(mVal1);

                    double multi = (double) mVal11 * (double)mVal22;

                    textView3.setText("Answer is  =  " + multi);

                }

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String checkStr = editTextTextPersonName.getText().toString();
                String checkStr2 = editTextTextPersonName2.getText().toString();

                boolean c11 = checkStr.isEmpty();
                boolean c22 = checkStr2.isEmpty();

                if(c11 || c22) {

                    textView3.setText("Enter the Values");

                }else {

                    String moVal1 = editTextTextPersonName.getText().toString();
                    String moVal2 = editTextTextPersonName2.getText().toString();

                    int moVal11 = Integer.parseInt(moVal2);
                    int moVal22 = Integer.parseInt(moVal1);

                    double mod = (double) moVal11 % (double)moVal22;

                    textView3.setText("Answer is  =  " + mod);

                }

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String checkStr = editTextTextPersonName.getText().toString();
                String checkStr2 = editTextTextPersonName2.getText().toString();

                boolean c11 = checkStr.isEmpty();
                boolean c22 = checkStr2.isEmpty();

                if(c11 || c22) {

                    textView3.setText("Enter the Values");

                }else {

                    String prVal1 = editTextTextPersonName.getText().toString();
                    String prVal2 = editTextTextPersonName2.getText().toString();

                    int prVal11 = Integer.parseInt(prVal1);
                    int prVal22 = Integer.parseInt(prVal2);

                    double prcnt = ( (double) prVal11  * 100 ) / (double)prVal22 ;

                    textView3.setText("Answer is  =  " + String.format("%.2f", prcnt) + " %");

                }


            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String checkStr = editTextTextPersonName.getText().toString();
                String checkStr2 = editTextTextPersonName2.getText().toString();

                boolean c11 = checkStr.isEmpty();
                boolean c22 = checkStr2.isEmpty();

                if(c11 || c22) {

                    textView3.setText("Enter the Values");

                }else {

                    editTextTextPersonName.setText("");
                    editTextTextPersonName2.setText("");

                }



            }
        });











    }
}