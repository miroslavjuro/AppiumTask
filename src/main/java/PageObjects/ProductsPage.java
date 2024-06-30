package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ProductsPage extends Actions {
	
	AppiumDriver driver;

	public ProductsPage(AppiumDriver driver){
		
		super(driver);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public CartPage cart(){
		cart.click();
		return new CartPage(driver);
	}
	
	public void addProductsToCart(String[] products) {
		for (int i=0; i<products.length; i++) {
			scrollToElement(products[i]);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='"+products[i]+"']/parent::android.widget.LinearLayout/parent::android.widget.RelativeLayout//android.widget.TextView[@text='ADD TO CART']")).click();
		}
		String productAmountString = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/counterText\"]")).getAttribute("text");
		int productAmount = Integer.parseInt(productAmountString);
		Assert.assertTrue(productAmount==products.length);
	}
	
	@FindBy (id="com.androidsample.generalstore:id/appbar_btn_cart")
	private WebElement cart;
	
}
