/**
 * 
 */
package com.lufax.test.uia.objectmodel.testcasemodel;

import com.lufax.test.uia.helper.TestDevice;
import com.lufax.test.uia.objectmodel.impl.android.MorePageAndroidImpl;
import com.lufax.test.uia.objectmodel.impl.implInterface.MorePageImpl;
import com.lufax.test.uia.objectmodel.impl.iphone.MorePageIphoneImpl;

import io.appium.java_client.AppiumDriver;

/**
 * @author houzhiying
 *
 */
public class MorePage extends BasePage {
	private MorePageImpl myImplementor;
	private TestDevice myDevice;
	public MorePage(AppiumDriver driver) {
		super(driver);
		
		myDevice = getDevice();
		switch(myDevice){
		case iPhone:
			myImplementor = new MorePageIphoneImpl(driver);
			break;
		case android:
			myImplementor = new MorePageAndroidImpl(driver);
			break;
		default:
			break;
		}
		
	}

}
