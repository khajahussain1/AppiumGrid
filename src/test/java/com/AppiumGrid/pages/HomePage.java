/**
 * 
 */
package com.AppiumGrid.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.AppiumGrid.baseclass.BaseClass;
import com.AppiumGrid.objects.HomePageObject;
import com.AppiumGrid.utlity.GernalKeywors;

/**
 * @author CHIRAG
 *
 */
public class HomePage {

	HomePageObject homePageObject = new HomePageObject();
	
	public HomePage() {
		BaseClass obj = new BaseClass();
		WebDriver driver = obj.getDriver();
		System.out.println(driver);
		PageFactory.initElements(driver, homePageObject);
	}
	
	public LoginPage clickOnSignIn()
	{
		GernalKeywors.click(homePageObject.logIn);
		return new LoginPage();
	}
	
	
}
