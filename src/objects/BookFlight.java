package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookFlight {

	private static final String FIRST_NAME_XPATH = "//input[@name='passFirst0']";
	private static final String LAST_NAME_XPATH = "//input[@name='passLast0']";
	private static final String SELECT_MEAL_XPATH = "//select[@name='pass.0.meal']";
	private static final String SELECT_CREDIT_CARD_XPATH = "//select[@name='creditCard']";
	private static final String INPUT_CREDIT_CARD_XPATH = "//input[@name='creditnumber']";
	private static final String SELECT_EXPIRATION1_XPATH = "//select[@name='cc_exp_dt_mn']";
	private static final String SELECT_EXPIRATION2_XPATH = "//select[@name='cc_exp_dt_yr']";
	private static final String CC_FIRSTNAME_XPATH = "//input[@name='cc_frst_name']";
	private static final String CC_MIDDLENAME_XPATH = "//input[@name='cc_mid_name']";
	private static final String CC_LASTNAME_XPATH = "//input[@name='cc_last_name']";
	private static final String BILLING_ADRESS_XPATH = "//input[@name='billAddress1']";
	private static final String BILLING_ADRESS2_XPATH = "//input[@name='billAddress2']";
	private static final String BILLING_CITY_XPATH = "//input[@name='billCity']";
	private static final String BILLING_STATE_XPATH = "//input[@name='billState']";
	private static final String BILLING_POSTAL_XPATH = "//input[@name='billZip']";
	private static final String SELECT_COUNTRY_XPATH = "//select[@name='billCountry']";
	private static final String CLICK_SAME_AS_ADRESS_XPATH = "//tr[14]//td[2]//input[1]";
	private static final String SECURE_PURCHASE_XPATH = "//input[@name='buyFlights']";
	private static final String BACKHOME_XPATH = "//td//td//td//td[2]//a[1]//img[1]";
	
	public static WebElement getFirstName(WebDriver driver) {
		return driver.findElement(By.xpath(FIRST_NAME_XPATH));
	}
	public static void inputFirstName(WebDriver driver, String firstname) {
		getFirstName(driver).sendKeys(firstname);
	}
	public static WebElement getLastName(WebDriver driver) {
		return driver.findElement(By.xpath(LAST_NAME_XPATH));
	}
	public static void inputLastName(WebDriver driver, String lastname) {
		getLastName(driver).sendKeys(lastname);
	}
	public static Select getMeal(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_MEAL_XPATH)));
	}
	public static void selectMeal(WebDriver driver) {
		getMeal(driver).selectByVisibleText("Diabetic");
	}
	public static Select getCreditCard(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_CREDIT_CARD_XPATH)));
	}
	public static void selectCreditCard(WebDriver driver) {
		getCreditCard(driver).selectByVisibleText("Visa");
	}
	public static WebElement getCreditNr(WebDriver driver) {
		return driver.findElement(By.xpath(INPUT_CREDIT_CARD_XPATH));
	}
	public static void inputCreditCardNr(WebDriver driver, String creditNr) {
		getCreditNr(driver).sendKeys(creditNr);
	}
	public static Select getExpirationMonth(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_EXPIRATION1_XPATH)));
	}
	public static void selectExpirationMonth(WebDriver driver) {
		getExpirationMonth(driver).selectByVisibleText("05");
	}
	public static Select getExpirationYr(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_EXPIRATION2_XPATH)));
	}
	public static void selectExpirationYr(WebDriver driver) {
		getExpirationYr(driver).selectByVisibleText("2010");
	}
	public static WebElement getFirstname(WebDriver driver) {
		return driver.findElement(By.xpath(CC_FIRSTNAME_XPATH));
	}
	public static void inputFirstname(WebDriver driver, String firstname) {
		getFirstname(driver).sendKeys(firstname);
	}
	public static WebElement getMiddlename(WebDriver driver) {
		return driver.findElement(By.xpath(CC_MIDDLENAME_XPATH));
	}
	public static void inputMiddlename(WebDriver driver, String middlename) {
		getMiddlename(driver).sendKeys(middlename);
	}
	public static WebElement getLastname(WebDriver driver) {
		return driver.findElement(By.xpath(CC_LASTNAME_XPATH));
	}
	public static void inputLastname(WebDriver driver, String lastname) {
		getLastname(driver).sendKeys(lastname);
	}
	public static WebElement getBillingAdress(WebDriver driver) {
		return driver.findElement(By.xpath(BILLING_ADRESS_XPATH));
	}
	public static void clearBillingAdress(WebDriver driver) {
		getBillingAdress(driver).clear();
	}
	public static void inputBillingAdress(WebDriver driver, String adress) {
		getBillingAdress(driver).sendKeys(adress);
	}
	public static WebElement getBillingAdress2(WebDriver driver) {
		return driver.findElement(By.xpath(BILLING_ADRESS2_XPATH));
	}
	public static void inputBillingAdress2(WebDriver driver, String adress2) {
		getBillingAdress2(driver).sendKeys(adress2);
	}
	public static WebElement getCity(WebDriver driver) {
		return driver.findElement(By.xpath(BILLING_CITY_XPATH));
	}
	public static void inputCity(WebDriver driver,String city) {
		getCity(driver).sendKeys(city);
	}
	public static WebElement getState(WebDriver driver) {
		return driver.findElement(By.xpath(BILLING_STATE_XPATH));
	}
	public static void clearState(WebDriver driver) {
		getState(driver).clear();
	}
	public static void inputState(WebDriver driver, String state) {
		getState(driver).sendKeys(state);
	}
	public static WebElement getPostal(WebDriver driver) {
		return driver.findElement(By.xpath(BILLING_POSTAL_XPATH));
	}
	public static void inputPostal(WebDriver driver, String postal) {
		getPostal(driver).sendKeys(postal);
	}
	public static Select getCountry(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_COUNTRY_XPATH)));
	}
	public static void selectCountry(WebDriver driver) {
		getCountry(driver).selectByVisibleText("YUGOSLAVIA");
	}
	public static WebElement getSameAsAdress(WebDriver driver) {
		return driver.findElement(By.xpath(CLICK_SAME_AS_ADRESS_XPATH));
	}
	public static void clickSameAsAdress(WebDriver driver) {
		getSameAsAdress(driver).click();
	}
	public static WebElement getPurchase(WebDriver driver) {
		return driver.findElement(By.xpath(SECURE_PURCHASE_XPATH));
	}
	public static void clickPurchase(WebDriver driver) {
		getPurchase(driver).click();
	}
	public static WebElement getHome(WebDriver driver) {
		return driver.findElement(By.xpath(BACKHOME_XPATH));
	}
	public static void clickHome(WebDriver driver) {
		getHome(driver).click();
	}
}
