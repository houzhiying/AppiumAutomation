package com.lufax.test.uia.objectmodel.impl.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.lufax.test.uia.helper.CommonConstant;
import com.lufax.test.uia.objectmodel.impl.implInterface.BasePageImpl;

public class BasePageAndroidImpl implements BasePageImpl{
		
		public static Logger logger = Logger.getLogger(BasePageAndroidImpl.class.getName());
		
		public AppiumDriver myDriver;
		
		public BasePageAndroidImpl( AppiumDriver driver){
			this.myDriver = driver;
		}
		
		/**
		 * 根据ID查找元素,返回list
		 *
		 * @param id
		 * @return
		 * @throws Exception 
		 */
		public List<WebElement> findElementsById(String id){
			try {
				List<WebElement> elements = null;
				int i = 3;
				do {
					int j = 4 - i;
					logger.info("第" + j + "查找元素" + id);
					TimeUnit.MILLISECONDS.sleep(CommonConstant.SHORT_WAIT);
					elements = myDriver.findElements(By.id(id));
					i--;
				} while (elements.size() == 0 && i >= 0);
				
				if(elements.size() == 0){
					logger.info("没有查找到" + id + "的元素");
				}
				return elements;
			} catch (Exception e) {
				return null;
			}
			
		}

		/**
		 * 根据ID查找元素，返回elemet
		 *
		 * @param id
		 * @return
		 * @throws Exception 
		 */
		public WebElement findElementById(String id){
			try {
				WebElement element = null;
				int i = 3;
				do {
					int j = 4 - i;
					logger.info("第" + j + "查找元素" + id);
					TimeUnit.MILLISECONDS.sleep(CommonConstant.SHORT_WAIT);
					element = myDriver.findElement(By.id(id));
					i--;
				} while (element == null && i >= 0);
				
				if(element == null){
					logger.info("没有查找到" + id + "的元素");
				}
				return element;
			} catch (Exception e) {
				return null;
			}
		}
		
		/**
		 * 根据name查找元素，返回list
		 *
		 * @param id
		 * @return
		 * @throws Exception 
		 */
		public List<WebElement> findElementsByName(String name){
			try {
				List<WebElement> elements = null;
				int i = 3;
				do {
					int j = 4 - i;
					logger.info("第" + j + "查找元素" + name);
					TimeUnit.MILLISECONDS.sleep(CommonConstant.SHORT_WAIT);
					elements = myDriver.findElements(By.name(name));
					i--;
				} while (elements.size() == 0 && i >= 0);
				
				if(elements.size() == 0){
					logger.info("没查找到" + name + "的元素");
				}
				return elements;
			} catch (Exception e) {
				return null;
			}
		}
		
		/**
		 * 根据name查找元素，返回element
		 *
		 * @param id
		 * @return
		 * @throws Exception 
		 */
		public WebElement findElementByName(String name){
			try {
				WebElement element = null;
				int i = 3;
				do {
					int j = 4 - i;
					logger.info("第" + j + "查找元素" + name);
					TimeUnit.MILLISECONDS.sleep(CommonConstant.SHORT_WAIT);
					element = myDriver.findElement(By.name(name));
					i--;
				} while (element == null && i >= 0);
				
				if(element == null){
					logger.info("没查找到" + name + "的元素");
				}
				return element;
			} catch (Exception e) {
				return null;
			}
		}
		
		/**
		 * 根据tagname查找元素，返回list
		 *
		 * @param id
		 * @return
		 * @throws Exception 
		 */
		public List<WebElement> findElementsByTagName(String tagName){
			try {
				List<WebElement> elements = null;
				int i = 3;
				do {
					int j = 4 - i;
					logger.info("第" + j + "查找元素" + tagName);
					elements = myDriver.findElements(By.tagName(tagName));
					i--;
				} while (elements.size() == 0 && i >= 0);
				
				if(elements.size() == 0){
					logger.info("没查找到" + tagName + "的元素");
				}
				return elements;
			} catch (Exception e) {
				return null;
			}
		}
		
