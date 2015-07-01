/**
 * 
 */
package com.lufax.test.uia.objectmodel.impl.implInterface;

import com.lufax.test.uia.objectmodel.testcasemodel.AccountSafetyPage;
import com.lufax.test.uia.objectmodel.testcasemodel.InvestmentPage;
import com.lufax.test.uia.objectmodel.testcasemodel.MyAssetsPage;
import com.lufax.test.uia.objectmodel.testcasemodel.MyInvestmentPage;
import com.lufax.test.uia.objectmodel.testcasemodel.MyLjbPage;
import com.lufax.test.uia.objectmodel.testcasemodel.MyLumiPage;

/**
 * @author houzhiying
 *
 */
public interface AccountPageImpl {
	String getAccountPageTitle();
	void clickLogout();
	String getName();
	String getUserName();
	AccountSafetyPage clickAccountInfo();
	void clickAvailableFund();
	MyLumiPage clickAvailablePoints();
	MyLjbPage clickAvailableLjb();
	void clickGetCashBtn();
	void clickSaveCashBtn();
	MyAssetsPage clickAllBalance();
	MyInvestmentPage clickHolding();
	MyInvestmentPage clickNegotiable();
	MyInvestmentPage clickApplication();
	MyInvestmentPage clickClosed();
}
