package com.example.xrs_fang.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class TwoActivity extends AppCompatActivity {

    private TextView tv2;

    private final static int REQUESTCODE = 1; // 返回的结果码

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twoactivity);

        Log.e("tag", "onCreate: ");


        Bundle bundle = getIntent().getExtras();

        String commonkey = getResources().getString(R.string.activity1key);//R.string.activity1key--string文件定义的key值
        String info = bundle.getString(commonkey);

        tv2 = (TextView)findViewById(R.id.textview2);
        tv2.setText(info);


    }


    public void twoclick(View v){
        Intent it = new Intent(this, ThriedActivity.class);
//        startActivity(it); // 这种启动方式并不能返回结果

        startActivityForResult(it, REQUESTCODE); //REQUESTCODE--->1

    }


    // 为了获取结果--重写onActivityResult方法
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.e("requestCode", String.valueOf(requestCode));//1
        Log.e("resultCode", String.valueOf(resultCode));//2
        Log.e("data", String.valueOf(data));


        if (requestCode ==1 && resultCode ==2){

            tv2.setText(data.getStringExtra(getString(R.string.threekey)));

        }

    }

}