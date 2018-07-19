package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Profile;
import pages.UserHomePage;
import utils.Browser;
import utils.my;

public class MyTest {

	@BeforeTest
	public void setup() {
		Browser.Launch("CHROME");
		Browser.OpenUrl("https://www.naukri.com/");

	}

	@Test
	public void hello() throws InterruptedException {

		Thread.sleep(2000);

		String winHandleBefore = Browser.driver.getWindowHandle();

		System.out.println("This is window handle before Popup  " + winHandleBefore);
		// Switch to new window opened
		for (String winHandle : Browser.driver.getWindowHandles()) {
			System.out.println(winHandle);
			Browser.driver.switchTo().window(winHandle);
		}

		Browser.driver.close();

		// switch back to main window using this code
		Browser.driver.switchTo().window(winHandleBefore);

		my.waitAndClick(HomePage.sureBtn);
		Thread.sleep(2000);

		my.click(HomePage.LoginButtonHeader);

		Thread.sleep(2000);
		String email = "viditpatel7@gmail.com";

		my.waitAndSendKeysString(HomePage.Email, email);
		my.sendKeys(HomePage.Password, "asiwish");
		my.click(HomePage.Login);

		my.waitAndClick(UserHomePage.UpdateProfile);

		String resumeHeading = "Result-oriented professional offering 3+ years of rich experience in Quality assurance, Automation Testing using Selenium Webdriver with Good Exposure to CI/CD and GitHub as source code management tool. Proficient in Data Driven Framework development";

		Thread.sleep(2000);

		my.click(Profile.ResumeHeadline);
		Thread.sleep(2000);
		my.TextClear(Profile.ResumeHeadlineTextArea);
		my.sendKeys(Profile.ResumeHeadlineTextArea, resumeHeading);
		my.click(Profile.ResumeHeadlineSubmit);

	}
}
