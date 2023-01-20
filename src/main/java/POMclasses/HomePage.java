package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(id="amount") private WebElement AmtTab;
	
	public HomePage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnAmount() 
	{
		AmtTab.click();;
	}
	
	public String amountButton() 
	{
		
		if ( AmtTab.isEnabled()) 
		{
			System.out.println("amount button clicked sucessfully");
		}
		else 
		{
			System.out.println("not clickable");
		}
		return null;
	}
	
}

