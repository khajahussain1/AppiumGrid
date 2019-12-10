/**
 * 
 */
package com.AppiumGrid.testscripts;

import org.testng.annotations.Test;

import com.AppiumGrid.baseclass.BaseClass;
import com.AppiumGrid.pages.HomePage;
import com.AppiumGrid.pages.LoginPage;
import com.AppiumGrid.utlity.GlobalParameters;

/**
 * @author CHIRAG
 *
 */
public class LoginTest extends BaseClass{

	HomePage homePage ;
	LoginPage loginPage;
		
	@Test
	public void login()
	{
		homePage = new HomePage();
		if(GlobalParameters.runType.equalsIgnoreCase("web"))
		{
			loginPage = homePage.clickOnSignIn();
		}else
		{
			loginPage = new LoginPage();
		}
		loginPage.enterUserName("vodqa@gmail.com");
		loginPage.enterPassword("Hello12345678");
	}
}
