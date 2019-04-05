

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MagentoTest 
{

	@Test
	public void positiveCredential1()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.magento.com");
		
		Welcome w=new Welcome(driver);
		w.clickOnMyAccount();
		
		Login l=new Login(driver);
		l.typeEmail();
		l.typePass();
		l.clickOnLogin();
		
		Main m=new Main(driver);
		m.clickOnLogout();
		
		driver.close();

	}

}
