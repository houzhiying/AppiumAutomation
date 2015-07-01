package com.lufax.test.uia.objectmodel.impl.implInterface;

public interface BasePageImpl {
	
	boolean isLogin() throws Exception;

	void clickBackButton() throws Exception;

	boolean waitForText(String text);

}
