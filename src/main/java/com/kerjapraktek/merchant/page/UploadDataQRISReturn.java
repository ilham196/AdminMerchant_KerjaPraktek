package com.kerjapraktek.merchant.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kerjapraktek.merchant.driver.DriverSingleton;

public class UploadDataQRISReturn {
	
	private WebDriver driver;
	
	public UploadDataQRISReturn() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[4]/ul/li[1]/a")
	private WebElement btnDataMerchant;
	
	@FindBy(xpath ="//*[@id=\"sidebar\"]/div/div[1]/ul/li[4]/ul/li[1]/ul/li[2]/a")
	private WebElement btnQRISReturn;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/h1/a")
	private WebElement btnInputCustReturn;
	
	// Input Customer
	@FindBy(css = "#owner_name")
	private WebElement txtOwnerName;
	
	@FindBy(css = "#merchant_name")
	private WebElement txtMerchantName;
	
	@FindBy(css = "#email")
	private WebElement txtEmail;
	
	@FindBy(xpath = "//*[@id=\"select2-mid_type-container\"]")
	private WebElement txtStatusMerchant;
	
	@FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
	private WebElement txtStatusMerchant2;
	
	@FindBy(css = "#account_number")
	private WebElement txtNoRek;
	
	@FindBy(css = "#mobile_phone_number")
	private WebElement txtPhone1;
	
	@FindBy(css = "#other_phone_number")
	private WebElement txtPhone2;
	
	@FindBy(id = "select2-officer_code-container")
	private WebElement txtArea;
	
	@FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
	private WebElement txtArea2;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div[2]/form/div[4]/input")
	private WebElement btnSubmitQRISReturn;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div[2]/div/div[1]/div/a/img")
	private WebElement btnQRISRupload1;
	
	@FindBy(xpath = "//*[@id=\"file\"]")
	private WebElement btnFile1;
	
	@FindBy(xpath = "//*[@id=\"ModalKtp\"]/div/div/form/div[2]/input")
	private WebElement btnSave1;
	
	@FindBy(css = "#content > div > div:nth-child(2) > div > div.panel-body > div > div:nth-child(2) > div > a > img")
	private WebElement btnQRISRupload2;
	
	@FindBy(css = "#file")
	private WebElement btnFile2;
	
	@FindBy(xpath = "//*[@id=\"ModalMerchant\"]/div/div/form/div[2]/input")
	private WebElement btnSave2;
	
	@FindBy(css = "#content > div > div:nth-child(2) > div > div.panel-body > div > div:nth-child(3) > div > a > img")
	private WebElement btnQRISRupload3;
	
	@FindBy(css = "#file")
	private WebElement btnFile3;
	
	@FindBy(xpath = "//*[@id=\"ModalProduct\"]/div/div/form/div[2]/input")
	private WebElement btnSave3;
	
	@FindBy(css = "#content > div > div:nth-child(2) > div > div.panel-body > div > div:nth-child(4) > div > a > img")
	private WebElement btnQRISRupload4;
	
	@FindBy(css = "#file")
	private WebElement btnFile4;
	
	@FindBy(xpath = "//*[@id=\"ModalNpwp\"]/div/div/form/div[2]/input")
	private WebElement btnSave4;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[2]/form/div[2]/div[9]/div/input")
	private WebElement btnSubmitQRISReturn2;
	
	public void UploadDataReturn() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		btnDataMerchant.click();
		btnQRISReturn.click();
		btnInputCustReturn.click();
	}
	
	public void InputCustomerQRISReturn(String owner, String merchant, String email, String norek, String nohp, String nohp2, String status, String area) {
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
		btnSubmitQRISReturn.click();
		
		//Upload Foto
		btnQRISRupload1.click();
		btnFile1.sendKeys("E:\\Java\\node akar.JPG");
		btnSave1.click();
		wait.until(ExpectedConditions.visibilityOf(btnQRISRupload2));
		btnQRISRupload2.click();
		btnFile2.sendKeys("E:\\Java\\java.JPG");
		btnSave2.click();
		wait.until(ExpectedConditions.visibilityOf(btnQRISRupload3));
		btnQRISRupload3.click();
		btnFile3.sendKeys("E:\\Java\\java1.JPG");
		btnSave3.click();
		wait.until(ExpectedConditions.visibilityOf(btnQRISRupload4));
		btnQRISRupload4.click();
		btnFile4.sendKeys("E:/Java/1.PNG");
		btnSave4.click();
		wait.until(ExpectedConditions.visibilityOf(btnSubmitQRISReturn2));
		btnSubmitQRISReturn2.click();
		
	}

}
