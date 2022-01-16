package com.kerjapraktek.merchant.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kerjapraktek.merchant.driver.DriverSingleton;


public class MonitoringMD {
	
	private WebDriver driver;
	
	public MonitoringMD() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[14]/a")
	private WebElement btnMonitoringMD;
	
	@FindBy(xpath = "//*[@id=\"data-monitoring\"]/tbody/tr[2]/td[10]/a")
	private WebElement btnView;
	
	public void MonitoringMD() {
		btnMonitoringMD.click();
		btnView.click();
	}
}
