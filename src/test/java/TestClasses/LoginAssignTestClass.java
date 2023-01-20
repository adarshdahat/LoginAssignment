package TestClasses;

import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LoginassingmentBaseClasses.LoginAssingmentBaseClass;
import POMclasses.HomePage;
import POMclasses.LoginPage;
import UtilityClasses.LoginAssingmentutilityClass;

public class LoginAssignTestClass extends LoginAssingmentBaseClass
{
	LoginPage login;
	HomePage home;
	
	@BeforeClass
	public void OpenBrowser() throws IOException 
	{
		launchBrowser();
		Reporter.log("Browser open sucessfully");
	}
	@BeforeMethod
	public void Login () throws IOException, InterruptedException 
	{
		login = new LoginPage(driver);
		home = new HomePage(driver);
		login.EnterUsername(LoginAssingmentutilityClass.ReadDataFromLoginAssign("username"));
		login.EnterPassword(LoginAssingmentutilityClass.ReadDataFromLoginAssign("password"));
		login.ClickOnLoginButton();
	    Thread.sleep(3000);
		
	}
	
	@Test
  public void validateAmounttab() 
{
		home.ClickOnAmount();
		home.amountButton();
		
 }
}
