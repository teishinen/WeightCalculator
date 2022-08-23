package com.example.weightcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton man;
    EditText height;
    Button login;
    String sex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        man = findViewById(R.id.radio1);
        height = findViewById(R.id.editText1);
        login = findViewById(R.id.button3);
        login.setOnClickListener(new View.OnClickListener() {
            //切换计算页面
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CaculateActivity.class);
                if(man.isChecked()){
                    sex = "男";
                }else {
                    sex = "女";
                }
                //数据的传递
                intent.putExtra("sex", sex);
                intent.putExtra("height", Integer.parseInt(height.getText().toString()));  //转换成整形
                startActivity(intent);
            }
        });
    }
}