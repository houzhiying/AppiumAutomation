/**
 * 
 */
package com.lufax.test.uia.objectmodel.impl.iphone;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import com.lufax.test.uia.helper.iphone.IOSUIElement;
import com.lufax.test.uia.objectmodel.impl.implInterface.HomePageImpl;
import com.lufax.test.uia.objectmodel.testcasemodel.AccountPage;
import com.lufax.test.uia.objectmodel.testcasemodel.InvestmentPage;
import com.lufax.test.uia.objectmodel.testcasemodel.LoginPage;
import com.lufax.test.uia.objectmodel.testcasemodel.LumiPage;
import com.lufax.test.uia.objectmodel.testcasemodel.MorePage;

/**
 * @author houzhiying 
 * @since
 *
 */
public class HomePageIphoneImpl extends BasePageIphoneImpl implements HomePageImpl {
	
	public HomePageIphoneImpl(AppiumDriver driver) {
		super(driver);
	}
	
	/**
	 * 点击投资理财按钮
	 * @return InvestmentPage
	 */
	
	public InvestmentPage clickInvestmentPage() {
		MobileElement InvestmentBtn = (MobileElement) this.findElementByName(IOSUIElement.homepage_investment_btn);
		click(InvestmentBtn);
		return new InvestmentPage(myDriver);
	}
	
	/**
	 * 点击陆米世界按钮
	 * @return LumiPage
	 */
	
	public LumiPage clickLumiPage() {
		MobileElement LumiBtn = (MobileElement) this.findElementByName(IOSUIElement.homepage_lumi_btn);
		click(LumiBtn);
		return new LumiPage(myDriver);
	}

	/**
	 * 点击更多按钮
	 * @return MorePage
	 */
	
	public MorePage clickMorePage() {
		MobileElement MoreBtn = (MobileElement) this.findElementByName(IOSUIElement.homepage_more_btn);
		click(MoreBtn);
		return new MorePage(myDriver);
	}

	/**
	 * 未登录状态下，点击我的账户，进入登录页面
	 * @return LoginPage
	 */
	
	public LoginPage clickLoginPage() {
		MobileElement LoginBtn = (MobileElement) this.findElementByName(IOSUIElement.homepage_account_btn);
		click(LoginBtn);
		return new LoginPage(myDriver);
	}

	/**
	 * 已登录状态下，点击我的账户，进入个人中心
	 * @return AccountPage
	 */
	
	public AccountPage clickAccountPage() {
		MobileElement AccountBtn = (MobileElement) this.findElementByName(IOSUIElement.homepage_account_btn);
		click(AccountBtn);
		return new AccountPage(myDriver);
	}

}
