package com.example.xrs_fang.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //定义文本框
    private EditText editText;
//    生命周期
    //创建
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "onCreate: " );

        editText = (EditText) findViewById(R.id.edittext1);


    }
//
//    //复写
//    //开始
//    @Override
//    protected void onStart(){
//        super.onStart();
//        Log.e(TAG, "onStart: ");
//    }
//
//    //继续
//    @Override
//    protected void onResume(){
//        super.onResume();
//        Log.e(TAG, "onResume: ");
//    }
//
//
//    //暂停
//    @Override
//    protected void onPause(){
//        super.onPause();
//        Log.e(TAG, "onPause: ");
//    }
//
//    //停止
//    @Override
//    protected void onStop(){
//        super.onStop();
//        Log.e(TAG, "onStop: ");
//    }
//
//    //重新开始
//    @Override
//    protected void onRestart(){
//        super.onStart();
//        Log.e(TAG, "onStart: ");
//    }
//
//    //销毁
//    @Override
//    protected void onDestroy(){
//        super.onDestroy();
//        Log.e(TAG, "onDestroy: ");
//    }

    //跳转activity传值
    public void textviewclick(View view){
        Log.e(TAG, "textviewclick: " );

        Intent it1 = new Intent(this, TwoActivity.class);

        editText = (EditText)findViewById(R.id.edittext1);
        String info = editText.getText().toString();
        String comnonkey = getResources().getString(R.string.activity1key);
        it1.putExtra(comnonkey,info);

        startActivity(it1);

    }



    //发送广播
    public void textviewclick2(View view){
        Log.e("tag", "textviewclick2: ");

        //发送广播
        Intent intent = new Intent();
        //注册action
        intent.setAction("com.MyReceiverAction");

        //携带数据
        intent.putExtra(getString(R.string.messagekey),editText.getText().toString());

        //发送广播
       this.sendBroadcast(intent);


    }

}
