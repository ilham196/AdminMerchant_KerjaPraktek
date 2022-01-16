package com.kerjapraktek.merchant.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kerjapraktek.merchant.driver.DriverSingleton;

public class DeliverytoMD {

	private WebDriver driver;
	
	public DeliverytoMD() {
		// TODO Auto-generated constructor stub
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[10]/a/span")
	private WebElement btnDecision;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[10]/ul/li[5]/a")
	private WebElement btnDeliverytoMD;
	
	@FindBy(css = "#data-customers-approve_filter > label:nth-child(1) > input")
	private WebElement txtSearching;
	
	@FindBy(xpath = "//*[@id=\"btnSearch\"]")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//*[@id=\"data-customers-approve\"]/tbody/tr[5]/td/ul/li/span[2]/a[1]/span")
	private WebElement btnView;
	
	@FindBy(css = "#modalFoto > div > div > div.modal-header > button")
	private WebElement btnCloseView;
	
	public void gotoDeliveryMD() {
		btnDecision.click();
		btnDeliverytoMD.click();
	}
	
	public void DeliverytoMD(String searchmd) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		txtSearching.sendKeys(searchmd);
		btnSearch.click();
		btnView.click();
		btnCloseView.click();
	}
}
