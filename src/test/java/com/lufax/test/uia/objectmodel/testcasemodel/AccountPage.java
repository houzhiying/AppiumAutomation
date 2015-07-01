/**
 * 
 */
package com.lufax.test.uia.objectmodel.testcasemodel;

import com.lufax.test.uia.helper.TestDevice;
import com.lufax.test.uia.objectmodel.impl.android.AccountPageAndroidImpl;
import com.lufax.test.uia.objectmodel.impl.implInterface.AccountPageImpl;
import com.lufax.test.uia.objectmodel.impl.implInterface.LoadingPageImpl;
import com.lufax.test.uia.objectmodel.impl.iphone.AccountPageIphoneImpl;

import io.appium.java_client.AppiumDriver;

/**
 * @author houzhiying
 *
 */
public class AccountPage extends BasePage {
	private AccountPageImpl myImplementor;
	private TestDevice myDevice;

	/**
	 * @param driver
	 */
	public AccountPage(AppiumDriver driver) {
		super(driver);
		
		myDevice = getDevice();
		switch(myDevice){
		case iPhone:
			myImplementor = new AccountPageIphoneImpl(driver);
			break;
		case android:
			myImplementor = new AccountPageAndroidImpl(driver);
			break;
		default:
			break;
		}
		
	}
	
	/**
	 * 获取我的账户页面itle
	 * @return String
	 */
	public String getAccountPageTitle() {
		// TODO Auto-generated method stub
		return myImplementor.getAccountPageTitle();
	}

	/**
	 * 获取登录账户中文名称
	 * @return String
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return myImplementor.getName();
	}

	/**
	 * 获取登录账户username
	 * @return String
	 */
	public String getUserName() {
		// TODO Auto-generated method stub
		return myImplementor.getUserName();
	}

	/**
	 * 点击用户信息区域
	 * @return AccountSafetyPage
	 */
	public AccountSafetyPage clickAccountInfo() {
		// TODO Auto-generated method stub
		return myImplementor.clickAccountInfo();
	}

	/**
	 * 点击用户可用余额
	 * @return null
	 */
	public void clickAvailableFund() {
		// TODO Auto-generated method stub
		myImplementor.clickAvailableFund();
	}

	/**
	 * 点击用户可用陆米
	 * @return MyLumiPage
	 */
	public MyLumiPage clickAvailablePoints() {
		// TODO Auto-generated method stub
		return myImplementor.clickAvailablePoints();
	}

	/**
	 * 点击用户可用陆金币
	 * @return MyLjbPage
	 */
	public MyLjbPage clickAvailableLjb() {
		// TODO Auto-generated method stub
		return myImplementor.clickAvailableLjb();
	}

	/**
	 * 点击【取现】按钮
	 */
	public void clickGetCashBtn() {
		// TODO Auto-generated method stub
		myImplementor.clickGetCashBtn();
	}

	/**
	 * 点击【充值】按钮
	 */
	public void clickSaveCashBtn() {
		// TODO Auto-generated method stub
		myImplementor.clickSaveCashBtn();
	}

	/**
	 * 点击用户总资产
	 * @return MyAssetsPage
	 */
	public MyAssetsPage clickAllBalance() {
		// TODO Auto-generated method stub
		return myImplementor.clickAllBalance();
	}

	/**
	 * 点击持有中
	 * @return MyInvestmentPage
	 */
	public MyInvestmentPage clickHolding() {
		// TODO Auto-generated method stub
		return myImplementor.clickHolding();
	}

	/**
	 * 点击可转让
	 * @return MyInvestmentPage
	 */
	public MyInvestmentPage clickNegotiable() {
		// TODO Auto-generated method stub
		return myImplementor.clickNegotiable();
	}

	/**
	 * 点击申请中
	 * @return MyInvestmentPage
	 */
	public MyInvestmentPage clickApplication() {
		// TODO Auto-generated method stub
		return myImplementor.clickApplication();
	}

	/**
	 * 点击已结束
	 * @return MyInvestmentPage
	 */
	public MyInvestmentPage clickClosed() {
		// TODO Auto-generated method stub
		return myImplementor.clickClosed();
	}


}
