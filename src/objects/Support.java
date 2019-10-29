package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Support {

	private static final String CLICK_SUPPORT_XPATH = "//a[contains(text(),'SUPPORT')]";
	
	public static WebElement getSupport(WebDriver driver) {
		return driver.findElement(By.xpath(CLICK_SUPPORT_XPATH));
	}
	public static void clickSupport(WebDriver driver) {
		getSupport(driver).click();
	}
}
