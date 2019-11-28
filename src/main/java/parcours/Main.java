package parcours;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utils.Login;
import utils.config;


public class Main {

	@Test
	public static void main() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Connexion");
	WebDriver driver = config.setparam( );
	config.setBaseURL(driver);
	Thread.sleep(2000);
	
	//Login.Enregistrement(driver);
	//Login.login(driver);
	System.out.println("Reservation");
	Login.reserverVol(driver);
	Thread.sleep(2000);
	Login.chooseVol(driver);
	System.out.println("Fin");
	
	}
	

}
