package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static ChromeOptions options;
	
	

	public static final int TIMEOUT = 60;

	public static void Launch(String BrowserType) {
		String ProjectPath = System.getProperty("user.dir");
		System.out.println(ProjectPath);

		if (BrowserType.equals("FF")) {

		} else if (BrowserType.equals("CHROME")) {
			System.setProperty("webdriver.chrome.driver", ProjectPath + "/libs/chromedriver.exe");

			options = new ChromeOptions();
			System.out.println("Window is Maximized");
			options.addArguments("--disable-notifications");
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);

		}
		wait = new WebDriverWait(driver, TIMEOUT);

	}

	public static void OpenUrl(String URL) {
		driver.get(URL);
	}

	public static void quit() {
		driver.quit();
	}
}
