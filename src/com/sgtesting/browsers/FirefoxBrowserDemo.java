package com.sgtesting.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeBrowser();
	}
	private static void launchBrowser()
	{
		try
		{
		     System.setProperty("webdriver.gecko.driver", "E:\\GitRepository\\DemoWorkSpace\\Web_Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:808/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeBrowser()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
