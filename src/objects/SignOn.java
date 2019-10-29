package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignOn {

	private static final String USERNAME_XPATH = "//input[@name='userName']";
	private static final String PASSWORD_XPATH = "//input[@name='password']	";
	private static final String CLICK_SUBMIT_XPATH = "//input[@name='login']";
	private static final String CLICK_SIGNON_XPATH = "//a[contains(text(),'SIGN-ON')]";
	
	public static WebElement getUsername(WebDriver driver) {
		return driver.findElement(By.xpath(USERNAME_XPATH));
	}
	public static void inputUsername(WebDriver driver, String username) {
		getUsername(driver).sendKeys(username);
	}
	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD_XPATH));
	}
	public static void inputPassword(WebDriver driver, String password) {
		getPassword(driver).sendKeys(password);
	}
	public static WebElement getSubmit(WebDriver driver) {
		return driver.findElement(By.xpath(CLICK_SUBMIT_XPATH));
	}
	public static void clickSubmit(WebDriver driver) {
		getSubmit(driver).click();
	}
	public static WebElement getSignon(WebDriver driver) {
		return driver.findElement(By.xpath(CLICK_SIGNON_XPATH));
	}
	public static void clickSignon(WebDriver driver) {
		getSignon(driver).click();
		
	}
	
	
}
