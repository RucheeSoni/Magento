

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By email=By.id("email");
	By pass=By.id("pass");
	By login=By.id("send2");
	
	public void typeEmail()
	{
		driver.findElement(email).sendKeys("ruchee.soni110@gmail.com");
	}
	
	public void typePass()
	{
		driver.findElement(pass).sendKeys("Welcome123");
	}
	
	public void clickOnLogin()
	{
		driver.findElement(login).click();
	}
}
