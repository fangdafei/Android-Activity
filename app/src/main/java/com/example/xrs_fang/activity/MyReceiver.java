package com.example.xrs_fang.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        //回调的注册action
        String action = intent.getAction();

        //接收广播数据
        String msg = intent.getStringExtra(context.getString(R.string.messagekey));

        Log.e("收到的广播：", msg );

        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();

        if("com.MyReceiverAction".equals(action)){

            Log.e("收到的广播：", action );


        }


        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
//        throw new UnsupportedOperationException("Not yet implemented");

    }
}
