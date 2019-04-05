

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main 
{
WebDriver driver;
	
	public Main(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By myacct=By.linkText("Log Out");
	
	public void clickOnLogout()
	{
		driver.findElement(myacct).click();
	}
}
