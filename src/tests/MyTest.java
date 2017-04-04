package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import factories.WebdriverFactory;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class MyTest {
	WebDriver driver;
	HomePage homepage;
	LoginPage loginpage;

	@Before
	public void before() {
		driver = WebdriverFactory.getDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
	}

	@Test
	public void actualTest() {
		driver.navigate().to("http://www.myanimelist.net");

		// homepage.OpenProfileMenu();
		homepage.LoginButton().hover();
		homepage.LoginButton().click();

		loginpage.Username().cacat("blablacaca"); //folosit asa pentru a putea apela metodele speciale pentru fiecare webcomponent in parte
		loginpage.Password().cacat("testpass1");
	}
}
