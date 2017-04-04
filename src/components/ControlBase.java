package components;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import factories.WebdriverFactory;

public abstract class ControlBase {
	public WebElement webElement;

	public ControlBase(WebElement webElement) {
		this.webElement = webElement;
	}

	private static int TIMEOUT_SECONDS = 45;
	private static int POOLING_PERIOD = 1;

	/**
	 * Wait for the webElement to be visible given an expected condition.
	 * 
	 * @param cond
	 * @return
	 */
	public WebElement waitForElement(ExpectedCondition<?> cond) {
		return (WebElement) getFluentWait().until(cond);
	}

	private Wait<WebDriver> getFluentWait() {
		Wait<WebDriver> wait = new FluentWait<>(WebdriverFactory.getDriver())
				.withTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS).pollingEvery(POOLING_PERIOD, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class, ElementNotVisibleException.class);
		return wait;
	}

	public boolean isDisplayed() {
		System.out.println("isDisplayed: " + webElement.toString());
		return waitForElement(ExpectedConditions.visibilityOf(webElement)).isDisplayed();
	}

	public String getText() {
		return webElement.getText();
	}
}
