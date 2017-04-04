package factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Handle the current webdriver instance.
 */
public class WebdriverFactory {

	private static WebDriver webDriverInstance = createWebDriverInstance();

	/**
	 * This will return the current webdriver instance.
	 * 
	 * @return
	 * @throws Exception
	 */
	public static WebDriver getDriver() {
		if (webDriverInstance != null) {
			// maximize the window, before any action is to be done on it.
			webDriverInstance.manage().window().maximize();
			return webDriverInstance;
		} else {
			// throw new Exception("There was a problem with the current
			// webdriver instance");
		}
		return webDriverInstance;
	}

	/**
	 * Create a new firefoxDriver instance.
	 * 
	 * @return
	 */
	private static WebDriver createWebDriverInstance() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adrianba\\Downloads\\Trash\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		// WebDriver driver = new InternetExplorerDriver();
		// return new FirefoxDriver();
		return new ChromeDriver();
		// return new InternetExplorerDriver(caps);
		// return new SafariDriver();
	}

	/**
	 * Refreshes the browser
	 */
	public static void refresh() {
		webDriverInstance.navigate().refresh();
	}
}
