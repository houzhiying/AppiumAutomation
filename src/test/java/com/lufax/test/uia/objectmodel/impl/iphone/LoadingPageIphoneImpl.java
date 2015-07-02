package com.lufax.test.uia.objectmodel.impl.iphone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;

import com.lufax.test.uia.helper.CommonConstant;
import com.lufax.test.uia.objectmodel.impl.implInterface.LoadingPageImpl;
import com.lufax.test.uia.objectmodel.testcasemodel.HomePage;

public class LoadingPageIphoneImpl extends BasePageIphoneImpl implements LoadingPageImpl {

	public LoadingPageIphoneImpl(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 第一次启动app
	 * @throws Exception 
	 */
	public HomePage firstRun() throws Exception {
		MobileElement elment = (MobileElement) this.findElementByName("Don’t Allow");
		click(elment);
		TimeUnit.MILLISECONDS.sleep(CommonConstant.SHORT_WAIT);
		this.tab(250, 250);
		TimeUnit.MILLISECONDS.sleep(CommonConstant.SHORT_WAIT);
		this.tab(250, 250);
		return new HomePage(myDriver);
	}


}
