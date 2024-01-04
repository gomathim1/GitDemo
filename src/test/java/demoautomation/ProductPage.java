package demoautomation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseClass{
	ProductPage(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[text()='Electronics '])[1]")
	private WebElement electronics ;
	@FindBy(xpath="//a[text()='Cell phones ']")
	private WebElement cellphone;
	@FindBy(xpath="//h2[@class='product-title']")
	private List<WebElement> products;
	
	
	public WebElement getElectronics() {
		return electronics;
	}
	public WebElement getCellphone() {
		return cellphone;
	}
	public List<WebElement> getProducts() {
		return products;
	}
	
	public void ProductPageOperations() {
		WebElement electronics2 = getElectronics();
		Actions action=  new Actions(driver);
		action.moveToElement(electronics2).perform();
		WebElement cellphone2 = getCellphone();
		List<WebElement> products2 = getProducts();
		
		click(cellphone2);
		for(WebElement element: products2) {
			String text = getText(element);
			System.out.println(text);
		}
	}
	
	
}
