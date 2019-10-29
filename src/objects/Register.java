package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register {
	private static final String CLICK_REGISTER_XPATH = "//a[contains(text(),'REGISTER')]";
	private static final String INPUT_FIRSTNAME_BYNAME = "firstName";
	private static final String INPUT_LASTNAME_XPATH = "//input[@name='lastName']";
	private static final String INPUT_PHONE_XPATH = "//input[@name='phone']";
	private static final String INPUT_EMAIL_XPATH ="//input[@id='userName']";
	private static final String INPUT_ADRESS1_XPATH = "//input[@name='address";//i = 1;
	private static final String ENDING_XPATH = "']";
	private static final String INPUT_CITY_XPATH = "//input[@name='city']";
	private static final String INPUT_STATE_XPATH = "//input[@name='state']";
	private static final String POSTAL_XPATH = "//input[@name='postalCode']";
	private static final String SELECT_COUNTRY_XPATH = "//select[@name='country']";
	private static final String USERNAME_XPATH = "//input[@id='email']";
	private static final String PASSWORD_XPATH = "//input[@name='password']";
	private static final String CONFIRMPASSWORD_XPATH = "//input[@name='confirmPassword']";
	private static final String CLICK_SUBMIT_XPATH = "//input[@name='register']";
	
	
	
	public static WebElement getClickReg(WebDriver driver) {
		return driver.findElement(By.xpath(CLICK_REGISTER_XPATH));
	}
	public static void clickRegister(WebDriver driver) {
		getClickReg(driver).click();
	}
	public static WebElement getFirstName(WebDriver driver) {
		return driver.findElement(By.name(INPUT_FIRSTNAME_BYNAME));
	}
	public static void inputFirstName(WebDriver driver, String firstname) {
		getFirstName(driver).sendKeys(firstname);
	}
	public static WebElement getLastName(WebDriver driver) {
		return driver.findElement(By.xpath(INPUT_LASTNAME_XPATH));
	}
	public static void inputLastName(WebDriver driver, String lastname) {
		getLastName(driver).sendKeys(lastname);
	
}
	public static WebElement getPhone(WebDriver driver) {
		return driver.findElement(By.xpath(INPUT_PHONE_XPATH));
	}
	public static void inputPhone(WebDriver driver,String phone) {
		getPhone(driver).sendKeys(phone);
	}
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(INPUT_EMAIL_XPATH));
	}
	public static void inputEmail(WebDriver driver, String email) {
		getEmail(driver).sendKeys(email);
	}
	public static WebElement getAdress(WebDriver driver, int i) {
		return driver.findElement(By.xpath(INPUT_ADRESS1_XPATH+i+ENDING_XPATH));
	}
	public static void inputAdress(WebDriver driver, int i, String adress) {
		getAdress(driver, i).sendKeys(adress);
	}
	public static WebElement getCity(WebDriver driver) {
		return driver.findElement(By.xpath(INPUT_CITY_XPATH));
	}
	public static void inputCity(WebDriver driver, String city) {
		getCity(driver).sendKeys(city);
	}
	public static WebElement getState(WebDriver driver) {
		return driver.findElement(By.xpath(INPUT_STATE_XPATH));
	}
	public static void inputState(WebDriver driver, String state) {
		getState(driver).sendKeys(state);
	}
	public static WebElement getPostal(WebDriver driver) {
		return driver.findElement(By.xpath(POSTAL_XPATH));
	}
	public static void inputPostal(WebDriver driver, String postal) {
		getPostal(driver).sendKeys(postal);
	}
	public static Select getCountry(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_COUNTRY_XPATH)));
	}
	public static void selectCountry(WebDriver driver) {
		getCountry(driver).selectByVisibleText("SWEDEN");
	}
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
	public static WebElement getConfirmPass(WebDriver driver) {
		return driver.findElement(By.xpath(CONFIRMPASSWORD_XPATH));
	}
	public static void inputConfirmPass(WebDriver driver, String confirmpass) {
		getConfirmPass(driver).sendKeys(confirmpass);
	}
	public static WebElement getSubmit(WebDriver driver) {
		return driver.findElement(By.xpath(CLICK_SUBMIT_XPATH));
	}
	public static void clickSubmit(WebDriver driver) {
		getSubmit(driver).click();
	}
	public static WebElement getClearedFirstname(WebDriver driver) {
		return driver.findElement(By.name(INPUT_FIRSTNAME_BYNAME));
	}
	public static void clearFirstName(WebDriver driver) {
		getClearedFirstname(driver).clear();
	}
	
}