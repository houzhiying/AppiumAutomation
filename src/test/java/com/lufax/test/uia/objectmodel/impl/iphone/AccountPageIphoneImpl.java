/**
 * 
 */
package com.lufax.test.uia.objectmodel.impl.iphone;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import com.lufax.test.uia.helper.iphone.IOSUIElement;
import com.lufax.test.uia.objectmodel.impl.implInterface.AccountPageImpl;
import com.lufax.test.uia.objectmodel.testcasemodel.AccountSafetyPage;
import com.lufax.test.uia.objectmodel.testcasemodel.MyAssetsPage;
import com.lufax.test.uia.objectmodel.testcasemodel.MyInvestmentPage;
import com.lufax.test.uia.objectmodel.testcasemodel.MyLjbPage;
import com.lufax.test.uia.objectmodel.testcasemodel.MyLumiPage;

/**
 * @author houzhiying
 * @since 2015-05-05
 *
 */
public class AccountPageIphoneImpl extends BasePageIphoneImpl implements AccountPageImpl {

	public AccountPageIphoneImpl(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 获取我的账户页面itle
	 * @return String
	 */
	
	public String getAccountPageTitle() {
//		MobileElement accountPageTitle = (MobileElement) this.findElementByName(IOSUIElement.accountpage_title_text);
		MobileElement accountPageTitle = (MobileElement) this.findElementByXpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]");
		return accountPageTitle.getAttribute("value");
	}

	/**
	 * 获取登录账户中文名称
	 * @return String
	 */
	
	public String getName() {
		MobileElement name = (MobileElement) this.findElementByXpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAStaticText[1]");
		return getText(name);
	}

	/**
	 * 获取登录账户username
	 * @return String
	 */
	
	public String getUserName() {
		MobileElement userName = (MobileElement) this.findElementByXpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAStaticText[2]");
		String[] temp = (userName.getAttribute("value")).split("：");
		String userNameText = temp[1].trim();
		return userNameText;
	}

	/**
	 * 点击用户信息区域
	 * @return AccountSafetyPage
	 */
	
	public AccountSafetyPage clickAccountInfo() {
		this.tab(182, 89);
		return new AccountSafetyPage(myDriver);
	}

	/**
	 * 点击用户可用余额
	 * @return null
	 */
	
	public void clickAvailableFund() {
		MobileElement AvailableFund = (MobileElement) this.findElementByName(IOSUIElement.accountpage_availablefund_text);
		click(AvailableFund);
	}

	/**
	 * 点击用户可用陆米
	 * @return MyLumiPage
	 */
	
	public MyLumiPage clickAvailablePoints() {
		MobileElement availablePoints = (MobileElement) this.findElementByName(IOSUIElement.accountpage_availablepoints_text);
		click(availablePoints);
		return new MyLumiPage(myDriver);
	}

	/**
	 * 点击用户可用陆金币
	 * @return MyLjbPage
	 */
	
	public MyLjbPage clickAvailableLjb() {
		MobileElement availableLjb = (MobileElement) this.findElementByName(IOSUIElement.accountpage_availableLjb_text);
		click(availableLjb);
		return new MyLjbPage(myDriver);
	}

	/**
	 * 点击【取现】按钮
	 */
	
	public void clickGetCashBtn() {
		MobileElement getCashBtn = (MobileElement) this.findElementByName(IOSUIElement.accountpage_getcash_btn);
		click(getCashBtn);
	}

	/**
	 * 点击【充值】按钮
	 */
	
	public void clickSaveCashBtn() {
		MobileElement saveCashBtn = (MobileElement) this.findElementByName(IOSUIElement.accountpage_savecash_btn);
		click(saveCashBtn);
	}

	/**
	 * 点击用户总资产
	 * @return MyAssetsPage
	 */
	
	public MyAssetsPage clickAllBalance() {
		MobileElement allBalance = (MobileElement) this.findElementByName(IOSUIElement.accountpage_allbalance_text);
		click(allBalance);
 		return new MyAssetsPage(myDriver);
	}

	/**
	 * 点击持有中
	 * @return MyInvestmentPage
	 */
	
	public MyInvestmentPage clickHolding() {
		MobileElement holding = (MobileElement) this.findElementByName(IOSUIElement.accountpage_holding_text);
		click(holding);
		return new MyInvestmentPage(myDriver);
	}

	/**
	 * 点击可转让
	 * @return MyInvestmentPage
	 */
	
	public MyInvestmentPage clickNegotiable() {
		MobileElement negotiable = (MobileElement) this.findElementByName(IOSUIElement.accountpage_negotiable_text);
		click(negotiable);
		return new MyInvestmentPage(myDriver);
	}

	/**
	 * 点击申请中
	 * @return MyInvestmentPage
	 */
	
	public MyInvestmentPage clickApplication() {
		MobileElement application = (MobileElement) this.findElementByName(IOSUIElement.accountpage_application_text);
		click(application);
		return new MyInvestmentPage(myDriver);
	}

	/**
	 * 点击已结束
	 * @return MyInvestmentPage
	 */
	
	public MyInvestmentPage clickClosed() {
		MobileElement close = (MobileElement) this.findElementByName(IOSUIElement.accountpage_closed_text);
		click(close);
		return new MyInvestmentPage(myDriver);
	}

	/**
	 * 点击退出登录
	 */
	
	public void clickLogout() {
		MobileElement logoutBtn = (MobileElement) this.findElementByName(IOSUIElement.accountpage_logout_btn);
		click(logoutBtn);
	}

}
