/**
 * 
 */
package com.lufax.test.uia.objectmodel.testcasemodel;

import com.lufax.test.uia.helper.TestDevice;
import com.lufax.test.uia.objectmodel.impl.android.InvestmentPageAndroidImpl;
import com.lufax.test.uia.objectmodel.impl.implInterface.InvestmentPageImpl;
import com.lufax.test.uia.objectmodel.impl.iphone.InvestmentPageIphoneImpl;

import io.appium.java_client.AppiumDriver;

/**
 * @author houzhiying
 *
 */
public class InvestmentPage extends BasePage {
	private InvestmentPageImpl myImplementor;
	private TestDevice myDevice;

	public InvestmentPage(AppiumDriver driver) {
		super(driver);
		
		myDevice = getDevice();
		switch(myDevice){
		case iPhone:
			myImplementor = new InvestmentPageIphoneImpl(driver);
			break;
		case android:
			myImplementor = new InvestmentPageAndroidImpl(driver);
			break;
		default:
			break;
		}
	}

}
