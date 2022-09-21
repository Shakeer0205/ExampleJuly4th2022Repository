package com.sgtesting.xpath_axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxisDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		enterSalaryForTendulkar();
		followingSibling();
		precedingSibling();
		preceding();
		ancester();
		decendent();
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
			oBrowser.get("file:///C:/Users/shake/Downloads/xpathaxes_04_sept_2022/WebTableHTML.html");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void enterSalaryForTendulkar()
	{
		try
		{
			oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("20000");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void followingSibling()
	{
		try
		{
			oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[1]/td[6]/input")).sendKeys("25000");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void precedingSibling()
	{
		try
		{
			oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void preceding()
	{
		try
		{
			oBrowser.findElement(By.xpath("//td[text()='Indian Politician']/preceding::tr[1]/preceding::tr[1]/td[1]/input")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void ancester()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::td/ancestor::tr/ancestor::table")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void decendent()
	{
		try
		{
			oBrowser.findElement(By.xpath("//table/descendant::tr[6]/td[6]/input")).sendKeys("35000");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
