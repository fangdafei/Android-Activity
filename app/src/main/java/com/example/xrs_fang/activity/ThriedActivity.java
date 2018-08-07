package com.example.xrs_fang.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThriedActivity extends AppCompatActivity {

    private Button button3;
    private EditText editText3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thried);

        button3 = (Button)findViewById(R.id.button);
        editText3 = (EditText)findViewById(R.id.edittext3);


    }

    public void button3click(View view){

        String str = editText3.getText().toString();

        System.out.println("返回的值------"+str);

        Intent it3 = new Intent();
        it3.putExtra(getString(R.string.threekey),str);//将值回传回去

        //通过intent对象返回结果，必须要调用一个setResult方法。setResult(resultCode, data);第一个参数：返回码，一般只要大于1就可以
        setResult(2,it3);

        //结束当前的activity的生命周期
        finish();
    }


}
