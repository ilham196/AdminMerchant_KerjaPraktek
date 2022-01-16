package com.kerjapraktek.merchant.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kerjapraktek.merchant.driver.DriverSingleton;

public class Worklist {
	
	private WebDriver driver;
	
	 public Worklist() {
		// TODO Auto-generated constructor stub
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[15]/a")
	private WebElement btnWorklist;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[15]/ul/li[1]/a")
	private WebElement btnNewData;
	
	@FindBy(css = "#data-worklist > tbody > tr:nth-child(1) > td:nth-child(2) > a > i")
	private WebElement btnActionNewData;
	
//	WORKLIST NEW DATA
	@FindBy(css ="//*[@id=\"Status\"]")
	private WebElement drpdownStatus;
	
	@FindBy(css = "#Reason")
	private WebElement drpdownReason;
	
	@FindBy(css = "#form_survey > div:nth-child(2) > input")
	private WebElement btnJam;
	
	@FindBy(css = "#div_pic > input")
	private WebElement txtPenerima;
	
	@FindBy(css = "#form_survey > div:nth-child(5) > textarea")
	private WebElement txtKeterangan;
	
	

}
