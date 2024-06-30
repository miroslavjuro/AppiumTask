package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class GeneralStorePage extends Actions {
	
	AppiumDriver driver;
	
	public GeneralStorePage(AppiumDriver driver){
		
		super(driver);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectCountry(String ele){		
		spinnerCountry.click();
		scrollToElementAndClick(ele);		
	}
	
	public void nameTextField(String ele) {
		nameTextField.sendKeys(ele);
	}
	
	public void genderMale(){
		genderMale.click();
	}
	
	public ProductsPage letsShopButton(){
		letsShopButton.click();
		return new ProductsPage(driver);
	}
	
	@FindBy (id="com.androidsample.generalstore:id/spinnerCountry")
	private WebElement spinnerCountry;
	
	@FindBy (id="com.androidsample.generalstore:id/nameField")
	private WebElement nameTextField;
	
	@FindBy (xpath="//android.widget.RadioButton[@resource-id=\"com.androidsample.generalstore:id/radioMale\"]\n")
	private WebElement genderMale;
	
	@FindBy (xpath="//android.widget.Button[@resource-id='com.androidsample.generalstore:id/btnLetsShop']")
	private WebElement letsShopButton;

}
