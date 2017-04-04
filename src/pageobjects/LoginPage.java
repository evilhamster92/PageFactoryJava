package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import components.InputField;

public class LoginPage {

	@FindBy(xpath = "//input[@name='user_name']")
	public WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;

	public InputField Username() {
		return new InputField(username);
	}

	public InputField Password() {
		return new InputField(password);
	}

	public void sendUser(String user) {
		username.sendKeys(user);
	}

}
