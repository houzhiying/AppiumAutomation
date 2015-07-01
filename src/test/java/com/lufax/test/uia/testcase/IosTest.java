package com.lufax.test.uia.testcase;

import static org.junit.Assert.*;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.lufax.test.uia.helper.CommonConstant;

public class IosTest {
	private MobileDriver driver;

	@Before
	public void setUp() throws Exception {
		File appDir = new File("/Users/houzhiying/Desktop");
	    File app = new File(appDir, "lujinsuo.app");
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
	    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.3");
	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
	    capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	    driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
//		IOSElement element = (IOSElement) driver.findElement(By.name("Don’t Allow"));
//		element.click();
		TimeUnit.MILLISECONDS.sleep(5000);
		WebElement acount = driver.findElement(By.name("我的账户"));
		acount.click();
		TimeUnit.MILLISECONDS.sleep(5000);
		MobileElement userName = (MobileElement) driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]"));
		userName.clear();
		userName.sendKeys("test-001");
		WebElement pwd = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]"));
		pwd.clear();
		pwd.sendKeys("mima123");
		TimeUnit.MILLISECONDS.sleep(10000);
		WebElement loginBtn = driver.findElement(By.name("登录"));
		TimeUnit.MILLISECONDS.sleep(10000);

//		WebElement investment = driver.findElement(By.name("投资理财"));
//		investment.click();
//		WebElement title = driver.findElement(By.name("投资理财"));
//		System.out.println(title.getText());
//		WebElement element = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[2]"));
//		System.out.println(element.getText());
		
	}

}
