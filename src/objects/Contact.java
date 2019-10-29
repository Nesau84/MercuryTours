package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact {

	private static final String CLICK_CONTACT_XPATH = "//a[contains(text(),'CONTACT')]";
	
	public static WebElement getContact(WebDriver driver) {
		return driver.findElement(By.xpath(CLICK_CONTACT_XPATH));
	}
	public static void clickContact(WebDriver driver) {
		getContact(driver).click();
	}
	
}
