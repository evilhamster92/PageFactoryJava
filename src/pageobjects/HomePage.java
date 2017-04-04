package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import components.Button;

public class HomePage {

	@FindBy(css = ".header-profile-link")
	private WebElement headerProfile;

	@FindBy(xpath = "//a[@class='btn-login']")
	private WebElement loginButton;

	public void OpenProfileMenu() {
		headerProfile.click();
	}

	public void OpenLoginPage() {
		loginButton.click();
	}

	public Button HeaderProfile() {
		return new Button(headerProfile);
	}

	public Button LoginButton() {
		return new Button(loginButton);
	}

}
