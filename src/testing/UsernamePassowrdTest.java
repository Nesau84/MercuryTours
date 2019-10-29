package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.SignOn;

public class UsernamePassowrdTest {
	@Test
	public void UsernamePassTest() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		try {
			String USERNAME = "moses888";//will fail
			String PASSWORD = "asdzxcc";//will fail
			String HOMEPAGE_URL = "http://newtours.demoaut.com/";
			SoftAssert sa = new SoftAssert();
			driver.get(HOMEPAGE_URL);
			SignOn.clickSignon(driver);
			SignOn.inputUsername(driver, "moses88");
			WebElement we = driver.findElement(By.name("userName"));
			String we1 = we.getAttribute("value");
			System.out.println(we1);
			SignOn.inputPassword(driver, "asdzxc");
			WebElement pa = driver.findElement(By.name("password"));
			String pa1 = pa.getAttribute("value");
			System.out.println(pa1);
			sa.assertEquals(we1, USERNAME);
			sa.assertEquals(pa1, PASSWORD);
			sa.assertAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			driver.quit();
		}
	}
}