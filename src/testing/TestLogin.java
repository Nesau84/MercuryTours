package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import objects.SignOn;

public class TestLogin {
  @Test
  public void loginCheck() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String EXPECTED_URL = "http://newtours.demoaut.com/mercuryreservation.php";
		String HOMEPAGE_URL = "http://newtours.demoaut.com/";

		driver.get(HOMEPAGE_URL);
		SignOn.clickSignon(driver);
		SignOn.inputUsername(driver, "moses88");
		WebElement we = driver.findElement(By.name("userName"));
		String we1 = we.getAttribute("value");
		System.out.println(we1);
		
		SignOn.inputPassword(driver, "asdzxc");
		SignOn.clickSubmit(driver);
		Thread.sleep(2000);
		String TEST_URL = driver.getCurrentUrl();
		Assert.assertEquals(TEST_URL, EXPECTED_URL, "Login failed");
		
		driver.quit();
  }
}
