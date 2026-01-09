package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base {

	public WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void browserInitalization(String browser)

	{
		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else {
			System.out.println("invalid browser");
		}

		driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void browerQuit() {
		driver.close();
	}
}
