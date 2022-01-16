package com.kerjapraktek.merchant.glue;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.kerjapraktek.merchant.config.AutomationFrameworkConfiguration;
import com.kerjapraktek.merchant.driver.DriverSingleton;
import com.kerjapraktek.merchant.page.LoginPage;
import com.kerjapraktek.merchant.page.UploadDataEDC;
import com.kerjapraktek.merchant.page.UploadDataQRIS;
import com.kerjapraktek.merchant.page.UploadDataQRISReturn;
import com.kerjapraktek.merchant.utils.ConfigurationProperties;
import com.kerjapraktek.merchant.utils.Constants;
import com.kerjapraktek.merchant.utils.TestCases;
import com.kerjapraktek.merchant.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {
	private WebDriver driver;
	private LoginPage loginPage;
	private UploadDataQRIS uploadData;
	private UploadDataQRISReturn uploadDataReturn;
	private UploadDataEDC uploadDataEDC;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		loginPage = new LoginPage();
		uploadData = new UploadDataQRIS();
		uploadDataReturn = new UploadDataQRISReturn();
		uploadDataEDC = new UploadDataEDC();
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	//LOGIN MODUL
	@Given("^User go to the Website")
	public void user_go_to_the_website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Navigating to " + Constants.URL);
	}
	
	@When("^User input username password and click Login")
	public void user_input_username_password_and_click_login() {
		loginPage.gotoLogin(configurationProperties.getUserName(), configurationProperties.getPassword());
		extentTest.log(LogStatus.PASS, "User input username password and click Login");
	}
	
	@Then("^User can login to the Website")
	public void user_can_login_to_the_website() {
		loginPage.clikClose();
		extentTest.log(LogStatus.PASS, "User can login to the Website");
	}
	
	//MODUL UPLOAD DATA QRIS
	@Given("^User go to Data Merchant QRIS New Merchant")
	public void user_go_to_data_merchant_QRIS_new_merchant() {
		uploadData.UploadData();
		extentTest.log(LogStatus.PASS, "User go to Data Merchant QRIS New Merchant");
	}
	
	@When("^User go to Input New Customer")
	public void user_go_to_input_new_customer() {
		uploadData.InputCustomerQRIS(configurationProperties.getOwnerName(), configurationProperties.getMerchantName(), configurationProperties.getEmail(), configurationProperties.getNoRek(), configurationProperties.getNoHP1(), configurationProperties.getNoHP2(), configurationProperties.getStatusMerchant(), configurationProperties.getAreaAkuisisi());
		extentTest.log(LogStatus.PASS, "User go to Input New Customer");
	}
	
	@Then("^User can Input New Customer")
	public void user_can_input_new_customer() {
		extentTest.log(LogStatus.PASS, "User can Input New Customer");
	}
	
	//MODUL UPLOAD DATA QRIS Return
	@Given("^User go to Data Merchant QRIS Merchant Return")
	public void user_go_to_data_merchant_QRIS_merchant_return() {
		uploadDataReturn.UploadDataReturn();
		extentTest.log(LogStatus.PASS, "User go to Data Merchant QRIS Merchant Return");		
	}
	
	@When("^User go to Input Customer Return")
	public void user_go_to_input_customer_return() {
		uploadDataReturn.InputCustomerQRISReturn(configurationProperties.getOwnerName(), configurationProperties.getMerchantName(), configurationProperties.getEmail(), configurationProperties.getNoRek(), configurationProperties.getNoHP1(), configurationProperties.getNoHP2(), configurationProperties.getStatusMerchant(), configurationProperties.getAreaAkuisisi());
		extentTest.log(LogStatus.PASS, "User go to Input Customer Return");
	}
	
	@Then("^User can Input Customer Return")
	public void user_can_input_customer_return() {
		extentTest.log(LogStatus.PASS, "User can Input Customer Return");
	}
	
	//MODUL UPLOAD DATA EDC
	@Given("^User go to Data Merchant EDC New Merchant")
	public void user_go_to_data_merchant_EDC_new_merchant() {
		uploadDataEDC.UploadDataEDC();
		extentTest.log(LogStatus.PASS, "User go to Data Merchant EDC New Merchant");
	}
	
	@When("^User go to Input New Customer EDC")
	public void user_go_to_input_new_customer_EDC() {
		uploadDataEDC.InputCustEDC(configurationProperties.getJenisPengajuan(), configurationProperties.getStatusEDC(), configurationProperties.getOwnerName(), configurationProperties.getStatusEDC(), configurationProperties.getNoRek(), configurationProperties.getNoHP1(), configurationProperties.getNoHP2());
		extentTest.log(LogStatus.PASS, "User go to Input New Customer EDC");
	}
	
	
	
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
}
