package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AfterLogin {

	private static final String CHOOSE_TYPE_XPATH = "//body//b//input[2]";
	private static final String CHOOSE_PASSENGERS_XPATH = "//select[@name='passCount']";
	private static final String CHOOSE_DEPARTURE_XPATH = "//select[@name='fromPort']";
	private static final String CHOOSE_MONTH_XPATH = "//select[@name='fromMonth']";
	private static final String CHOOSE_DAY_XPATH = "//select[@name='fromDay']";
	private static final String CHOOSE_DESTINATION_XPATH = "//select[@name='toPort']";
	private static final String CHOOSE_RETURNDATE_XPATH = "//select[@name='toMonth']";
	private static final String CHOOSE_RETURNDAY_XPATH = "//select[@name='toDay']";
	private static final String CHOOSE_AIRLINE_XPATH = "//select[@name='airline']";
	private static final String CLICK_CONTINUE_XPATH = "//input[@name='findFlights']";
	private static final String DEPART_PLANE_XPATH = "//table//table//table//table//table[1]//tbody[1]//tr[9]//td[1]//input[1]";
	private static final String RETURN_PLANE_XPATH = "//table[2]//tbody[1]//tr[7]//td[1]//input[1]";
	private static final String CONTINUE_RESERVE_XPATH = "//input[@name='reserveFlights']";
	
	public static WebElement getType(WebDriver driver) {
		return driver.findElement(By.xpath(CHOOSE_TYPE_XPATH));
	}
	public static void clickType(WebDriver driver) {
		getType(driver).click();
	}
	public static Select getPassengers(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(CHOOSE_PASSENGERS_XPATH)));
	}
	public static void selectPassengers(WebDriver driver) {
		getPassengers(driver).selectByVisibleText("1");
	}
	public static Select getDeparture(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(CHOOSE_DEPARTURE_XPATH)));
	}
	public static void selectDeparture(WebDriver driver) {
		getDeparture(driver).selectByVisibleText("Zurich");
	}
	public static Select getMonth(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(CHOOSE_MONTH_XPATH)));
	}
	public static void selectMonth(WebDriver driver) {
		getMonth(driver).selectByVisibleText("January");
	}
	public static Select getDay(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(CHOOSE_DAY_XPATH)));
	}
	public static void selectDay(WebDriver driver) {
		getDay(driver).selectByVisibleText("20");
	}
	public static Select getDesto(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(CHOOSE_DESTINATION_XPATH)));
	}
	public static void selectDesto(WebDriver driver) {
		getDesto(driver).selectByVisibleText("Frankfurt");
	}
	public static Select getReturnDate(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(CHOOSE_RETURNDATE_XPATH)));
	}
	public static void selectReturnDate(WebDriver driver) {
		getReturnDate(driver).selectByVisibleText("February");
	}
	public static Select getReturnDay(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(CHOOSE_RETURNDAY_XPATH)));
	}
	public static void selectReturnDay(WebDriver driver) {
		getReturnDay(driver).selectByVisibleText("30");
	}
	public static Select getAirliner(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(CHOOSE_AIRLINE_XPATH)));
	}
	public static void selectAirliner(WebDriver driver) {
		getAirliner(driver).selectByVisibleText("Blue Skies Airlines");
	}
	public static WebElement getContinue(WebDriver driver) {
		return driver.findElement(By.xpath(CLICK_CONTINUE_XPATH));
	}
	public static void clickContinue(WebDriver driver) {
		getContinue(driver).click();
	}
	public static WebElement getDepart(WebDriver driver) {
		return driver.findElement(By.xpath(DEPART_PLANE_XPATH));
	}
	public static void clickDepart(WebDriver driver) {
		getDepart(driver).click();
	}
	public static WebElement getReturn(WebDriver driver) {
		return driver.findElement(By.xpath(RETURN_PLANE_XPATH));
	}
	public static void clickReturn(WebDriver driver) {
		getReturn(driver).click();
	}
	public static WebElement getContinuePlane(WebDriver driver) {
		return driver.findElement(By.xpath(CONTINUE_RESERVE_XPATH));
	}
	public static void clickContinuePlane(WebDriver driver) {
		getContinuePlane(driver).click();
	}
}
