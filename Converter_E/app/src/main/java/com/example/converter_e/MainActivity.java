package com.example.converter_e;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numIn;
    TextView result;
    RadioButton outCheck;
    CheckBox biResult, hexResult, octResult, decResult;
    RadioGroup group;
    RadioButton inputFormat;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        group = findViewById(R.id.radioGroup);
        numIn = findViewById(R.id.numInput);
        result = findViewById(R.id.result);
        biResult = findViewById(R.id.binaryOut);
        hexResult = findViewById(R.id.hexaOut);
        octResult = findViewById(R.id.octalOut);
        decResult = findViewById(R.id.decimalOut);
    }
    public void onSubmit(View view) {
        inputFormat = findViewById(group.getCheckedRadioButtonId());
        String format = inputFormat.getText().toString();
        String resultOut = "";
        String num = numIn.getText().toString();
        if(format.equals("Binary")){
            if (isBinary(num)){
                if(decResult.isChecked()){
                    String s = "+Integer.parseInt(String.valueOf(num), 2)+";
                    resultOut = resultOut+"Decimal:"+Integer.parseInt(String.valueOf(num), 2)+"\n";
                }
                if (hexResult.isChecked()){
                    resultOut = resultOut+"Hexadecimal:"+Integer.toHexString(Integer.parseInt(num, 2))+"\n";
                }
                if (octResult.isChecked()){
                    resultOut = resultOut+"Octal:"+Integer.toOctalString(Integer.parseInt(num, 2))+"\n";
                }
                if (biResult.isChecked()){
                    resultOut = resultOut+"Binary: "+num;
                }
            }
        }
        if (format.equals("Hexadecimal")){
            if (isHex(num)){
                if(decResult.isChecked()){
                    resultOut = resultOut+"Decimal: "+Integer.parseInt(num,
                            16)+"\n";
                }
                if (hexResult.isChecked()){
                    resultOut = resultOut+"Hexadecimal: "+num+"\n";
                }
                if (octResult.isChecked()){
                    resultOut = resultOut+"Octal:"+Integer.toOctalString(Integer.parseInt(num, 16))+"\n";
                }
                if (biResult.isChecked()){
                    resultOut = resultOut+"Binary:"+Integer.toBinaryString(Integer.parseInt(num, 16));
                }
            }
        }
        if (format.equals("Decimal")){
            if (isDecimal(num)){
                if(decResult.isChecked()){
                    resultOut = resultOut+"Decimal: "+num+"\n";
                }
                if (hexResult.isChecked()){
                    resultOut = resultOut+"Hexadecimal:"+Integer.toHexString(Integer.parseInt(num, 10))+"\n";
                }
                if (octResult.isChecked()){
                    resultOut = resultOut+"Octal:"+Integer.toOctalString(Integer.parseInt(num, 10))+"\n";
                }
                if (biResult.isChecked()){
                    resultOut = resultOut+"Binary:"+Integer.toBinaryString(Integer.parseInt(num, 10));
                }
            }
        }
        if (format.equals("Octal")){
            if (isOctal(num)){
                if(decResult.isChecked()){
                    resultOut = resultOut+"Decimal: "+Integer.parseInt(num,
                            8)+"\n";
                }
                if (hexResult.isChecked()){
                    resultOut = resultOut+"Hexadecimal:"+Integer.toHexString(Integer.parseInt(num, 8))+"\n";
                }
                if (octResult.isChecked()){
                    resultOut = resultOut+"Octal: "+num+"\n";
                }
                if (biResult.isChecked()){
                    resultOut = resultOut+"Binary:"+Integer.toBinaryString(Integer.parseInt(num, 8));
                }
            }
        }
        result.setText(resultOut);
    }
    boolean isBinary(String num) {
        String binary = Integer.toBinaryString(Integer.parseInt(num));
        for (char c : binary.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
    boolean isHex(String num) {
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || (c >=
                    'a' && c <= 'f'))) {
                return false;
            }
        }
        return true;
    }
    boolean isDecimal(String num) {
        return num.matches("^[0-9]+$");
    }
    boolean isOctal(String num) {
        return num.matches("^[0-7]+$");

    }
}