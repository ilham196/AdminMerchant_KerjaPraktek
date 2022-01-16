package com.kerjapraktek.merchant.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kerjapraktek.merchant.driver.DriverSingleton;

public class SendQR {
	
	private WebDriver driver;
	
	public SendQR() {
		// TODO Auto-generated constructor stub
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	} 

	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[10]/a")
	private WebElement btnDecision;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[10]/ul/li[3]/a")
	private WebElement btnSendQR;
	
	@FindBy(css = "#data-customers-approve_filter > label:nth-child(1) > input")
	private WebElement txtSearching;
	
	@FindBy(xpath = "//*[@id=\"btnSearch\"]")
	private WebElement btnSearch;
	
	@FindBy(css = "#data-customers-approve > tbody > tr:nth-child(1) > td:nth-child(1)")
	private WebElement btnAction;
	
	@FindBy(css = "#data-customers-approve > tbody > tr.child > td > ul > li > span.dtr-data > a:nth-child(3) > span")
	private WebElement btnViewDetail;
	
	@FindBy(css = "#data-customers-approve > tbody > tr.child > td > ul > li > span.dtr-data > a:nth-child(2) > span")
	private WebElement btnView;
	
	@FindBy(css = "#data-customers-approve > tbody > tr.child > td > ul > li > span.dtr-data > a.btn.btn-xs.btn-success")
	private WebElement btnReceived;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/div[2]/div/div[12]/div/span")
	private WebElement btnViewDetail2;
	
	@FindBy(xpath = "//*[@id=\"modalFoto\"]/div/div/div[1]/button")
	private WebElement btnCloseViewDetail;
	
	@FindBy(css = "#modalFoto > div > div > div.modal-header > button")
	private WebElement btnCloseView;
	
	public void gotoSendQR() {
		btnDecision.click();
		btnSendQR.click();
	}
	
	public void SendQR(String searchQR) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		txtSearching.sendKeys(searchQR);
		btnSearch.click();
		btnView.click();
		btnCloseView.click();
		btnReceived.click();
	}
	

}
