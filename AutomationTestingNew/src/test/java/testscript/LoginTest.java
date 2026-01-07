package testscript;

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
		login.clickSignIn();
	}
}
