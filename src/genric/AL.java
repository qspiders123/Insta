package genric;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AL 
{


	
	public static void getScreenshot(String folder,String name,WebDriver driver) throws IOException
	{
	//take screenshot
	TakesScreenshot t=(TakesScreenshot)driver;
	File srcFile = t.getScreenshotAs(OutputType.FILE);
	Date d=new Date();
	String date = d.toString().replace(":", "-");
	String path=folder+name+date+".png";
	File dstFile=new File(path);
    FileUtils.copyFile(srcFile, dstFile);
	}
	
	public static String getProperty(String path,String key) 
	{
		String v="";
		try{
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		v=p.getProperty(key);
		}
		catch(Exception e){}
		return v;
		
	}

}
