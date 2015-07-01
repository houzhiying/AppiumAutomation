package com.lufax.test.uia.objectmodel.impl.android;

import com.lufax.test.uia.objectmodel.impl.implInterface.LoadingPageImpl;
import com.lufax.test.uia.objectmodel.testcasemodel.HomePage;

import io.appium.java_client.AppiumDriver;

public class LoadingPageAndroidImpl extends BasePageAndroidImpl implements LoadingPageImpl{
	public LoadingPageAndroidImpl(AppiumDriver driver){
		super(driver);
	}

	public HomePage firstRun() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
