package com.lufax.test.uia.objectmodel.testcasemodel;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import com.lufax.test.uia.helper.TestDevice;
import com.lufax.test.uia.helper.iphone.IOSUIElement;
import com.lufax.test.uia.objectmodel.impl.android.HomePageAndroidImpl;
import com.lufax.test.uia.objectmodel.impl.android.LoadingPageAndroidImpl;
import com.lufax.test.uia.objectmodel.impl.implInterface.HomePageImpl;
import com.lufax.test.uia.objectmodel.impl.implInterface.LoadingPageImpl;
import com.lufax.test.uia.objectmodel.impl.iphone.HomePageIphoneImpl;
import com.lufax.test.uia.objectmodel.impl.iphone.LoadingPageIphoneImpl;

public class HomePage extends BasePage {
	private HomePageImpl myImplementor;
	private TestDevice myDevice;

	public HomePage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
		myDevice = getDevice();
		switch(myDevice){
		case iPhone:
			myImplementor = new HomePageIphoneImpl(driver);
			break;
		case android:
			myImplementor = new HomePageAndroidImpl(driver);
			break;
		default:
			break;	
		}
	}
	
	/**
	 * 点击投资理财按钮
	 * @return InvestmentPage
	 */
	public InvestmentPage clickInvestmentPage() {
		return myImplementor.clickInvestmentPage();
	}
	
	/**
	 * 点击陆米世界按钮
	 * @return LumiPage
	 */
	public LumiPage clickLumiPage() {
		return myImplementor.clickLumiPage();
	}

	/**
	 * 点击更多按钮
	 * @return MorePage
	 */
	public MorePage clickMorePage() {
		return myImplementor.clickMorePage();
	}

	/**
	 * 未登录状态下，点击我的账户，进入登录页面
	 * @return LoginPage
	 */
	public LoginPage clickLoginPage() {
		return myImplementor.clickLoginPage();
	}

	/**
	 * 已登录状态下，点击我的账户，进入个人中心
	 * @return AccountPage
	 */
	public AccountPage clickAccountPage() {
		return myImplementor.clickAccountPage();
	}
}
