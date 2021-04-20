package Demo_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Test3 
{
	@Test
	public void openurl() 
	{
	WebDriverManager.getInstance(CHROME).setup();
	//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	String s = driver.getCurrentUrl();
	System.out.println(s);
	driver.close();
	}
}

