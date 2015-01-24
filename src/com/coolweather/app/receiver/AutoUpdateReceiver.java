package com.coolweather.app.receiver;

import com.coolweather.app.service.AutoUpdateService;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.sax.StartElementListener;
import android.util.Log;

public class AutoUpdateReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Log.d("MainActivity", "更新最新天气");
		Intent i = new Intent(context,AutoUpdateService.class);
		context.startService(i);

	}

}
