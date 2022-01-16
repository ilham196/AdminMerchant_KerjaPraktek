package com.kerjapraktek.merchant.glue;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.kerjapraktek.merchant.config.AutomationFrameworkConfiguration;
import com.kerjapraktek.merchant.driver.DriverSingleton;
import com.kerjapraktek.merchant.page.CompletedData;
import com.kerjapraktek.merchant.page.DeliverytoMD;
import com.kerjapraktek.merchant.page.Distribusi;
import com.kerjapraktek.merchant.page.LoginPage;
import com.kerjapraktek.merchant.page.MonitoringMD;
import com.kerjapraktek.merchant.page.ReceivedQR;
import com.kerjapraktek.merchant.page.SendQR;
import com.kerjapraktek.merchant.page.UploadDataEDC;
import com.kerjapraktek.merchant.page.UploadDataQRIS;
import com.kerjapraktek.merchant.page.UploadDataQRISReturn;
import com.kerjapraktek.merchant.page.Validasi;
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
	private SendQR sendQR;
	private ReceivedQR receivedQR;
	private DeliverytoMD deliverytoMD;
	private Distribusi distribusiPage;
	private Validasi validasiPage;
	private CompletedData completedData;
	private MonitoringMD monitoringMD;
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
		sendQR = new SendQR();
		receivedQR = new ReceivedQR();
		deliverytoMD = new DeliverytoMD();
		distribusiPage = new Distribusi();
		validasiPage = new Validasi();
		completedData = new CompletedData();
		monitoringMD = new MonitoringMD();
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
	
	@Then("^User can Input New Customer EDC")
	public void user_can_input_new_customer_EDC() {
		extentTest.log(LogStatus.PASS, "User can Input New Customer EDC");
	}
	
	//MODUL SEND QR
	@Given("^User go to Send QR page")
	public void user_go_to_send_QR_page() {
		sendQR.gotoSendQR();
		extentTest.log(LogStatus.PASS, "User go to Send QR page");
	}
	
	@When("^User can action data")
	public void user_can_action_data() {
		sendQR.SendQR(configurationProperties.getSearchQR());
		extentTest.log(LogStatus.PASS, "User can action data");
	}
	
	@Then("^User can Received QR data")
	public void user_can_received_QR_data() {
		extentTest.log(LogStatus.PASS, "User can Received QR data");
	}
	
	//Received QR
	@Given("^User go to Received QR page")
	public void user_go_to_received_QR_page() {
		receivedQR.gotoReceivedQR();
		extentTest.log(LogStatus.PASS, "User go to Received QR page");
	}
	
	@When("^User can action data Received")
	public void user_can_action_data_received() {
		receivedQR.ReceivedQR(configurationProperties.getSearchQR());
		extentTest.log(LogStatus.PASS, "User can action data Received");
	}
	
	@Then("^User can Delivery to MD")
	public void user_can_delivery_to_MD() {
		extentTest.log(LogStatus.PASS, "User can Delivery to MD");
	}
	
	//MODUL Delivery to MD
	@Given("^User go to Delivery to MD page")
	public void user_go_to_delivery_to_MD_page() {
		deliverytoMD.gotoDeliveryMD();
		extentTest.log(LogStatus.PASS, "User go to Delivery to MD page");
	}
	
	@When("^User can action data Delivery to MD")
	public void user_can_action_data_delivery_to_MD() {
		deliverytoMD.DeliverytoMD(configurationProperties.getSearchQR());
		extentTest.log(LogStatus.PASS, "User can action data Delivery to MD");
	}
	
	@Then("^User can Delivery to MD data")
	public void user_can_delivery_to_MD_data() {
		extentTest.log(LogStatus.PASS, "User can Delivery to MD data");
	}
	
	//MODUL Distribusi
	@Given("^User go to Distribusi page")
	public void user_go_to_distribusi_page() {
		distribusiPage.gotoDistribusi();
		extentTest.log(LogStatus.PASS, "User go to Distribusi page");
	}
	
	@When("^User can checkbox the merchant")
	public void user_can_checkbox_the_merchant() {
		distribusiPage.Distribusi(configurationProperties.getSearchMS());
		extentTest.log(LogStatus.PASS, "User can checkbox the merchant");
	}
	
	@Then("^User can Distribusi the merchant")
	public void user_can_distribusi_the_merchant() {
		extentTest.log(LogStatus.PASS, "User can Distribusi the merchant");
	}
	
	//MODUL Validasi
	@When("^User go to Validasi page and Action button")
	public void user_go_to_validasi_page_and_action_button() {
		validasiPage.gotoValidasi();
		extentTest.log(LogStatus.PASS, "User go to Validasi page and Action button");
	}
	
	@Then("^User can approve data")
	public void user_can_approve_data() {
		extentTest.log(LogStatus.PASS, "User can approve data");
	}
	
	//MODUL Completed Data
	@When("^User can go Completed Data page and Action button")
	public void user_can_go_completed_data_page_and_action_button() {
		completedData.gotoCompletedData();
		extentTest.log(LogStatus.PASS, "User can go Completed Data page and Action button");
	}
	
	@Then("^User can print and edit status")
	public void user_can_print_and_edit_status() {
		extentTest.log(LogStatus.PASS, "User can print and edit status");
	}
	
	//MODUL Monitoring MD
	@When("^User can go Monitoring MD page and Action button")
	public void user_can_go_monitoring_MD_page_and_action_button() {
		monitoringMD.MonitoringMD();
		extentTest.log(LogStatus.PASS, "User can go Monitoring MD page and Action button");
	}
	
	@Then("^User can see Action button data")
	public void user_can_see_action_button_data() {
		extentTest.log(LogStatus.PASS, "User can see Action button data");
	}
	
	//MODUL Worklist
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
}
