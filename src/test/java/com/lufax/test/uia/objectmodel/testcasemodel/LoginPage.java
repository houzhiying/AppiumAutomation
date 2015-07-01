/**
 * 
 */
package com.lufax.test.uia.objectmodel.testcasemodel;

import java.util.concurrent.TimeUnit;

import com.lufax.test.uia.helper.TestDevice;
import com.lufax.test.uia.helper.iphone.IOSUIElement;
import com.lufax.test.uia.objectmodel.impl.android.LoginPageAndroidImpl;
import com.lufax.test.uia.objectmodel.impl.implInterface.LoginPageImpl;
import com.lufax.test.uia.objectmodel.impl.iphone.LoginPageIphoneImpl;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * @author houzhiying
 *
 */
public class LoginPage extends BasePage {
	private LoginPageImpl myImplementor;
	private TestDevice myDevice;
	public LoginPage(AppiumDriver driver) {
		super(driver);
		
		myDevice = getDevice();
		switch(myDevice){
		case iPhone:
			myImplementor = new LoginPageIphoneImpl(driver);
			break;
		case android:
			myImplementor = new LoginPageAndroidImpl(driver);
			break;
		default:
			break;
		}
		
	}
	
	/**
	 * 获取登录页面标题
	 */
	public String getLoginPageTitle() {
		return myImplementor.getLoginPageTitle();
	}
	
	/**
	 * 输入用户名
	 * @param userName
	 */
	public void sendUsername(String userName) {
		myImplementor.sendUsername(userName);
	}

	/**
	 * 输入密码
	 * @param pwd
	 */
	public void sendPassword(String pwd) {
		myImplementor.sendPassword(pwd);
	}

	/**
	 * 输入验证码
	 * @param verCode
	 */
	public void sendverifyCode(String verCode) {
		myImplementor.sendverifyCode(verCode);
	}

	/**
	 * 输入登录信息
	 * @throws Exception 
	 * @param username 
	 * @param pwd 
	 * @param verifyCode
	 */
	public void sendLoginInfo(String username, String pwd, String verifyCode) throws Exception {
		myImplementor.sendLoginInfo(username, pwd, verifyCode);
	}

	/**
	 * 点击登录按钮
	 */
	public AccountPage clickLoginBtn() {
		return myImplementor.clickLoginBtn();
	}

	/**
	 * 点击注册按钮
	 */
	public RegisterPage clickRegisterBtn() {
		return myImplementor.clickRegisterBtn();
	}

	/**
	 * 点击忘记用户
	 */
	public void clickForgetUser() {
		myImplementor.clickForgetUser();
	}
	
	/**
	 * 点击忘记密码
	 */
	public void clickForgetPassword() {
		myImplementor.clickForgetPassword();
	}


}
