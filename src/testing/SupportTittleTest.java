package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import objects.Support;

public class SupportTittleTest {
  @Test
  public void titleTest() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String EXPECTED_TITLE = "Under Construction: Mercury Tours";
			String HOMEPAGE_URL = "http://newtours.demoaut.com/";
			driver.get(HOMEPAGE_URL);
			Support.clickSupport(driver);
			Thread.sleep(2000);
			String TITLE = driver.getTitle();
			System.out.println(TITLE);
			Assert.assertEquals(TITLE, EXPECTED_TITLE,"not on Support page, tittle mismatch");
			
			
			
			driver.quit();
  }
}
