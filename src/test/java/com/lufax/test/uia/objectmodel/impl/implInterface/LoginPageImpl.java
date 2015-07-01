/**
 * 
 */
package com.lufax.test.uia.objectmodel.impl.implInterface;

import com.lufax.test.uia.objectmodel.testcasemodel.AccountPage;
import com.lufax.test.uia.objectmodel.testcasemodel.RegisterPage;

/**
 * @author houzhiying
 *
 */
public interface LoginPageImpl {
	String getLoginPageTitle();
	void sendUsername(String userName);
	void sendPassword(String pwd);
	void sendverifyCode(String VerCode);
	void sendLoginInfo(String username,String pwd,String verifyCode) throws Exception;
	AccountPage clickLoginBtn();
	RegisterPage clickRegisterBtn();
	void clickForgetUser();
	void clickForgetPassword();

}
