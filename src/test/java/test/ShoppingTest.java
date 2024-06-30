package test;
import org.testng.annotations.Test;

import PageObjects.CartPage;
import PageObjects.GeneralStorePage;
import PageObjects.ProductsPage;

public class ShoppingTest extends BaseTest {
	
	
	//Happy path scenario
	@Test
	public void addProductsToCardHappy() throws InterruptedException
	{
		GeneralStorePage general = new GeneralStorePage(driver);
		String[] products = {"Air Jordan 4 Retro", "Air Jordan 1 Mid SE", "Converse All Star"};

		general.scrollToElementAndClick("Australia");
		general.nameTextField("Miroslav");
		general.genderMale();
		ProductsPage productsPage = general.letsShopButton();
		productsPage.addProductsToCart(products);
		CartPage cartPage = productsPage.cart();
		cartPage.verifyIfProductsAreDisplayed(products);

	}
	
	// Test Object Model Design Pattern is implemented for better maintenance
	// another test scenario could be negative path: e.g. without filling name and checking if "Please enter your name" popup is displayed
	
	

}
