package com.smartcodeunited.wifi.managers;

import android.content.Context;
import android.net.wifi.WifiManager;

public class WiFiDeviceManager
{
	private static WiFiDeviceManager sWiFiDeviceManager = new WiFiDeviceManager();

	private static WifiManager sWifiManager;

	private static Context sContext;

	private WiFiDeviceManager()
	{
	}

	public static WiFiDeviceManager getInstance(Context context)
	{
		if (context != null)
		{
			sContext = context.getApplicationContext();
			sWifiManager = (WifiManager) sContext
					.getSystemService(Context.WIFI_SERVICE);
		}

		return sWiFiDeviceManager;
	}

	public boolean isSupport()
	{
		if (sWifiManager != null)
		{
			return true;
		}

		return false;
	}

	public boolean enable()
	{
		if (sWifiManager != null)
		{
			return sWifiManager.setWifiEnabled(true);
		}

		return false;
	}

	public boolean disable()
	{
		if (sWifiManager != null)
		{
			return sWifiManager.setWifiEnabled(false);
		}

		return false;
	}
}
