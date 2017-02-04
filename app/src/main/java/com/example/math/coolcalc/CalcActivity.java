package com.example.math.coolcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Objects;

public class CalcActivity extends Activity implements View.OnClickListener{
    TextView mResultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

//        Operations Buttons
        mResultTextView = (TextView) findViewById(R.id.result);
        ImageButton equalBtn = (ImageButton) findViewById(R.id.equal);
        ImageButton divideBtn = (ImageButton) findViewById(R.id.divide);
        ImageButton multiplyBtn = (ImageButton) findViewById(R.id.multiply);
        ImageButton addBtn = (ImageButton) findViewById(R.id.add);
        ImageButton subtractBtn = (ImageButton) findViewById(R.id.subtract);

//        numbers Buttons
        Button num_0 = (Button) findViewById(R.id.num_0);
        Button num_1 = (Button) findViewById(R.id.num_1);
        Button num_2 = (Button) findViewById(R.id.num_2);
        Button num_3 = (Button) findViewById(R.id.num_3);
        Button num_4 = (Button) findViewById(R.id.num_4);
        Button num_5 = (Button) findViewById(R.id.num_5);
        Button num_6 = (Button) findViewById(R.id.num_6);
        Button num_7 = (Button) findViewById(R.id.num_7);
        Button num_8 = (Button) findViewById(R.id.num_8);
        Button num_9 = (Button) findViewById(R.id.num_9);

//        Clear Button
        Button clearBnt= (Button) findViewById(R.id.clear);
        clearBnt.setOnClickListener(this);

//        Setting Click listener to numbers
        num_0.setOnClickListener(this);
        num_1.setOnClickListener(this);
        num_2.setOnClickListener(this);
        num_3.setOnClickListener(this);
        num_4.setOnClickListener(this);
        num_5.setOnClickListener(this);
        num_6.setOnClickListener(this);
        num_7.setOnClickListener(this);
        num_8.setOnClickListener(this);
        num_9.setOnClickListener(this);

//        Setting Click Listener to operations buttons
        equalBtn.setOnClickListener(this);
        divideBtn.setOnClickListener(this);
        multiplyBtn.setOnClickListener(this);
        addBtn.setOnClickListener(this);
        subtractBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String resultText = mResultTextView.getText().toString();

        switch (v.getId()){
            case R.id.num_0:
                setResultText(resultText, "0");
                break;
            case R.id.num_1:
                setResultText(resultText, "1");
                break;
            case R.id.num_2:
                setResultText(resultText, "2");
                break;
            case R.id.num_3:
                setResultText(resultText, "3");
                break;
            case R.id.num_4:
                setResultText(resultText, "4");
                break;
            case R.id.num_5:
                setResultText(resultText, "5");
                break;
            case R.id.num_6:
                setResultText(resultText, "6");
                break;
            case R.id.num_7:
                setResultText(resultText, "7");
                break;
            case R.id.num_8:
                setResultText(resultText, "8");
                break;
            case R.id.num_9:
                setResultText(resultText, "9");
                break;
            case R.id.clear:
                mResultTextView.setText("0");
                break;
            case R.id.equal:
//                mResultTextView.setText("0");
                break;
            case R.id.divide:
//                mResultTextView.setText("0");
                break;
            case R.id.subtract:
//                mResultTextView.setText("0");
                break;
            case R.id.add:

                break;
            case R.id.multiply:
//                mResultTextView.setText("0");
                break;
        }
    }

    private void setResultText(String resultText, String text){
        if (Objects.equals(resultText, "0")){
            resultText = text;
        }else{
            resultText += text;
        }

        mResultTextView.setText(resultText);
    }
}
