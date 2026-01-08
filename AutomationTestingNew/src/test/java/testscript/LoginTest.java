package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.LoginPage;

public class LoginTest extends Base{

	@Test
	public void verifyUserIsAbleToLoginWithValidCredentials()
	{
		String username="admin";
		String password="admin";
		LoginPage  login=new LoginPage(driver);
		login.enterUserName(username);
		login.enterPassword(password);
		boolean homepage=login.dashboardView();
		login.clickSignIn();
		Assert.assertTrue(homepage);
	}
}