		/**
		 * 根据tagname查找元素，返回element
		 *
		 * @param id
		 * @return
		 * @throws Exception 
		 */
		public WebElement findElementByTagName(String tagName){
			try {
				WebElement element = null;
				int i = 3;
				do {
					int j = 4 - i;
					logger.info("第" + j + "查找元素" + tagName);
					element = myDriver.findElement(By.tagName(tagName));
					i--;
				} while (element == null && i >= 0);
				
				if(element == null){
					logger.info("没查找到" + tagName + "的元素");
				}
				return element;
			} catch (Exception e) {
				return null;
			}
		}
		
		/**
		 * 根据classname查找元素，返回list
		 *
		 * @param id
		 * @return
		 * @throws Exception 
		 */
		public List<WebElement> findElementsByClassName(String className){
			try {
				List<WebElement> elements = null;
				int i = 3;
				do {
					int j = 4 - i;
					logger.info("第" + j + "查找元素" + className);
					elements = myDriver.findElements(By.className(className));
					i--;
				} while (elements.size() == 0 && i >= 0);
				
				if(elements.size() == 0){
					logger.info("没查找到" + className + "的元素");
				}
				return elements;
			} catch (Exception e) {
				return null;
			}
		}
		
		/**
		 * 根据classname查找元素，返回element
		 *
		 * @param id
		 * @return
		 * @throws Exception 
		 */
		public WebElement findElementByClassName(String className){
			try {
				WebElement element = null;
				int i = 3;
				do {
					int j = 4 - i;
					logger.info("第" + j + "查找元素" + className);
					element = myDriver.findElement(By.className(className));
					i--;
				} while (element == null && i >= 0);
				
				if(element == null){
					logger.info("没查找到" + className + "的元素");
				}
				return element;
			} catch (Exception e) {
				return null;
			}
		}
		
		/**
		 * 根据xpath查找元素，返回list
		 *
		 * @param id
		 * @return
		 * @throws Exception 
		 */
		public List<WebElement> findElementsByXpath(String xpathExpression){
			try {
				List<WebElement> elements = null;
				int i = 3;
				do {
					int j = 4 -i;
					logger.info("第" + j + "查找元素" + xpathExpression);
					elements = myDriver.findElements(By.xpath(xpathExpression));
					i--;
				} while (elements.size() == 0 &&  i >= 0);
				
				if(elements.size() == 0){
					logger.info("没查找到" + xpathExpression + "的元素");
				}
				return elements;
			} catch (Exception e) {
				return null;
			}
		}
		
		/**
		 * 根据xpath查找元素，返回list
		 *
		 * @param id
		 * @return
		 * @throws Exception 
		 */
		public WebElement findElementByXpath(String xpathExpression){
			try {
				WebElement element = null;
				int i = 3;
				do {
					int j = 4 -i;
					logger.info("第" + j + "查找元素" + xpathExpression);
					element = myDriver.findElement(By.xpath(xpathExpression));
					i--;
				} while (element == null &&  i >= 0);
				
				if(element == null){
					logger.info("没查找到" + xpathExpression + "的元素");
				}
				return element;
			} catch (Exception e) {
				return null;
			}
		}
		
		/**
		 * 根据linkText查找元素，返回element
		 *
		 * @param id
		 * @return
		 * @throws Exception 
		 */
		public WebElement findElementByLinkText(String linkText){
			try {
				WebElement element = null;
				int i = 3;
				do {
					int j = 4 -i;
					logger.info("第" + j + "查找元素" + linkText);
					element = myDriver.findElement(By.linkText(linkText));
					i--;
				} while (element == null &&  i >= 0);
				
				if(element == null){
					logger.info("没查找到" + linkText + "的元素");
				}
				return element;
			} catch (Exception e) {
				return null;
			}
		}
		
		/**
		 * 根据IosUIAutomation查找元素，返回list
		 *
		 * @param id
		 * @return
		 * @throws Exception 
		 */
		public List<WebElement> findElementsByIosUIAutomation(String using){
			try {
				List<WebElement> elements = null;
				int i = 3;
				do {
					int j = 4 -i;
					logger.info("第" + j + "查找元素" + using);
					elements = myDriver.findElements(MobileBy.IosUIAutomation(using));
					i--;
				} while (elements.size() == 0 &&  i >= 0);
				
				if(elements.size() == 0){
					logger.info("没查找到" + using + "的元素");
				}
				return elements;
			} catch (Exception e) {
				return null;
			}
		}
		
