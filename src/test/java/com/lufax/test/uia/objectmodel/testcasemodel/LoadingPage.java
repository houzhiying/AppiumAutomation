package com.lufax.test.uia.objectmodel.testcasemodel;

import io.appium.java_client.AppiumDriver;

import com.lufax.test.uia.helper.TestDevice;
import com.lufax.test.uia.objectmodel.impl.android.LoadingPageAndroidImpl;
import com.lufax.test.uia.objectmodel.impl.implInterface.LoadingPageImpl;
import com.lufax.test.uia.objectmodel.impl.iphone.LoadingPageIphoneImpl;

public class LoadingPage extends BasePage {
	private LoadingPageImpl myImplementor;
	private TestDevice myDevice;
	
	public LoadingPage(AppiumDriver driver) {
		super(driver);
		
		myDevice = getDevice();
		switch(myDevice){
		case iPhone:
			myImplementor = new LoadingPageIphoneImpl(driver);
			break;
		case android:
			myImplementor = new LoadingPageAndroidImpl(driver);
		default:
			break;	
		}
	}
	
	/**
	 * 第一次启动app
	 * @throws Exception 
	 */
	public HomePage firstRun() throws Exception{
		return myImplementor.firstRun();
	}

}
