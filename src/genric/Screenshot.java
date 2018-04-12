package genric;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot implements IAutoConst
{

	

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();		
		driver.get("http://localhost/login.do");
		AL.getScreenshot(SCREENSHOT, "Defect", driver);
		
		
		
		}
	}


