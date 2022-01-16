package com.kerjapraktek.merchant.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kerjapraktek.merchant.driver.DriverSingleton;

public class UploadDataEDC {

	private WebDriver driver;
	
	public UploadDataEDC() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[4]/ul/li[2]/a/span")
	private WebElement btnMerchantEDC;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[4]/ul/li[2]/ul/li/a")
	private WebElement btnNewMerchantEDC;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/h1/div/a")
	private WebElement btnInputCustEDC;
	
	//Input Cust EDC
	@FindBy(id ="select2-product_type-container")
	private WebElement txtJenisPengajuan;
	
	@FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
	private WebElement txtSearchJenisPengajuan;
	
	@FindBy(id = "select2-mid_type-container")
	private WebElement txtStatusMerchantEDC;
	
	@FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
	private WebElement txtSearchStatusMerchant;
	
	@FindBy(css = "#Owner_Name")
	private WebElement txtOwner;
	
	@FindBy(css = "#Merchant_Name")
	private WebElement txtMerchant;
	
	@FindBy(css = "#account_number")
	private WebElement txtNoRek;
	
	@FindBy(css = "#Mobile_Phone_Number")
	private WebElement txtPhone1;
	
	@FindBy(css = "#Other_Phone_Number")
	private WebElement txtPhone2;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/form/div[3]/div/button")
	private WebElement btnSubmitEDC;
	
	public void UploadDataEDC() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		btnMerchantEDC.click();
		btnNewMerchantEDC.click();
		btnInputCustEDC.click();
	}
	
	public void InputCustEDC(String jenis, String statusmerchant, String owner, String merchant, String norek, String nohp1, String nohp2) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		txtJenisPengajuan.click();
		txtSearchJenisPengajuan.sendKeys(jenis);
		txtSearchJenisPengajuan.sendKeys(Keys.ENTER);
		txtStatusMerchantEDC.click();
		txtSearchStatusMerchant.sendKeys(statusmerchant);
		txtSearchStatusMerchant.sendKeys(Keys.ENTER);
		txtOwner.sendKeys(owner);
		txtMerchant.sendKeys(merchant);
		txtNoRek.sendKeys(norek);
		txtPhone1.sendKeys(nohp1);
		txtPhone2.sendKeys(nohp2);
		btnSubmitEDC.click();
	}
	
	
}
