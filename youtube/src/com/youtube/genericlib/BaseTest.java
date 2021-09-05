package com.youtube.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConstant  {
	
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		FileLib flib = new FileLib();
		String browser = flib.readpropdata("browser",Prop_path );
		if(browser.equals("chrome"))
		{
			System.setProperty(Chrome_key, Chrome_value);
			driver = new ChromeDriver();
		}
		else
		{
			System.setProperty(Gecko_key, Gecko_value);
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		String url = flib.readpropdata("url", Prop_path);
		driver.get(url);
	}

}
