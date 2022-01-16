package com.kerjapraktek.merchant.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kerjapraktek.merchant.driver.DriverSingleton;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/div[2]/form/div[1]/input")
	private WebElement txtUsername;
	
	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/div[2]/form/div[2]/input")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/div[2]/form/div[3]/button")
	private WebElement btnSubmit;
	
	@FindBy(css = "#myCarousel > a.carousel-control-next")
//	@FindBy(css = "#myCarousel > div > div:nth-child(1) > img")
	private WebElement gambar;
	
	@FindBy(xpath = "//*[@id=\"exampleModal\"]/div/div/div[2]/button")
//	@FindBy(css ="#exampleModal > div > div > div.modal-footer > button")
	private WebElement btnClose;
	
	public void gotoLogin(String username, String password) {
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);
		btnSubmit.click();
	}
	
	public void clikClose() {
		gambar.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		btnClose.click();
	}

}
