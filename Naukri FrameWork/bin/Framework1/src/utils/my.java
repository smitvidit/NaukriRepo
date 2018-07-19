package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class my extends Browser {

	public static void click(By locator) {
		driver.findElement(locator).click();
	}

	public static void waitAndClick(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(locator).click();
	}

	public static void sendKeys(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}

	public static void sendKeys(By locator, Keys value) {
		driver.findElement(locator).sendKeys(value);
	}

	public static void waitAndsendKeys(By locator, Keys value) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(locator).sendKeys(value);
	}

	public static String getText(By locator) {

		System.out.println("Get Text Method is called");
		System.out.println(locator);
		String abc = driver.findElement(locator).getText();
		return abc;
	}

	public static void ActionPerform(By locator) {
		WebElement element = driver.findElement(locator);

		Actions action = new Actions(driver);

		action.moveToElement(element).perform();

	}

	public static void wait(By locator) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	public static void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	public static void scrollElement(By locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(locator);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
