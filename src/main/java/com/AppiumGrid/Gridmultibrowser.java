package com.AppiumGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Gridmultibrowser {

	DesiredCapabilities cap=null;
	WebDriver driver;

	@Parameters("browserType")
	@BeforeTest
	public void beforetest(String browserType) throws MalformedURLException 
	{
		if (browserType.equals("firefox")) {

			cap = DesiredCapabilities.firefox();

			cap.setBrowserName("firefox");

			cap.setPlatform(Platform.WINDOWS);

		} else if(browserType.equals("chrome"))
		{

			cap = DesiredCapabilities.chrome();

			cap.setBrowserName("chrome");

			cap.setPlatform(Platform.WINDOWS);

		}
		else if(browserType.equals("ie"))
		{

			cap = DesiredCapabilities.internetExplorer();

			cap.setBrowserName("internet explorer");

			cap.setPlatform(Platform.WINDOWS);

		}
		
		URL nodeurl=new URL("http://localhost:4444/wd/hub");

		RemoteWebDriver driver = new RemoteWebDriver(nodeurl, cap);
		driver.manage().window().maximize();
		driver.navigate().to("https://accounts.google.com/");
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		
	}
	@Test
	public void multibrowsers()
	{
		System.out.println("welcome to hyd");

		driver.findElement(By.cssSelector("input[id*='identifierId']")).sendKeys("username");
		System.out.println("welcome to khaja");

		driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("password");

		//driver.close();

	}

}
