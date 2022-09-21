package com.sgtesting.browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		noOfLinks();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\GitRepository\\DemoWorkSpace\\Web_Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.youtube.com/");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void noOfLinks()
	{
		try
		{
			List<WebElement>oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println(oLinks.size());
//			for(int i=0;i<oLinks.size();i++)
//			{
//				String linkName=oLinks.get(i).getText();
//				System.out.println(linkName);
//			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
