package com.example.classwork;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView resultTv, solutionTv;
    MaterialButton buttonC, buttonBrackOpen, buttonBrackCLose, buttonAC;
    MaterialButton buttonDivide, buttonMultiply, buttonAddition, buttonSubtraction, buttonEquals, buttonDot;
    MaterialButton buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTv = findViewById(R.id.Result_tv);
        solutionTv = findViewById(R.id.Solution_tv);

        assignId(buttonC,R.id.button_C);
        assignId(buttonAC,R.id.button_AC);
        assignId(buttonBrackOpen,R.id.button_Open_bracket);
        assignId(buttonBrackCLose,R.id.button_Closed_bracket);
        assignId(buttonDivide,R.id.button_Divide);
        assignId(buttonMultiply,R.id.button_Multiply);
        assignId(buttonAddition,R.id.button_Addition);
        assignId(buttonSubtraction,R.id.button_Subtraction);
        assignId(buttonEquals,R.id.button_Result);
        assignId(buttonDot,R.id.button_Dot);
        assignId(buttonOne,R.id.button_One);
        assignId(buttonTwo,R.id.button_Two);
        assignId(buttonThree,R.id.button_Three);
        assignId(buttonFour,R.id.button_Four);
        assignId(buttonFive,R.id.button_Five);
        assignId(buttonSix,R.id.button_Six);
        assignId(buttonSeven,R.id.button_Seven);
        assignId(buttonEight,R.id.button_Eight);
        assignId(buttonNine,R.id.button_Nine);
        assignId(buttonZero,R.id.button_Zero);
    }

    void assignId(MaterialButton btn,int id)
    {
        btn = findViewById(id);
        btn.setOnClickListener(this::onClick);
    }


    @Override
    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;

        String buttonText = button.getText().toString();
        String dataToCalculate = solutionTv.getText().toString();

        if (buttonText.equals("AC"))
        {
            solutionTv.setText("");
            resultTv.setText("0");
            return;
        }

        if (buttonText.equals("=")){
            solutionTv.setText(resultTv.getText());
            return;
        }

        if (buttonText.equals("C"))
        {
            dataToCalculate = dataToCalculate.substring(0,dataToCalculate.length()-1);
        }
        else
        {
            dataToCalculate = dataToCalculate+buttonText;
        }


        solutionTv.setText(dataToCalculate);

        String finalResult = getResult(dataToCalculate);

        if (!finalResult.equals("Err"))
        {
            resultTv.setText(finalResult);
        }
    }

    String getResult(String data)
    {
        try {
            org.mozilla.javascript.Context context;
            context = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initStandardObjects();
            String finalResult =  context.evaluateString(scriptable,data,"Javascript",1,null).toString();
            if (finalResult.endsWith(".0"))
            {
                finalResult = finalResult.replace(".0","");
            }
            return finalResult;
        }
        catch (Exception e)
        {
            return "Err";
        }
    }
}





























