/**
 * 
 */
package com.lufax.test.uia.objectmodel.testcasemodel;

import com.lufax.test.uia.helper.TestDevice;
import com.lufax.test.uia.objectmodel.impl.android.LumiPageAndroidImpl;
import com.lufax.test.uia.objectmodel.impl.implInterface.LumiPageImpl;
import com.lufax.test.uia.objectmodel.impl.iphone.LumiPageIphoneImpl;

import io.appium.java_client.AppiumDriver;

/**
 * @author houzhiying
 *
 */
public class LumiPage extends BasePage {
	private LumiPageImpl myImplementor;
	private TestDevice myDevice;
	public LumiPage(AppiumDriver driver) {
		super(driver);
		
		myDevice = getDevice();
		switch(myDevice){
		case iPhone:
			myImplementor = new LumiPageIphoneImpl(driver);
			break;
		case android:
			myImplementor = new LumiPageAndroidImpl();
			break;
		default:
			break;
		}
	}

}
