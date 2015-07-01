/**
 * 
 */
package com.lufax.test.uia.objectmodel.testcasemodel;

import com.lufax.test.uia.helper.TestDevice;
import com.lufax.test.uia.objectmodel.impl.android.AccountSafetyAndroidImpl;
import com.lufax.test.uia.objectmodel.impl.android.HomePageAndroidImpl;
import com.lufax.test.uia.objectmodel.impl.implInterface.AccountPageImpl;
import com.lufax.test.uia.objectmodel.impl.implInterface.AccountSafetyPageImpl;
import com.lufax.test.uia.objectmodel.impl.iphone.AccountSafetyIphoneImpl;
import com.lufax.test.uia.objectmodel.impl.iphone.HomePageIphoneImpl;

import io.appium.java_client.AppiumDriver;

/**
 * @author houzhiying
 *
 */
public class AccountSafetyPage extends BasePage {
	private AccountSafetyPageImpl myImplementor;
	private TestDevice myDevice;

	public AccountSafetyPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		myDevice = getDevice();
		switch(myDevice){
		case iPhone:
			myImplementor = new AccountSafetyIphoneImpl(driver);
			break;
		case android:
			myImplementor = new AccountSafetyAndroidImpl(driver);
			break;
		default:
			break;	
		}
	}

}
