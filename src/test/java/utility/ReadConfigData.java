package utility;

import java.io.*;
import java.util.*;

public class ReadConfigData {
	
	public static void main(String [] args) throws Exception {
		//line of code to read config file
//		FileInputStream fis = new FileInputStream("C:\\Users\\91995\\eclipse-workspace1\\com.learning.demoExample\\testData\\config.properties");
//		FileInputStream fis = new FileInputStream(".\\testData\\config.properties");   //win machine
		FileInputStream fis = new FileInputStream("./testData/config.properties");     //win/non-win machine
		
		
		
		Properties prop = new Properties();
		
		prop.load(fis);  
		
		
		
		
		String appURLDetails = prop.getProperty("hrmApp");
		System.out.println("Application URL details: " + appURLDetails);
		System.out.println("Application username: " + prop.getProperty("username"));
		System.out.println("Application password: " + prop.getProperty("password"));
		System.out.println("browser: " + prop.getProperty("browser"));
//		System.out.println("browser akshdkahskf: " + prop.getProperty("sdfkhsakdhfkhsadkflk"));
//		System.out.println("browser Default Value are: " + prop.getProperty("sdfkhsakdhfkhsadkflk", "DefaultValue"));
	}

}
