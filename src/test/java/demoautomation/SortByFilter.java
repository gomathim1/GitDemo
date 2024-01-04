package demoautomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortByFilter extends BaseClass {
	public SortByFilter() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="products-orderby")
	private WebElement order;
	@FindBy(id="products-pagesize")
	private WebElement display;
	
	public WebElement getOrder() {
		return order;
	}
	public WebElement getDisplay() {
		return display;
	}
	
	
	public void SortBy() throws InterruptedException {
		WebElement order2 = getOrder();
		WebElement display2 = getDisplay();
		
		select(order2,"Price: Low to High");
		select(display2,"3");
		
		
	}
	
	
	
	

}
