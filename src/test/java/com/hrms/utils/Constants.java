package com.hrms.utils;

public class Constants {
	public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers1\\chromedriver.exe";
	public static final String GECKO_DRIVER_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\geckodriver.exe";
	public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir")+ "\\src\\test\\resources\\configs\\configuration.properties";
	public static final String TEST_DATA_FILEPATH =System.getProperty("user.dir")+ "\\src\\test\\resources\\TestData\\Book1.xlsx";
	
	public static final int IMPLICIT_WAIT_TIME = 15;
	public static final int EXPLICIT_WAIT_TIME = 30;
	

}