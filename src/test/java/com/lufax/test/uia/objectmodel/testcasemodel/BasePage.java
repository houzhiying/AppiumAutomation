package com.lufax.test.uia.objectmodel.testcasemodel;

import com.lufax.test.uia.helper.Config;
import com.lufax.test.uia.helper.TestDevice;
import com.lufax.test.uia.objectmodel.impl.android.BasePageAndroidImpl;
import com.lufax.test.uia.objectmodel.impl.implInterface.BasePageImpl;
import com.lufax.test.uia.objectmodel.impl.iphone.BasePageIphoneImpl;

import io.appium.java_client.AppiumDriver;

public class BasePage {
	private BasePageImpl myImplementor;
	private TestDevice myDevice;
	
	public BasePage(AppiumDriver driver){
		this.myDevice = getDevice();
		switch(myDevice){
		case iPhone:
			myImplementor = new BasePageIphoneImpl(driver);
			break;
		case android:
			myImplementor = new BasePageAndroidImpl(driver);
			break;
		default:
			break;
		}
	}

	protected TestDevice getDevice() {
		String deviceString = Config.get("device");
		if(deviceString.equals("iPhone")) return TestDevice.iPhone;
		else if(deviceString.equals("android")) return TestDevice.android;
        return null;
	}

}
