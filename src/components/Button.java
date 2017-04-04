package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import factories.WebdriverFactory;

//@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Button extends ControlBase {

	public Button(WebElement webElement) {
		super(webElement);
	}

	public void click() {
		webElement = waitForElement(ExpectedConditions.elementToBeClickable(webElement));
		System.out.println("performing a click on: " + webElement.toString());
		webElement.click();
	}

	public void doubleClick() {
		webElement = waitForElement(ExpectedConditions.elementToBeClickable(webElement));
		System.out.println("performing a doubleClick on: " + webElement.toString());
		Actions action = new Actions(WebdriverFactory.getDriver());
		action.doubleClick(webElement).perform();
	}

	public void hover() {
		webElement = waitForElement(ExpectedConditions.elementToBeClickable(webElement));
		System.out.println("performing a hover on: " + webElement.toString());
		Actions action = new Actions(WebdriverFactory.getDriver());
		action.moveToElement(webElement).perform();
	}

}
