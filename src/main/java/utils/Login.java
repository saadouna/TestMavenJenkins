package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login {
	@Test
	public static void Enregistrement(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='header-account-menu']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@id='account-signin']")).click();
		Thread.sleep(2000);
		// Set email
		driver.findElement(By.xpath("//input[@id='gss-signin-email']")).sendKeys("saadmoutmir@hotmail.com");
		;
		// set password
		driver.findElement(By.xpath("//input[@id='gss-signin-password']")).sendKeys("Azerty080189");

		driver.findElement(By.xpath("//input[@id='fi-email']")).sendKeys("saadmoutmir@hotmail.com");
		driver.findElement(By.xpath("//input[@id='fi-password']")).sendKeys("Azert080189");

		driver.findElement(By.xpath("//form[@id='authForm']/div[4]/div/label")).click();

		// click register
		driver.findElement(By.xpath("//*[@id=\"authForm\"]/div[7]/button")).click();

	}
	
	@Test
	public static void login(WebDriver driver) throws InterruptedException {
		String urlcurrent = driver.getCurrentUrl();
		if (!urlcurrent.equalsIgnoreCase("https://www.travelocity.com/user/signin?ckoflag=0")) {
			driver.get("https://www.travelocity.com/user/signin?ckoflag=0");
			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@id='signin-loginid']")).sendKeys("saadmoutmir@hotmail.com");
			;
			// set password
			driver.findElement(By.xpath("//input[@id='signin-password']")).sendKeys("Azerty080189");

			driver.findElement(By.xpath("//button[@id='submitButton']")).click();

			/*
			 * driver.findElement(By.xpath("//button[@id='header-account-menu']")).click();
			 * Thread.sleep(2000);
			 * 
			 * 
			 * driver.findElement(By.xpath("//a[@id='account-signin']")).click();
			 * Thread.sleep(3000); //Set email
			 * driver.findElement(By.xpath("//input[@id='gss-signin-email']")).sendKeys(
			 * "saadmoutmir@hotmail.com");; //set password
			 * driver.findElement(By.xpath("//input[@id='gss-signin-password']")).sendKeys(
			 * "Azerty080189");
			 * 
			 * driver.findElement(By.xpath("//button[@id='gss-signin-submit']")).click();
			 */
		} else {
			Thread.sleep(2000);
			// Set email
			driver.findElement(By.xpath("//input[@id='signin-loginid']")).sendKeys("saadmoutmir@hotmail.com");
			;
			// set password
			driver.findElement(By.xpath("//input[@id='signin-password']")).sendKeys("Azerty080189");

			driver.findElement(By.xpath("//button[@id='submitButton']")).click();
		}

	}

	@Test
	public static void reserverVol(WebDriver driver) throws InterruptedException {
		// choose flight
		driver.findElement(By.cssSelector("#tab-flight-tab-flp")).click();
		// fill one way

		driver.findElement(By.id("flight-type-roundtrip-label-flp")).click();
		// fill from

		driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]")).sendKeys("Paris, France (ORY-Orly)");
		// fill destination

		driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"))
				.sendKeys("Casablanca, Morocco (CMN-Mohammed V)");

		// choose date
		driver.findElement(By.id("flight-departing-flp")).clear();
		driver.findElement(By.id("flight-departing-flp")).sendKeys("12/12/2019");
		driver.findElement(By.id("flight-returning-flp")).clear();
		driver.findElement(By.id("flight-returning-flp")).sendKeys("30/12/2019");

		// search

		//driver.findElement(By.cssSelector(".datepicker-close-btn")).click();
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath(
				"/html/body/meso-native-marquee/section/div/div/div[1]/div/div/div[1]/div/section[1]/form/div[8]/label"));
		List<WebElement> listelem = element.findElements((By.tagName("button")));

		System.out.println("taille = " + listelem.size());
		for (int i = 0; i <= listelem.size(); i++) {
			System.out.println("text = " + listelem.get(i).getText());
			if (listelem.get(i).getText().equalsIgnoreCase("Search"))

			{
				listelem.get(i).click();
				break;
			}

		}
		/*
		 * WebElement boutton=
		 * driver.findElement(By.cssSelector(".cols-nested:nth-child(23) .btn-primary"))
		 * ; Actions actions = new Actions(driver);
		 * 
		 * actions.moveToElement(boutton).click().perform();
		 */
	}
	
	@Test
	public static void chooseVol(WebDriver driver) throws InterruptedException, IOException
	{	
		Thread.sleep(3000);
		//select aller				
		
		
		clickWaitVisibility("/html/body/div[2]/div[10]/section/div/div[10]/ul/li[1]/div[1]/div[1]/div[2]/div/div[2]/button", 3, driver);
		//driver.findElement(By.xpath("/html/body/div[2]/div[10]/section/div/div[10]/ul/li[1]/div[1]/div[1]/div[2]/div/div[2]/button")).click();
		// cliquer sur selectionner bagages 
		Thread.sleep(1500);
		List<WebElement> flare2 = driver.findElements(By.xpath("/html/body/div[2]/div[10]/section/div/div[10]/ul/li[1]/div[2]/div/div/div/section/div/button"));
		if(flare2.size()==0)
		{
		clickWaitVisibility("/html/body/div[2]/div[10]/section/div/div[10]/ul/li[1]/div[2]/div/div/div/div[1]/button", 3, driver);
		}
		//driver.findElement(By.xpath("")).click();
		else
		{
			clickWaitVisibility("/html/body/div[2]/div[10]/section/div/div[10]/ul/li[1]/div[2]/div/div/div/section/div/button", 3, driver);
		}
			Thread.sleep(2000);
			
			
			


			 ( ( JavascriptExecutor ) driver )
			            .executeScript( "window.onbeforeunload = function(e){};" );

		//select retour		
			clickWaitVisibility("/html/body/div[2]/div[10]/section/div/div[10]/ul/li[1]/div[1]/div[1]/div[2]/div/div[2]/button", 3, driver);
			
			driver.findElement(By.xpath("/html/body/div[2]/div[10]/section/div/div[10]/ul/li[1]/div[1]/div[1]/div[2]/div/div[2]/button")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div[10]/section/div/div[10]/ul/li[1]/div[1]/div[1]/div[2]/div/div[2]/button")).click();
		// cliquer sur selectionner bagages 
		
		Thread.sleep(1500);
		
		List<WebElement> flare = driver.findElements(By.xpath("/html/body/div[2]/div[10]/section/div/div[10]/ul/li[1]/div[2]/div/div/div/section/div/button"));
		if(flare.size()==0)
		{
		clickWaitVisibility("/html/body/div[2]/div[10]/section/div/div[10]/ul/li[1]/div[2]/div/div/div/div[1]/button", 3, driver);
		}
		//driver.findElement(By.xpath("")).click();
		else
		{
			clickWaitVisibility("/html/body/div[2]/div[10]/section/div/div[10]/ul/li[1]/div[2]/div/div/div/section/div/button", 3, driver);
		}
		
		
		
		
		
		/*
		List<WebElement> flare3 = driver.findElements(By.xpath("/html/body/div[2]/div[10]/section/div/div[10]/ul/li[1]/div[2]/div/div/div/section/div/button"));
		if(flare3.size()==0)
		{
		clickWaitVisibility("/html/body/div[2]/div[10]/section/div/div[10]/ul/li[1]/div[2]/div/div/div/div[1]/button", 3, driver);
		}
		else
			{clickWaitVisibility("/html/body/div[2]/div[10]/section/div/div[10]/ul/li[1]/div[2]/div/div/div/section/div/button", 3, driver);}
		*/
		
		//driver.findElement(By.xpath("")).click();
		
		//WebElement noThanksButton = getWebElement("a", "id", "forcedChoiceNoThanks", driver);
		//noThanksButton.click();
		//clickWaitVisibility("//*[@id=\"forcedChoiceNoThanks\"]",2,driver);
		Thread.sleep(1000);
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(2000);
		
		clickElement("input","aria-label","Upgrade to Economy Standard",driver);
	//	driver.findElement(By.id("fareFamilyListRadio-2non-split")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#bookButton")));
	    element.click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@id='firstname[0]']")).sendKeys("saad");
		driver.findElement(By.xpath("//input[@id='lastname[0]']")).sendKeys("moutmir");
		
		driver.findElement(By.xpath("//select[@id='country_code[0]']")).click();
		//((JavascriptExecutor) driver).executeScript("document.getElementById('ctl00_mainContent_ddl_Adult').style.display='block';");
		
		
		Select country_code = new Select(driver.findElement(By.id("country_code[0]")));
		country_code.selectByValue("33");
		
		driver.findElement(By.xpath("//article[@id='preferences']/form/fieldset/fieldset/div/div/label")).click();
		
		Select passport = new Select(driver.findElement(By.id("passport[0]")));
		passport.selectByValue("4280902");
		
		driver.findElement(By.xpath("//input[@id='no_insurance']")).click();
		
		driver.findElement(By.xpath("(//input[@name='cardholder_name'])[2]")).sendKeys("card name");
		driver.findElement(By.xpath("//input[@id='creditCardInput']")).sendKeys("99999999999");
		
		Select expiration_month = new Select(driver.findElement(By.name("expiration_month")));
		expiration_month.selectByValue("12");
		
		Select expiration_year = new Select(driver.findElement(By.name("expiration_year")));
		expiration_year.selectByValue("2021");
		
		driver.findElement(By.xpath("//input[@id='new_cc_security_code']")).sendKeys("444");
		
		
		
		
		
		
		
		////////create file & fill it 
		
		
	    WebElement resume = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[1]/div[9]/div[2]/section/article[1]/div[1]/div/a")));
	    resume.click();
	    Thread.sleep(1000);
	    
		 File file = new File("output.data");							
	       if (!file.exists()) file.createNewFile();
		 try		
	        {	  
	            // Delete old file if exists
						
	            FileWriter fileWrite = new FileWriter(file,true);			 				
	            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
	            // loop for getting the information 		
	            String allerinfo=	driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[9]/div[2]/section/article[1]/div[1]/div/div[1]/div[1]")).getText();
	            String datedepart = driver.findElement(By.xpath("//*[@id=\"oneway-date-leg1-seg1\"]")).getText();
	            String productDecrAller = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[9]/div[2]/section/article[1]/div[1]/div/div[1]/div[3]")).getText();
	            String Infoaller ="Aller="+driver.findElement(By.xpath("//*[@id=\"flight-date-leg1-seg1\"]")).getText();
	            Infoaller=Infoaller+driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[9]/div[2]/section/article[1]/div[1]/div/div[2]/div/div[1]/div/div[4]")).getText();
	            String InfoRetour ="Retour ="+driver.findElement(By.xpath("//*[@id=\"flight-date-leg2-seg1\"]")).getText();
	            InfoRetour=InfoRetour+driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[9]/div[2]/section/article[1]/div[1]/div/div[2]/div/div[2]/div/div[4]")).getText();
	            String price = driver.findElement(By.xpath("//*[@id=\"totalPriceForTrip\"]")).getText();
	    
	            // loop for getting the information 		
	           		
	                Bwrite.write((allerinfo+";"+datedepart+";"+productDecrAller+";"+Infoaller+";"+InfoRetour+";"+price));																									
	                Bwrite.newLine();             
	            			
	            Bwrite.close();			
	            fileWrite.close();	
	            
	        }
	        catch(Exception ex)					
	        {		
	            ex.printStackTrace();			
	        }	
		
		
		

		

		/*WebElement Upgrade = getWebElement("div", "data-product-identifier", "coach-O--coach-O---CLASSIC", driver);
		System.out.println("class = "+Upgrade.getClass());
		Upgrade.click();
		/*
		
		//clickElement("input","aria-label","Upgrade to Classic",driver);
		
		
		/*
		WebElement element = driver.findElement(By.id(
			"bCol"));
	
		List<WebElement> listelem = element.findElements((By.tagName("div")));

		System.out.println("taille = " + listelem.size());
		for (int i = 0; i < listelem.size(); i++) {
			System.out.println("+++++++++++++++++++++++++++++++++++");
			System.out.println("text = " + listelem.get(i).getAttribute("button"));
			System.out.println("+++++++++++++++++++++++++++++++++++");
		List<WebElement> listej = listelem.get(i).findElements(By.tagName("button"));
		for (int j = 0; j < listej.size(); j++) {
			
			
			if(listej.get(j).getClass().toString().equalsIgnoreCase("btn-secondary btn-action t-select-btn"))
			{
				System.out.println("here");
				listej.get(j).click();
				break;
			}
			
		}

		}
		*/
		
	}
	
	
	public static void clickElement(String tagName,String attribute, String value, WebDriver driver)
	{
		List<WebElement> oCheckBoxs = driver.findElements(By.tagName(""+tagName));
		int iSize = oCheckBoxs.size();
		for(int i=0; i < iSize ; i++ ){
			String sValue = oCheckBoxs.get(i).getAttribute(""+attribute);
			 if (sValue.equalsIgnoreCase(""+value)){
				 oCheckBoxs.get(i).click();
				 break;
				 }
		}
	}
	public static WebElement getWebElement(String tagName,String attribute, String value, WebDriver driver)
	{
		List<WebElement> oCheckBoxs = driver.findElements(By.tagName(""+tagName));
		int iSize = oCheckBoxs.size();
		for(int i=0; i < iSize ; i++ ){
			String sValue = oCheckBoxs.get(i).getAttribute(""+attribute);
			 if (sValue.equalsIgnoreCase(""+value)){
				return oCheckBoxs.get(i);
				
				 }
		}
		return null;
	}
	public static void clickWaitVisibility(String xPath,int seconds,WebDriver driver)
	{

		WebElement element = driver.findElement(By.xpath(""+xPath));
		WebDriverWait wait = new WebDriverWait(driver, seconds); 

		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
		
	}
	
	
}
