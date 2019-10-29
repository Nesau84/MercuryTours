package testing;

import org.openqa.selenium.WebDriver;

public class BooleanLogin {
	private static String LOGEDIN_URL = "http://newtours.demoaut.com/mercuryreservation.php";
	//simple boolean practice
	public static boolean LoginTest(WebDriver driver) {
		if(driver.getCurrentUrl().equals(LOGEDIN_URL)) {
			System.out.println("Login success");
			return true;
		}else {
			System.out.println("Login failed");
			return false;
		}
		
	}
	
}
