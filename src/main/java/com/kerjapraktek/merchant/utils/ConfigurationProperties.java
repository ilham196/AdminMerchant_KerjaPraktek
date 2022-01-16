package com.kerjapraktek.merchant.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {
	
	@Value("${browser}")
	private String browser;
	
	@Value("${myusername}")
	private String userName;
	
	@Value("${password}")
	private String password;
	
	@Value("${displayname}")
	private String displayName;
	
	@Value("${owner}")
	private String ownerName;
	
	@Value("${merchant}")
	private String merchantName;
	
	@Value("${email}")
	private String email;
	
	@Value("${norek}")
	private String noRek;
	
	@Value("${nohp}")
	private String noHP1;
	
	@Value("${nohp2}")
	private String noHP2;

	@Value("${status}")
	private String statusMerchant;
	
	@Value("${area}")
	private String areaAkuisisi;
	
	@Value("${jenispengajuan}")
	private String jenisPengajuan;
	
	@Value("${statusedc}")
	private String statusEDC;
	
	@Value("${searchqr")
	private String searchQR;
	
	@Value("${searchms}")
	private String searchMS;
	
	public String getSearchMS() {
		return searchMS;
	}
	
	public String getSearchQR() {
		return searchQR;
	}
	
	public String getJenisPengajuan() {
		return jenisPengajuan;
	}
	
	public String getStatusEDC() {
		return statusEDC;
	}
	
	public String getBrowser() {
		return browser;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getDisplayName() {
		return displayName;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public String getMerchantName() {
		return merchantName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getNoRek() {
		return noRek;
	}
	
	public String getNoHP1() {
		return noHP1;
	}
	
	public String getNoHP2() {
		return noHP2;
	}
	
	public String getStatusMerchant() {
		return statusMerchant;
	}
	
	public String getAreaAkuisisi() {
		return areaAkuisisi;
	}

}
