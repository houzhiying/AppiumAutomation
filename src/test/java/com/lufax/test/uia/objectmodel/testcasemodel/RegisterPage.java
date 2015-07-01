/**
 * 
 */
package com.lufax.test.uia.objectmodel.testcasemodel;

import com.lufax.test.uia.helper.TestDevice;
import com.lufax.test.uia.objectmodel.impl.android.RegisterPageAndroidImpl;
import com.lufax.test.uia.objectmodel.impl.implInterface.RegisterPageImpl;
import com.lufax.test.uia.objectmodel.impl.iphone.RegisterPageIphoneImpl;

import io.appium.java_client.AppiumDriver;

/**
 * @author houzhiying
 *
 */
public class RegisterPage extends BasePage {
	private RegisterPageImpl myImplementor;
	private TestDevice myDevice;
	public RegisterPage(AppiumDriver driver) {
		super(driver);
		
		myDevice = getDevice();
		switch(myDevice){
		case iPhone:
			myImplementor = new RegisterPageIphoneImpl(driver);
			break;
		case android:
			myImplementor = new RegisterPageAndroidImpl(driver);
			break;
		default:
			break;
		}
		
	}

}
