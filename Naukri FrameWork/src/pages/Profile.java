package pages;

import org.openqa.selenium.By;

public class Profile {

	
 public static By ResumeHeadline = By.cssSelector("#lazyResumeHead > div > div > div > div.widgetHead > span.edit.icon");
 public static By ResumeHeadlineTextArea = By.id("resumeHeadlineTxt");
 public static By ResumeHeadlineSubmit = By.cssSelector("button[class='waves-effect waves-light btn-large blue-btn'][type='submit']");

}
