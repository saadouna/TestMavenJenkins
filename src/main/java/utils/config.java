package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class config {
	
	public static WebDriver setparam()
	{
		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver", "D:\\Nouveau dossier\\geckodriver.exe");
		return	 driver = new FirefoxDriver();
	}
	
	@Test
	public static void setBaseURL(WebDriver driver)
	{
		driver.manage().window().maximize();
		String url = "https://www.travelocity.com/Flights";
		driver.get(url);
	}
}
