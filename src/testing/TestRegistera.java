package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import objects.Register;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestRegistera {
  @Test
  public void testRegistrationSuccess() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		String HOMEPAGE_URL = "http://newtours.demoaut.com/";
		driver.get(HOMEPAGE_URL);

		Register.clickRegister(driver);
		Register.inputFirstName(driver, "Moses");
		Register.inputLastName(driver, "Sizzlack");
		Register.inputPhone(driver, "055-440-433");
		Register.inputEmail(driver, "sizzlackshut@gmail.com");
		
		for (int i = 1; i < 2; i++) {
			Register.inputAdress(driver, i, "Windy Route");

		}
		for (int i = 2; i < 3; i++) {
			Register.inputAdress(driver, i, "322");

		}
		Register.inputCity(driver, "Taladega");
		Register.inputState(driver, "Michigan");
		Register.inputPostal(driver, "329322");
		Register.selectCountry(driver);
		Register.inputUsername(driver, "moses88");
		Register.inputPassword(driver, "asdzxc");
		Register.inputConfirmPass(driver, "asdzxc");
		Register.clearFirstName(driver);
		Register.inputFirstName(driver, "Mo");
		
		Register.clickSubmit(driver);
		Thread.sleep(5000);
		String URL_TEST = driver.getCurrentUrl();
		String EXPECTED_URL = "http://newtours.demoaut.com/create_account_success.php";
		Assert.assertEquals(URL_TEST, EXPECTED_URL, "registration failed");
		driver.quit();
  }
}
