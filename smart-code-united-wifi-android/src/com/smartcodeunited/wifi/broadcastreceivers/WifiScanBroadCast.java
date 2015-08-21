package com.smartcodeunited.wifi.broadcastreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;

import com.smartcodeunited.wifi.utils.MyLog;

public class WifiScanBroadCast extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		if (intent.getAction().equals(WifiManager.SCAN_RESULTS_AVAILABLE_ACTION)) {
			MyLog.i("WifiScanBroadCast", "接收到扫描广播");
		}
	}

}
