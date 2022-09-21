package com.sgtesting.xpath_axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssCselector {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyWindow();
		createCustomer();
		createProject();
		createTask();
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
			oBrowser.get("http://localhost:808/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("#username")).sendKeys("admin");
			oBrowser.findElement(By.cssSelector("input[type='password'][name='pwd")).sendKeys("manager");
			oBrowser.findElement(By.cssSelector("#loginButton")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyWindow()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("#gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createCustomer()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("*[class='content tasks']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.cssSelector("*[class='addNewContainer']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.cssSelector("*[class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.cssSelector("input#customerLightBox_nameField")).sendKeys("samplecustomer");
			oBrowser.findElement(By.cssSelector("textarea#customerLightBox_descriptionField")).sendKeys("sampleDiscription");
			oBrowser.findElement(By.cssSelector("div#customerLightBox_commitBtn")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createProject()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("*[class='addNewContainer']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.cssSelector("*[class='item createNewProject ellipsis']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.cssSelector("input#projectPopup_projectNameField")).sendKeys("sampleProject");
			oBrowser.findElement(By.cssSelector("textarea#projectPopup_projectDescriptionField")).sendKeys("sampleProjectdescription");
			oBrowser.findElement(By.cssSelector("div#projectPopup_commitBtn")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createTask()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("div.addNewTaskButtonContainer")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.cssSelector("*[class='item createNewTask ellipsis']")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
