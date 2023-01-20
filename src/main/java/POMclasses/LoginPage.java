package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="username")private WebElement username;
	@FindBy(id="password")private WebElement password;
	@FindBy(id="log-in")private WebElement Login;


	public LoginPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUsername(String Un) 
	{
		username.sendKeys(Un);
	}
	
	public void EnterPassword(String Pass) 
	{
		password.sendKeys(Pass);
	}
	
	public void ClickOnLoginButton() 
	{
		Login.click();
	}
	
	
}