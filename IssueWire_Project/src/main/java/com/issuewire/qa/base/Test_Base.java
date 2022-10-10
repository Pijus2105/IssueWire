package com.issuewire.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

import com.issuewire.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Base {
	
	public static WebDriver driver;
	public static Properties prop; //global level
	String path = "C:\\Users\\Elphill\\git\\IssueWire\\IssueWire_Project\\src\\main\\java\\com\\issuewire\\qa\\config\\config.properties";
	public Test_Base() {
		
		try {
			prop = new Properties();
			FileInputStream InputStream = new FileInputStream(path);
			try {
				prop.load(InputStream);
			} catch (IOException e) {				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
//		 if(browserName.equals("FF")) {
//			//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
		
//		}else if(browserName.equals("IOE")) {
//			//System.setProperty("webdriver.ie.driver", "C:/path/to/IEDriverServer.exe");
//			WebDriverManager.iedriver().setup();
//			 driver = new InternetExplorerDriver();
//			
//		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.pageLoadTimeout)); //Removed the hard coded value
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.implicitlyWait)); //Removed the hard coded value
		driver.navigate().to(prop.getProperty("url"));
	
}
}
//}

