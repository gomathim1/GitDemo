package demoautomation;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	 LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='ico-login']")
	private WebElement login;
	@FindBy(id="Email")
	private WebElement email ;
	@FindBy(id="Password")
	private WebElement password;
	@FindBy(xpath="//button[@class='button-1 login-button']")
	private WebElement loginButton;
	
	public WebElement getLogin() {
		return login;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	 	
	
	public void LoginPageOperations() throws IOException {
		WebElement login2 = getLogin();
		WebElement email2 = getEmail();
		WebElement password2 = getPassword();
		WebElement loginButton2 = getLoginButton();
		click(login2);
		sendKeys(email2, getValueFromPropFile("userName"));
		sendKeys(password2, getValueFromPropFile("password"));
		click(loginButton2);
		
	}
	
	

}
