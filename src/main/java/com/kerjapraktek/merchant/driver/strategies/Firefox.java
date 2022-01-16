package com.kerjapraktek.merchant.driver.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {

	public WebDriver setStrategy() {
		System.setProperty("webdriver.gecko.driver", "E:\\Eclipse\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
