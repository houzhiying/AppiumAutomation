/**
 * 
 */
package com.lufax.test.uia.objectmodel.impl.iphone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import sun.misc.Cleaner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import com.lufax.test.uia.helper.iphone.IOSUIElement;
import com.lufax.test.uia.objectmodel.impl.implInterface.LoginPageImpl;
import com.lufax.test.uia.objectmodel.testcasemodel.AccountPage;
import com.lufax.test.uia.objectmodel.testcasemodel.RegisterPage;

/**
 * @author houzhiying
 * @since 22/04/2015 
 *
 */
public class LoginPageIphoneImpl extends BasePageIphoneImpl implements LoginPageImpl {

	public LoginPageIphoneImpl(AppiumDriver driver) {
		super(driver);
	}

	/**
	 * 获取登录页面标题
	 */
	
	public String getLoginPageTitle() {
//		MobileElement loginPageTitle = (MobileElement) this.findElementByName(IOSUIElement.loginpage_title_text);
		MobileElement loginPageTitle = (MobileElement) this.findElementByXpath("//UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]");
		return loginPageTitle.getAttribute("value");
	}
	
	/**
	 * 输入用户名
	 * @param userName
	 */
	
	public void sendUsername(String userName) {
		MobileElement userNameElement = (MobileElement) this.findElementByXpath("//UIAWindow[1]/UIATextField[1]");
		userNameElement.clear();
		sendKeys(userNameElement, userName);
		
	}

	/**
	 * 输入密码
	 * @param pwd
	 */
	
	public void sendPassword(String pwd) {
		MobileElement passWord = (MobileElement) this.findElementByXpath("//UIAWindow[1]/UIASecureTextField[1]");
		passWord.clear();
		sendKeys(passWord, pwd);
	}

	/**
	 * 输入验证码
	 * @param verCode
	 */
	
	public void sendverifyCode(String verCode) {
		MobileElement verifyCode = (MobileElement) this.findElementByXpath("//UIAWindow[1]/UIATextField[2]/UIATextField[1]");
		verifyCode.clear();
		sendKeys(verifyCode, verCode);
	}

	/**
	 * 输入登录信息
	 * @throws Exception 
	 * @param username 
	 * @param pwd 
	 * @param verifyCode
	 */
	
	public void sendLoginInfo(String username, String pwd, String verifyCode) throws Exception {
		MobileElement userNameElement = (MobileElement) this.findElementByXpath("//UIAWindow[1]/UIATextField[1]/UIATextField[1]");
		MobileElement passWordElement = (MobileElement) this.findElementByXpath("//UIAWindow[1]/UIASecureTextField[1]/UIASecureTextField[1]");
		MobileElement verifyCodeElement = (MobileElement) this.findElementByXpath("//UIAWindow[1]/UIATextField[2]/UIATextField[1]");
		userNameElement.clear();
		sendKeys(userNameElement, username);
		TimeUnit.MILLISECONDS.sleep(2000);
		passWordElement.clear();
		sendKeys(passWordElement, pwd);
		TimeUnit.MILLISECONDS.sleep(5000);
		verifyCodeElement.clear();
		sendKeys(verifyCodeElement, verifyCode);
	}

	/**
	 * 点击登录按钮
	 */
	
	public AccountPage clickLoginBtn() {
//		MobileElement loginBtn = (MobileElement) this.findElementByName(IOSUIElement.loginpage_login_btn);
		MobileElement loginBtn = (MobileElement) this.findElementByXpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]");
		click(loginBtn);
		return new AccountPage(myDriver);
	}

	/**
	 * 点击注册按钮
	 */
	
	public RegisterPage clickRegisterBtn() {
		MobileElement registerBtn = (MobileElement) this.findElementByName(IOSUIElement.loginpage_register_btn);
		click(registerBtn);
		return new RegisterPage(myDriver);
	}

	/**
	 * 点击忘记用户
	 */
	
	public void clickForgetUser() {
		MobileElement forgetUserBtn = (MobileElement) this.findElementByName(IOSUIElement.loginpage_forgetuser_btn);
		click(forgetUserBtn);
	}
	
	/**
	 * 点击忘记密码
	 */
	
	public void clickForgetPassword() {
		MobileElement forgetPasswordBtn = (MobileElement) this.findElementByName(IOSUIElement.loginpage_forgetpwd_btn);
		click(forgetPasswordBtn);
	}

	

}
