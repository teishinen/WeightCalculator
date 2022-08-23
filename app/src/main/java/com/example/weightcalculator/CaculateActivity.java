package com.example.weightcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CaculateActivity extends AppCompatActivity {
    TextView result;
    double weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caculate);
        result = findViewById(R.id.show);
        Intent intent = getIntent();
        String sex = intent.getStringExtra("sex");
        int height = intent.getIntExtra("height", 170);  //默认值170
        //计算体重
        if (sex.equals("男")){
            weight = (height - 80) * 0.7;     //男生体重
        }else{
            weight = (height - 70) * 0.6;     //女生体重
        }
        //输出结果保留小数点后两位
        String resultString = weight + "";
        if (resultString.length() > 5){
            resultString = resultString.substring(0, 5);
        }
        //将性别和身高的值放到result里面
        result.setText("您的性别是：" + sex + "\n 您的体重是：" + resultString);
    }
}