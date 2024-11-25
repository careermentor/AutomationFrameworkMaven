package org.wipro.automation.aumw.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.aumw.basePkg.InitiateBrowser;
import org.wipro.automation.aumw.pages.LoginPage;

public class LoginScenario extends InitiateBrowser
{

	@Test
	public void testlogin() throws Exception
	{
		
		LoginPage login = new LoginPage(driver);
		login.enter_username("standard_user");
		login.enter_password("secret_sauce");
		login.click_loginbttn();
		
	}
	
}
