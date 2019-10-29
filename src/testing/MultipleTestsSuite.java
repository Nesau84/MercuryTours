package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.AfterLogin;
import objects.BookFlight;
import objects.Register;
import objects.SignOn;

public class MultipleTestsSuite {
	@Test
	public void multipleTests() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		SoftAssert sa = new SoftAssert(); //SoftAssert for runing multiple tests in one @Test
	
		String USERNAME_XPATH = "//input[@name='userName']";
		String HOMEPAGE_URL = "http://newtours.demoaut.com/";
		String PASS_XPATH = "//input[@name='password']";
		String EXPECTED_LOG_URL = "http://newtours.demoaut.com/create_account_success.php";
		String EXPECTED_SIGNON_TITLE = "Sign-on: Mercury Tours";
		String EXPECTED_USERNAME = "moses788"; //set to fail test
		String EXPECTED_PASSWORD = "asdzxc";
		String EXPECTED_PASSENGER_COUNT = "3"; //set to fail test
		String EXPECTED_RADIOBUTTON_TEST = "true";
		driver.get(HOMEPAGE_URL);
		
		try {
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
			String WP = driver.getCurrentUrl();
			//System.out.println(WP);

			String signoff = "//a[contains(text(),'SIGN-OFF')]";
			driver.findElement(By.xpath(signoff)).click();
			Thread.sleep(2000);
			String SO = driver.getTitle();
			//System.out.println(SO);
			Thread.sleep(2000);
			SignOn.inputUsername(driver, "moses88");
			WebElement UN = driver.findElement(By.xpath(USERNAME_XPATH));
			String UNcheck = UN.getAttribute("value");
			//System.out.println(UNcheck);
			SignOn.inputPassword(driver, "asdzxc");
			WebElement IP = driver.findElement(By.xpath(PASS_XPATH));
			String IPcheck = IP.getAttribute("value");
			//System.out.println(IPcheck);
			SignOn.clickSubmit(driver);
	
			Thread.sleep(2000);
			BooleanLogin.LoginTest(driver); // simple boolean login test

			AfterLogin.clickType(driver);
			String XPTH = "//body//b//input[2]";	//check is desired radio button selected
			WebElement button = driver.findElement(By.xpath(XPTH));
			boolean check =  button.isSelected();
			
			//System.out.println(check);
			if (check==true) {
			System.out.println("good radio button chosen");
			
			}else {
				System.out.println("wrong radio button chosen");
			}
			Thread.sleep(1000);
			AfterLogin.selectPassengers(driver);
			Select passengers = new Select(driver.findElement(By.name("passCount")));
			WebElement options = passengers.getFirstSelectedOption();	//geting the first option after selecting desired number of passengers
			String PassengersCount = options.getAttribute("value");	//geting the number of passengers 
			//System.out.println(PassengersCount);
			AfterLogin.selectDeparture(driver);
			AfterLogin.selectMonth(driver);
			AfterLogin.selectDay(driver);
			AfterLogin.selectDesto(driver);
			AfterLogin.selectReturnDate(driver);
			AfterLogin.selectReturnDay(driver);
			AfterLogin.clickContinue(driver);

			Thread.sleep(2000);
			AfterLogin.clickDepart(driver);
			AfterLogin.clickReturn(driver);
			AfterLogin.clickContinuePlane(driver);

			Thread.sleep(2000);

			BookFlight.inputFirstName(driver, "Mario");
			BookFlight.inputLastName(driver, "Soprano");
			BookFlight.selectMeal(driver);
			BookFlight.selectCreditCard(driver);
			Select dropdown = new Select(driver.findElement(By.name("creditCard")));
			WebElement option = dropdown.getFirstSelectedOption();
			String content = option.getText();	//geting the name of creditCard after choosing it.
			//System.out.println(content);
			String CARD = "Visa";	//expected credit card name.
			sa.assertEquals(WP, EXPECTED_LOG_URL,"Registration failed");
			sa.assertEquals(SO, EXPECTED_SIGNON_TITLE,"Wrong page title");
			sa.assertEquals(UNcheck, EXPECTED_USERNAME,"Wrong username input");
			sa.assertEquals(IPcheck, EXPECTED_PASSWORD,"Wrong password input");
			sa.assertEquals(PassengersCount, EXPECTED_PASSENGER_COUNT,"Wrong passenger count");
			sa.assertEquals(CARD, content,"Bad credit card chosen");
			sa.assertEquals(check, EXPECTED_RADIOBUTTON_TEST,"Wrong radiobutton checked");
			sa.assertAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			driver.quit();
		}
	}
}
