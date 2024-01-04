package demoautomation;

import java.io.IOException;

import org.testng.annotations.Test;

public class RunnerClass extends BaseClass{
	
	@Test
	public void execution() throws IOException, InterruptedException {
		LoginPage login = new LoginPage();
		login.LoginPageOperations();
		ProductPage product = new ProductPage();
		product.ProductPageOperations();
		SortByFilter sort = new SortByFilter();
		sort.SortBy();
		AddToCartPage cart = new AddToCartPage();
		cart.addToCartOperations();
	}
	

}
