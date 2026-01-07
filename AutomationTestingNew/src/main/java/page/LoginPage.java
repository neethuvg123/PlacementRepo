package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']") WebElement usernametxt;
	@FindBy(xpath="//input[@name='password']") WebElement passwordtxt;
	@FindBy(xpath="//button[text()='Sign In']") WebElement siginbtn;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterUserName(String username)
	{
		usernametxt.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		passwordtxt.sendKeys(password);
	}
	public void clickSignIn()
	{
		siginbtn.click();
	}
}
