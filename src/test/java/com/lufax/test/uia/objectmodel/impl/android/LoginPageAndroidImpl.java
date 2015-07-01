/**
 * 
 */
package com.lufax.test.uia.objectmodel.impl.android;

import io.appium.java_client.AppiumDriver;

import com.lufax.test.uia.objectmodel.impl.implInterface.LoginPageImpl;
import com.lufax.test.uia.objectmodel.testcasemodel.AccountPage;
import com.lufax.test.uia.objectmodel.testcasemodel.RegisterPage;

/**
 * @author houzhiying
 *
 */
public class LoginPageAndroidImpl extends BasePageAndroidImpl implements LoginPageImpl {

	public LoginPageAndroidImpl(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public String getLoginPageTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void sendLoginInfo(String username, String pwd, String verifyCode) {
		// TODO Auto-generated method stub
		
	}

	
	public AccountPage clickLoginBtn() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public RegisterPage clickRegisterBtn() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void clickForgetUser() {
		// TODO Auto-generated method stub
		
	}

	
	public void clickForgetPassword() {
		// TODO Auto-generated method stub
		
	}

	
	public void sendUsername(String userName) {
		// TODO Auto-generated method stub
		
	}

	
	public void sendPassword(String pwd) {
		// TODO Auto-generated method stub
		
	}

	
	public void sendverifyCode(String VerCode) {
		// TODO Auto-generated method stub
		
	}

}
