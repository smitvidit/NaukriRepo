package pages;

import org.openqa.selenium.By;

public class HomePage {

	public static By sureBtn = By.id("allow");
	public static By LoginButtonHeader = By.id("login_Layer");
	public static By Email = By.cssSelector("input[id*=eLogin]");
	public static By Password = By.id("pLogin");
	public static By Login = By.cssSelector("button[value='Login']");

}
