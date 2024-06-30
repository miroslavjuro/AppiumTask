package PageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class CartPage extends Actions {
	
	AppiumDriver driver;
	

	public CartPage(AppiumDriver driver){
		
		super(driver);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyIfProductsAreDisplayed(String[] str){
		
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]);
			scrollToElement(str[i]);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='"+str[i]+"']")).isDisplayed();
		}
	}
	
}
