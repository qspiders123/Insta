package genric;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass implements IAutoConst
{
	
	public WebDriver driver;
	
	static
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(FIREFOX_KEY,FIREFOX_VALUE);
	}
	
	@Parameters({"browser"})
	@BeforeClass
	public void launchBrowser(@Optional("chrome")String browser)
	{
		if(browser.equals("chrom"))
		{
			driver=new ChromeDriver();
		}else{
		
		driver=new FirefoxDriver();
		}
		//navigate to application
		String url = AL.getProperty(SETTINGS_PROPERTY, "URL");
		driver.get(url);
		
		
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
}
