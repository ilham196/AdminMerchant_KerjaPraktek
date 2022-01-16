package com.kerjapraktek.merchant.utils;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.util.FileCopyUtils;

import com.kerjapraktek.merchant.driver.DriverSingleton;
import com.kerjapraktek.merchant.utils.Constants;

public class Utils {
	
	public static int testCount = 0;
	//Screnshot
	public static boolean takeScreenshot() {
		File file = ((TakesScreenshot) DriverSingleton.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileCopyUtils.copy(file, new File(Constants.SCREENSHOTS_FOLDER + 
					generateRandomString(Constants.SCREENSHOT_NAME_LENGHT) + Constants.SCREENSHOT_EXTENTION));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	private static String generateRandomString(int lenght) {
		String seedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		int i = 0;
		Random random = new Random();
		while(i < lenght) {
			sb.append(seedChars.charAt(random.nextInt(seedChars.length())));
			i++;
		}
		return sb.toString();
	}

}
