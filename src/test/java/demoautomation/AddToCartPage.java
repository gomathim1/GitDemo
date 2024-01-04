package demoautomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends BaseClass{
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Nokia Lumia 1020 4G Cell Phone (Unlocked)']")
	private WebElement product;
	@FindBy(xpath="//button[@id='add-to-cart-button-18']")
	private WebElement addToCart;
	@FindBy(xpath="//h2[@class='product-title']")
	private List<WebElement> products;
	
	public WebElement getProduct() {
		return product;
	}
	public WebElement getAddToCart() {
		return addToCart;
	}
	public List<WebElement> getProducts() {
		return products;
	}
	
	public void addToCartOperations() {
		//WebElement product2 = getProduct();
		WebElement addToCart2 = getAddToCart();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Nokia')]"));
		List<WebElement> products2 = driver.findElements(By.xpath("//h2[@class='product-title']"));
		/*
		 * for(WebElement ele: products2) { String text = getText(ele);
		 * if(text.contains("Nokia")) { click(ele); } }
		 */
		//click(element);
		//click(addToCart2);
	}
	
}
