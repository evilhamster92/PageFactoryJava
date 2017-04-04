package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InputField extends ControlBase {

	public InputField(WebElement webElement) {
		super(webElement);
	}

	public void sendText(String text) {
		webElement = waitForElement(ExpectedConditions.visibilityOf(webElement));
		webElement.clear();
		webElement.sendKeys(text);
	}

	public void cacat(String text) {
		webElement = waitForElement(ExpectedConditions.visibilityOf(webElement));
		webElement.clear();
		webElement.sendKeys(text);
	}
}
