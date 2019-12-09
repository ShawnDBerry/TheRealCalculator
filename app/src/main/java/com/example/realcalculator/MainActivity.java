package com.example.realcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private int valueHolder = 0;
    private int operator = 0;
    private int answer;
    private String newText;
    private boolean operationDone;

    private final int ADDITION = 1;
    private final int SUBTRACTION = 2;
    private final int MULTIPLY = 3;
    private final int DIVIDE = 4;
    private final int PERCENTAGE = 5;


    private TextView calculatorText;

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculatorText = findViewById(R.id.text1Son);
        operationDone = false;

        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    public void buClick(View view){
        newText = "";

        switch (view.getId()){
            case R.id.one_button:
                if(calculatorText.getText().toString().trim().equals("0"))
                    calculatorText.setText(newText);

                if (operationDone)
                    operationDone = false;
                    calculatorText.setText(newText);

                newText = calculatorText.getText().toString().trim() + 1;
                calculatorText.setText(newText);
                break;

            case R.id.two_button:
                if(calculatorText.getText().toString().trim().equals("0"))
                    calculatorText.setText(newText);

                if (operationDone)
                    operationDone = false;
                    calculatorText.setText(newText);

                newText = calculatorText.getText().toString().trim() + 2;
                calculatorText.setText(newText);
                break;

            case R.id.three_button:
                if(calculatorText.getText().toString().trim().equals("0"))
                    calculatorText.setText(newText);

                if (operationDone)
                    operationDone = false;
                    calculatorText.setText(newText);

                newText = calculatorText.getText().toString().trim() + 3;
                calculatorText.setText(newText);
                break;

            case R.id.four_button:
                if(calculatorText.getText().toString().trim().equals("0"))
                    calculatorText.setText(newText);

                if (operationDone)
                    operationDone = false;
                    calculatorText.setText(newText);

                newText = calculatorText.getText().toString().trim() + 4;
                calculatorText.setText(newText);
                break;

            case R.id.five_button:
                if(calculatorText.getText().toString().trim().equals("0"))
                    calculatorText.setText(newText);

                if (operationDone)
                    operationDone = false;
                    calculatorText.setText(newText);

                newText = calculatorText.getText().toString().trim() + 5;
                calculatorText.setText(newText);
                break;

            case R.id.six_button:
                if(calculatorText.getText().toString().trim().equals("0"))
                    calculatorText.setText(newText);

                if (operationDone)
                    operationDone = false;
                    calculatorText.setText(newText);

                newText = calculatorText.getText().toString().trim() + 6;
                calculatorText.setText(newText);
                break;

            case R.id.seven_button:
                if(calculatorText.getText().toString().trim().equals("0"))
                    calculatorText.setText(newText);

                if (operationDone)
                    operationDone = false;
                    calculatorText.setText(newText);

                newText = calculatorText.getText().toString().trim() + 7;
                calculatorText.setText(newText);
                break;

            case R.id.eight_button:
                if(calculatorText.getText().toString().trim().equals("0"))
                    calculatorText.setText(newText);

                if (operationDone)
                    operationDone = false;
                    calculatorText.setText(newText);

                newText = calculatorText.getText().toString().trim() + 8;
                calculatorText.setText(newText);
                break;

            case R.id.nine_button:
                if(calculatorText.getText().toString().trim().equals("0"))
                    calculatorText.setText(newText);

                if (operationDone)
                    operationDone = false;
                    calculatorText.setText(newText);

                newText = calculatorText.getText().toString().trim() + 9;
                calculatorText.setText(newText);
                break;

            case R.id.zero_button:
                if(calculatorText.getText().toString().trim().equals("0"))
                    calculatorText.setText(newText);

                if (operationDone)
                    operationDone = false;
                    calculatorText.setText(newText);

                newText = calculatorText.getText().toString().trim() + 0;
                calculatorText.setText(newText);
                break;

            /*case R.id.period_button:
                if(calculatorText.getText().toString().trim().equals("0"))
                    calculatorText.setText(newText);

                newText = calculatorText.getText().toString().trim() + ".";
                calculatorText.setText(newText);
                break;*/

            case R.id.ac_button:
                operationDone = false;
                calculatorText.setText("0");
                break;

            case R.id.negation_button:
                String addNegative = "-";
                String newNegString = addNegative+calculatorText.getText().toString();

                if(calculatorText.getText().toString().trim().equals("0")){
                    String removeNegative = calculatorText.getText().toString().replace("-", "");
                    calculatorText.setText(removeNegative);

                }
                else if(calculatorText.getText().toString().trim() != "0" && calculatorText.getText().charAt(0) == '-'){
                    String removeNegative = calculatorText.getText().toString().replace("-", "");
                    calculatorText.setText(removeNegative);
                }
                else if(calculatorText.getText().toString().trim() != "0" && calculatorText.getText().charAt(0) != '-') {
                    calculatorText.setText(newNegString);
                    Log.d("negative number", newNegString);
                }

                break;

            case R.id.addition_button:
                valueHolder = Integer.parseInt(calculatorText.getText().toString());
                operator = ADDITION;
                calculatorText.setText("0");
                break;

            case R.id.subtract_button:
                valueHolder = Integer.parseInt(calculatorText.getText().toString());
                operator = SUBTRACTION;
                calculatorText.setText("0");
                break;

            case R.id.multiply_button:
                valueHolder = Integer.parseInt(calculatorText.getText().toString());
                operator = MULTIPLY;
                calculatorText.setText("0");
                break;

            case R.id.division_button:
                valueHolder = Integer.parseInt(calculatorText.getText().toString());
                operator = DIVIDE;
                calculatorText.setText("0");
                break;

            case R.id.percent_button:
                valueHolder = Integer.parseInt(calculatorText.getText().toString());
                operator = PERCENTAGE;
                calculatorText.setText("0");
                break;

            case R.id.equals_button:

                int currentValue = Integer.parseInt(calculatorText.getText().toString());

                if(!operationDone){
                    Calculate(operator, currentValue);
                    operationDone = true;
                }
                else if(operationDone && calculatorText.getText().equals(answer)){
                calculatorText.getText();
                }

                break;

        }




    }
    public void Calculate(int operater, int secondValue){
        if(operationDone) {
            calculatorText.setText(newText);
        }

        answer = 0;
        switch (operater){
            case ADDITION:
                answer = valueHolder + secondValue;
               calculatorText.setText(answer + "");
               break;

            case SUBTRACTION:
                answer = valueHolder - secondValue;
                calculatorText.setText(answer + "");
                break;

            case MULTIPLY:
                answer = valueHolder * secondValue;
                calculatorText.setText(answer + "");
                break;

            case DIVIDE:
                answer = valueHolder / secondValue;
                calculatorText.setText(answer + "");
                break;

            case PERCENTAGE:
                answer = valueHolder % secondValue;
                calculatorText.setText(answer + "");
                break;


        }
    }
}
