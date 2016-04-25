package com.wind_mobi.qiancheng.broadcastreceiverdemo2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by qiancheng on 2016/4/25.
 */
public class BootCompleteReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "boot has complete", Toast.LENGTH_SHORT).show();
    }
}
