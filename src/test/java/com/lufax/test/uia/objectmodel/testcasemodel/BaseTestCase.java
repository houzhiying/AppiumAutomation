package com.lufax.test.uia.objectmodel.testcasemodel;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.lufax.test.uia.helper.Config;
import com.lufax.test.uia.helper.TestDevice;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTestCase {
	protected AppiumDriver driver;
	private TestDevice myDevice;
	
	protected static String getAppPath(){
		String appPath = Config.get("appPath");
		return appPath;
	}
	
	protected static String getIosPath(){
		String iosAppPath = Config.get("iosAppPath");
		return iosAppPath;
	}
	
	protected static String getAndroidPath(){
		String androidAppPath = Config.get("andaAppPath");
		return androidAppPath;
	}
	
	protected static String getandroindAutomationName(){
		String androindAutomationName = Config.get("androindAutomationName");
		return androindAutomationName;
	}
	
	protected TestDevice getDevice(){
		
		String deviceString = System.getProperty("device");
		if(null==deviceString){
			deviceString=Config.get("device");
		}

		if(deviceString.equals("iPhone")) return TestDevice.iPhone;
		else if(deviceString.equals("android")) return TestDevice.android;
        return null;
	}
	
	public AppiumDriver setiPhoneEnviromentalParameters() throws MalformedURLException{
		File app = new File(getIosPath());
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
	    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.3");
	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
	    capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	    return driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);	
		
//		File app = new File(getIosPath());
//	    DesiredCapabilities capabilities = new DesiredCapabilities();
//	    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
//	    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.3");
//	    capabilities.setCapability(MobileCapabilityType.PLATFORM, "Mac");
//	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Test");
//	    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
//	    capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
//	    return driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);	
	}
	
	public AppiumDriver setAndroidEnviromentalParameters() throws MalformedURLException{
		File app = new File(getAndroidPath());
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
	    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4");
	    capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	    capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
	    return driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	@Before
	public void setUp() throws MalformedURLException{
		this.myDevice = getDevice();
		switch(myDevice){
		case iPhone:
			driver = setiPhoneEnviromentalParameters();
			break;
		case android:
			driver = setAndroidEnviromentalParameters();
		}
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}

}
