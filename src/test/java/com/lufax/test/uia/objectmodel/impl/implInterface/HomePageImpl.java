/**
 * 
 */
package com.lufax.test.uia.objectmodel.impl.implInterface;

import com.lufax.test.uia.objectmodel.testcasemodel.AccountPage;
import com.lufax.test.uia.objectmodel.testcasemodel.InvestmentPage;
import com.lufax.test.uia.objectmodel.testcasemodel.LoginPage;
import com.lufax.test.uia.objectmodel.testcasemodel.LumiPage;
import com.lufax.test.uia.objectmodel.testcasemodel.MorePage;

/**
 * @author houzhiying
 *
 */
public interface HomePageImpl {
	InvestmentPage clickInvestmentPage();
	LumiPage clickLumiPage();
	MorePage clickMorePage();
	LoginPage clickLoginPage();
	AccountPage clickAccountPage();
	
}
