package com.beyondsoft.prototype;

import android.app.Application;

public class ThisApplication extends Application
{
	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Application#onCreate()
	 */
	@Override
	public void onCreate() {
		super.onCreate();
		
		//Initial Crash Handler
		CrashHandler crashHandler = CrashHandler.getInstance();
		crashHandler.init(getApplicationContext());
		
	}

}

