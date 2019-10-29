package mainProgram;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objects.AfterLogin;
import objects.BookFlight;
import objects.Contact;
import objects.Register;
import objects.SignOn;
import objects.Support;
import testing.BooleanLogin;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		try {
			String HOMEPAGE_URL = "http://newtours.demoaut.com/";
			driver.get(HOMEPAGE_URL);

			Register.clickRegister(driver);
			Register.inputFirstName(driver, "Moses");
			Register.inputLastName(driver, "Sizzlack");
			Register.inputPhone(driver, "055-440-433");
			Register.inputEmail(driver, "sizzlackshut@gmail.com");
			// little complications for practice purposes
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

			String signoff = "//a[contains(text(),'SIGN-OFF')]";
			driver.findElement(By.xpath(signoff)).click();
			Thread.sleep(2000);
			SignOn.inputUsername(driver, "moses88");
			SignOn.inputPassword(driver, "asdzxc");
			SignOn.clickSubmit(driver);
			Thread.sleep(2000);
			BooleanLogin.LoginTest(driver); // simple boolean login test

			AfterLogin.clickType(driver);
			AfterLogin.selectPassengers(driver);
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
			BookFlight.inputCreditCardNr(driver, "8372");
			BookFlight.selectExpirationMonth(driver);
			BookFlight.selectExpirationYr(driver);
			BookFlight.inputFirstname(driver, "Nebojsa");
			BookFlight.inputMiddlename(driver, "Krenki");
			BookFlight.inputLastname(driver, "Uskokovic");
			BookFlight.clearBillingAdress(driver);
			BookFlight.inputBillingAdress(driver, "Pere Segedinca");
			BookFlight.inputBillingAdress2(driver, "32");
			BookFlight.inputCity(driver, "Belgrade");
			BookFlight.clearState(driver);
			BookFlight.inputState(driver, "Serbia");
			BookFlight.inputPostal(driver, "10020");
			BookFlight.selectCountry(driver);
			BookFlight.clickSameAsAdress(driver);
			BookFlight.clickPurchase(driver);
			BookFlight.clickHome(driver);

			Thread.sleep(10000);

			Support.clickSupport(driver);
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);

			Contact.clickContact(driver);
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			driver.quit();
		}

	}
}