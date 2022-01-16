package com.kerjapraktek.merchant.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kerjapraktek.merchant.driver.DriverSingleton;

public class ReceivedQR {
	
	private WebDriver driver;
	
	public ReceivedQR() {
		// TODO Auto-generated constructor stub
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[10]/a/span")
	private WebElement btnDecision;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[10]/ul/li[4]/a")
	private WebElement btnReceivedQR;
	
	@FindBy(css = "#data-customers-approve_filter > label:nth-child(1) > input")
	private WebElement txtSearchReceived;
	
	@FindBy(xpath = "//*[@id=\"btnSearch\"]")
	private WebElement btnSearch;
	
	@FindBy(css = "#data-customers-approve > tbody > tr:nth-child(1) > td:nth-child(1)")
	private WebElement btnAction;
	
	@FindBy(xpath = "//*[@id=\"data-customers-approve\"]/tbody/tr[3]/td/ul/li/span[2]/a[2]/span")
	private WebElement btnView;
	
	@FindBy(css = "#modalFoto > div > div > div.modal-header > button")
	private WebElement btnCloseView;
	
	@FindBy(xpath = "//*[@id=\"data-customers-approve\"]/tbody/tr[3]/td/ul/li/span[2]/a[1]")
	private WebElement btnDelivMD;
	
	public void gotoReceivedQR() {
		btnDecision.click();
		btnReceivedQR.click();
	}
	
	public void ReceivedQR(String searchreceived) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		txtSearchReceived.sendKeys(searchreceived);
		btnSearch.click();
		btnView.click();
		btnCloseView.click();
	}

}
