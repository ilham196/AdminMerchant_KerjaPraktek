package com.kerjapraktek.merchant.utils;

public enum TestCases {
	
	T1("Testing the authentication"),
	T2("Testing Input Data Customer QRIS"),
	T3("Testing Input Data Customer QRIS Return"),
	T4("Testing Input Data Customer EDC"),
	T5("Testing Send QR page"),
	T6("Testing Received QR page"),
	T7("Testing Delivery to MD page"),
	T8("Testing Distribusi page"),
	T9("Testing Validasi page"),
	T10("Testing Completed Data page"),
	T11("Testing Monitoring MD page");
	
	private String testName;
	
	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
