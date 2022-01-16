package com.kerjapraktek.merchant.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kerjapraktek.merchant.driver.DriverSingleton;

public class Validasi {

	private WebDriver driver;
	
	 public Validasi(){
		// TODO Auto-generated constructor stub
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[13]/a")
	private WebElement btnValidasi;
	
	@FindBy(css = "#data-worklist > tbody > tr:nth-child(1) > td:nth-child(5) > a > i")
	private WebElement btnAction;
	
	@FindBy(xpath = "//*[@id=\"form_survey\"]/footer/a[2]")
	private WebElement btnAprrove;
	
	public void gotoValidasi() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		btnValidasi.click();
		btnAction.click();
		js.executeScript("window.scrollBy(0,1000)");
		btnAprrove.click();
	}
}