		/**
		 * 根据IosUIAutomation查找元素，返回element
		 *
		 * @param id
		 * @return
		 * @throws Exception 
		 */
		public WebElement findElementByIosUIAutomation(String using){
			try {
				WebElement element = null;
				int i = 3;
				do {
					int j = 4 -i;
					logger.info("第" + j + "查找元素" + using);
					element = myDriver.findElement(MobileBy.IosUIAutomation(using));
					i--;
				} while (element == null &&  i >= 0);
				
				if(element == null){
					logger.info("没查找到" + using + "的元素");
				}
				return element;
			} catch (Exception e) {
				return null;
			}
		}
		
		/**
		 * 根据AccessibilityId查找元素，返回list
		 *
		 * @param id
		 * @return
		 * @throws Exception 
		 */
		public List<WebElement> findElementsByAccessibilityId(String id){
			try {
				List<WebElement> elements = null;
				int i = 3;
				do {
					int j = 4 -i;
					logger.info("第" + j + "查找元素" + id);
					elements = myDriver.findElements(MobileBy.AccessibilityId(id));
					i--;
				} while (elements.size() == 0 &&  i >= 0);
				
				if(elements.size() == 0){
					logger.info("没查找到" + id + "的元素");
				}
				return elements;
			} catch (Exception e) {
				return null;
			}
		}
		
		/**
		 * 根据AccessibilityId查找元素，返回element
		 *
		 * @param id
		 * @return
		 * @throws Exception 
		 */
		public WebElement findElementByAccessibilityId(String id){
			try {
				WebElement element = null;
				int i = 3;
				do {
					int j = 4 -i;
					logger.info("第" + j + "查找元素" + id);
					element = myDriver.findElement(MobileBy.AccessibilityId(id));
					i--;
				} while (element == null &&  i >= 0);
				
				if(element == null){
					logger.info("没查找到" + id + "的元素");
				}
				return element;
			} catch (Exception e) {
				return null;
			}
		}
		
		/**
		 * 点击元素
		 * @param element
		 * @return void
		 */
		public void click(WebElement element){
			element.click();
		}
		
		/**
		 * 获取元素文本
		 * @param element
		 * @return str
		 */
		public String getText(WebElement element){
			return element.getText();
		}
		
		/**
		 * 输入数据
		 * @param element
		 * @param str
		 */
		public void sendKeys(WebElement element,String str){
			element.sendKeys(str);
		}
		
		/**
		 * 获取控件的属性值
		 * @param element
		 * @param Attribute
		 * @return
		 */
		public String getControlAttributeValue(WebElement element,String Attribute){
			return element.getAttribute(Attribute);
		}
		
		/**
		 * 翻页
		 *
		 */
		public Object executeJs(String script,Object...args){
			JavascriptExecutor js = (JavascriptExecutor)myDriver;
			return js.executeScript(script, args);
		}
		
		public void scrollRight2Left(){
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "right");	
			this.executeJs("mobile: scroll", scrollObject);
		}
		
		public void scrollLeft2Right(){
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "left");	
			this.executeJs("mobile: scroll", scrollObject);
		}
		
		public void scrollTop2Down(){
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "down");	
			executeJs("mobile: scroll", scrollObject);
		}
		
		public void scrollDown2Top(){
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "up");	
			this.executeJs("mobile: scroll", scrollObject);
		}

		public void click_js(double x,double y){
			HashMap<String, Double> tapObject = new HashMap<String, Double>();
			tapObject.put("tapCount",1.0);
			tapObject.put("touchCount", 1.0);
			tapObject.put("duration", 0.5);
			tapObject.put("x", x); 
			tapObject.put("y", y);
			this.executeJs("mobile: tap", tapObject);
			
		}
		
		
		
		
		public boolean isLogin() throws Exception {
			WebElement title = this.findElementByXpath("//UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]");
			boolean isNotLogined = getText(title).equals("我的账户");
			if(isNotLogined){
				return false;
			}else
			return true;
		}

		
		public void clickBackButton() throws Exception {
			WebElement backButton = this.findElementByName("Back");
			click(backButton);	
		}

		
		public boolean waitForText(String text) {
			// TODO Auto-generated method stub
			return false;
		}

	}

