package com.lufax.test.uia.testcase;

import static org.junit.Assert.*;

import java.io.File;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidTest {
	private AndroidDriver driver;

	@Before
	public void setUp() throws Exception {
		File appDir = new File("/Users/houzhiying/Desktop");
	    File app = new File(appDir, "lufax_test_2.6.5.apk");
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
	    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4");
	    capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	    capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
	    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
