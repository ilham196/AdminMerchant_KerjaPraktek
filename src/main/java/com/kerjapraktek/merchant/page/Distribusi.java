package com.kerjapraktek.merchant.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kerjapraktek.merchant.driver.DriverSingleton;

public class Distribusi {
	
	private WebDriver driver;
	
	 public Distribusi(){
		// TODO Auto-generated constructor stub
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	} 
	 
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[12]/a")
	private WebElement btnDistribusi;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/div[2]/p/span/a[1]")
	private WebElement btnNew;
	
	@FindBy(xpath = "//*[@id=\"select2-sales-b3-container\"]")
	private WebElement btnMS;
	
	@FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
	private WebElement txtSearchingMS;
	
	@FindBy(css = "#data-distribusi > tbody > tr:nth-child(2) > td:nth-child(1) > input[type=checkbox]")
	private WebElement btnCheckbox;
	
	@FindBy(xpath = "//*[@id=\"btnSave\"]")
	private WebElement btnSaveDistribusi;
	
	public void Distribusi(String search) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		btnDistribusi.click();
		btnNew.click();
		btnMS.click();
		txtSearchingMS.sendKeys(search);
		txtSearchingMS.sendKeys(Keys.ENTER);
		js.executeScript("window.scrollBy(0,250");
		btnCheckbox.click();
		js.executeScript("window.scrollBy(0,1000)");
		btnSaveDistribusi.click();
		
	}

}
