package com.AppiumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid {
	
	@Test
	public void test1() throws MalformedURLException
	{
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver2.exe");
		
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		
		cap.setPlatform(Platform.WIN10);
		
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(url, cap);
		
		driver.get("http://learn-automation.com");
		System.out.println("title is: "+driver.getTitle());
		//driver.quit();
	}

}
