package com.kerjapraktek.merchant.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kerjapraktek.merchant.driver.DriverSingleton;

public class UploadDataQRIS {
	
	private WebDriver driver;
	
	public UploadDataQRIS() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[4]/a/span")
	private WebElement btnMerchant1;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[4]/ul/li[1]/a/span")
	private WebElement btnDataQRIS;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[4]/ul/li[1]/ul/li[1]/a")
	private WebElement btnMerchant2;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/h1/a")
	private WebElement btnInputQRIS;
	
	//INPUT CUSTOMER QRIS
	@FindBy(css = "#owner_name")
	private WebElement txtOwnerName;
	
	@FindBy(css = "#merchant_name")
	private WebElement txtMerchantName;
	
	@FindBy(css = "#email")
	private WebElement txtEmail;
	
	@FindBy(xpath = "//*[@id=\"select2-mid_type-container\"]")
//	@FindBy(id = "select2-mid_type-container")
	private WebElement txtStatusMerchant;

	@FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
//	@FindBy(xpath = "//select[@id='mid_type'][1]/option/@value")
	private WebElement txtStatusMerchant2;
	
	@FindBy(css = "#account_number")
	private WebElement txtNoRek;
	
	@FindBy(css = "#mobile_phone_number")
	private WebElement txtPhone1;
	
	@FindBy(css = "#other_phone_number")
	private WebElement txtPhone2;
	
//	@FindBy(xpath = "//*[@id=\"select2-officer_code-container\"]")
	@FindBy(id = "select2-officer_code-container")
	private WebElement txtArea;
	
	@FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
	private WebElement txtArea2;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div[2]/form/div[4]/input")
	private WebElement btnSubmitQRIS;
	
	@FindBy(css = "#content > div > div:nth-child(2) > div > div.panel-body > div > div:nth-child(1) > div > a > img")
	private WebElement btnQRISupload1;
	
	@FindBy(xpath = "//*[@id=\"file\"]")
	private WebElement btnFile1;
	
	@FindBy(xpath = "//*[@id=\"ModalKtp\"]/div/div/form/div[2]/input")
	private WebElement btnSave1;
	
	@FindBy(css = "#content > div > div:nth-child(2) > div > div.panel-body > div > div:nth-child(2) > div > a > img")
	private WebElement btnQRISupload2;
	
	@FindBy(css = "#file")
	private WebElement btnFile2;
	
	@FindBy(xpath = "//*[@id=\"ModalMerchant\"]/div/div/form/div[2]/input")
	private WebElement btnSave2;
	
	@FindBy(css = "#content > div > div:nth-child(2) > div > div.panel-body > div > div:nth-child(3) > div > a > img")
	private WebElement btnQRISupload3;
	
	@FindBy(css = "#file")
	private WebElement btnFile3;
	
	@FindBy(xpath = "//*[@id=\"ModalProduct\"]/div/div/form/div[2]/input")
	private WebElement btnSave3;
	
	@FindBy(css = "#content > div > div:nth-child(2) > div > div.panel-body > div > div:nth-child(4) > div > a > img")
	private WebElement btnQRISupload4;
	
	@FindBy(css = "#file")
	private WebElement btnFile4;
	
	@FindBy(xpath = "//*[@id=\"ModalNpwp\"]/div/div/form/div[2]/input")
	private WebElement btnSave4;
	
	@FindBy(css = "#content > div > div:nth-child(1) > div > div.panel-body > form > div.row.row-space-10 > div.col-md-12 > div > input")
	private WebElement btnSubmitQRIS2;
	
	public void UploadData() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		btnMerchant1.click();
		btnDataQRIS.click();
		btnMerchant2.click();
		btnInputQRIS.click();
		
	}
	
	public void InputCustomerQRIS(String owner, String merchant, String email, String norek, String nohp, String nohp2, String status, String area) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		txtOwnerName.sendKeys(owner);
		txtMerchantName.sendKeys(merchant);
		txtEmail.sendKeys(email);
		txtStatusMerchant.click();
		txtStatusMerchant2.sendKeys(status);
		txtStatusMerchant2.sendKeys(Keys.ENTER);
		txtNoRek.sendKeys(norek);
		txtPhone1.sendKeys(nohp);
		txtPhone2.sendKeys(nohp2);
		txtArea.click();
		txtArea2.sendKeys(area);
		txtArea2.sendKeys(Keys.ENTER);
		btnSubmitQRIS.click();
		
		//Upload Foto
		btnQRISupload1.click();
		btnFile1.sendKeys("E:\\Java\\node akar.JPG");
		btnSave1.click();
		wait.until(ExpectedConditions.visibilityOf(btnQRISupload2));
		btnQRISupload2.click();
		btnFile2.sendKeys("E:\\Java\\java.JPG");
		btnSave2.click();
		wait.until(ExpectedConditions.visibilityOf(btnQRISupload3));
		btnQRISupload3.click();
		btnFile3.sendKeys("E:\\Java\\java1.JPG");
		btnSave3.click();
		wait.until(ExpectedConditions.visibilityOf(btnQRISupload4));
		btnQRISupload4.click();
		btnFile4.sendKeys("E:/Java/1.PNG");
		btnSave4.click();
		wait.until(ExpectedConditions.visibilityOf(btnSubmitQRIS2));
		btnSubmitQRIS2.click();
		
	}
	
}
