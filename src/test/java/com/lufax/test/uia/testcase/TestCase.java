package com.lufax.test.uia.testcase;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.Test;

import com.lufax.test.uia.helper.CommonConstant;
import com.lufax.test.uia.objectmodel.testcasemodel.AccountPage;
import com.lufax.test.uia.objectmodel.testcasemodel.BaseTestCase;
import com.lufax.test.uia.objectmodel.testcasemodel.HomePage;
import com.lufax.test.uia.objectmodel.testcasemodel.LoadingPage;
import com.lufax.test.uia.objectmodel.testcasemodel.LoginPage;

public class TestCase extends BaseTestCase {
	
	@Test(timeout = 500000)
	public void testLogin() throws Exception{
		LoadingPage loadingPage = new LoadingPage(driver);
		HomePage homePage = loadingPage.firstRun();
//		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		homePage.clickLoginPage();
		TimeUnit.MILLISECONDS.sleep(3000);
		Assert.assertEquals("登录", loginPage.getLoginPageTitle());
		loginPage.sendUsername(CommonConstant.LUFAX_ACCOUNT_NAME);
		TimeUnit.MILLISECONDS.sleep(3000);
		loginPage.sendPassword(CommonConstant.LUFAX_ACCOUNT_PWD);
		TimeUnit.MILLISECONDS.sleep(10000);
//		loginPage.sendverifyCode("");
//		TimeUnit.MILLISECONDS.sleep(5000);
		AccountPage accountPage = loginPage.clickLoginBtn();
		TimeUnit.MILLISECONDS.sleep(3000);
		Assert.assertEquals("我的账户", accountPage.getAccountPageTitle());
		Assert.assertEquals(CommonConstant.LUFAX_ACCOUNT_Chinese, accountPage.getName());
		Assert.assertEquals(CommonConstant.LUFAX_ACCOUNT_NAME, accountPage.getUserName());
		TimeUnit.MILLISECONDS.sleep(5000);
	}

}
	