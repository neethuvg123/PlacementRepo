package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.LoginPage;
import utility.ExcelUtility;

public class LoginTest extends Base {

	@Test
	public void verifyUserIsAbleToLoginWithValidCredentials() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage login = new LoginPage(driver);
		login.enterUserName(username);
		login.enterPassword(password);
		login.clickSignIn();
		boolean homepage = login.dashboardView();
		Assert.assertTrue(homepage);
	}
	@Test
	public void verifyUserIsAbleToLoginWithInvalidCredentials() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "loginpage");
		String password = ExcelUtility.getStringData(2, 1, "loginpage");
		LoginPage login = new LoginPage(driver);
		login.enterUserName(username);
		login.enterPassword(password);
		login.clickSignIn();
		boolean alerts = login.alertMessage();
		Assert.assertTrue(alerts);
	}
}
