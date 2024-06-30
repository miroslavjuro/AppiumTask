package PageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class Actions {
	
	AppiumDriver driver;
	
		public Actions(AppiumDriver driver)
		{
			this.driver =driver;
			PageFactory.initElements(driver, this);
		}
		
		public void scrollToElementAndClick(String ele)
		{
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ele+"\"))")).click();
		}
		
		public void scrollToElement(String ele)
		{
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ele+"\"))"));
		}
}
