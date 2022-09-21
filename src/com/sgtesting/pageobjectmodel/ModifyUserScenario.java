package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUserScenario {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyWindow();
		CreateUser();
		modifyUser();
		deleteUser();
		Logout();
		close();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\GitRepository\\DemoWorkSpace\\Web_Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:808/login.do");
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimizeFlyWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void CreateUser()
	{
		try
		{
			oPage.getClickonUser().click();
			Thread.sleep(3000);
			oPage.getClickonAddUser().click();
			Thread.sleep(3000);
			oPage.getFirstName().sendKeys("demo");
			oPage.getLastName().sendKeys("User10");
			oPage.getEmailId().sendKeys("demo@gmail.com");
			Thread.sleep(3000);
			oPage.getUserLogin().sendKeys("DemoUser");
			oPage.getPasswordforUser().sendKeys("Welcome12");
			oPage.getPasswordCopyforUser().sendKeys("Welcome12");
			Thread.sleep(3000);
			oPage.getCreateUSerButton().click();
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyUser()
	{
		try
		{
			oPage.getClickonCreatedUser().click();
			Thread.sleep(3000);
			oPage.getFirstName().clear();
			oPage.getFirstName().sendKeys("sample");
			oPage.getLastName().clear();
			oPage.getLastName().sendKeys("User");
			oPage.getEmailId().clear();
			oPage.getEmailId().sendKeys("demo10@gmail.com");
			Thread.sleep(3000);
			oPage.getUserLogin().clear();
			oPage.getUserLogin().sendKeys("SampleUser");
			oPage.getPasswordforUser().clear();
			oPage.getPasswordforUser().sendKeys("Welcome1234");
			oPage.getPasswordCopyforUser().clear();
			oPage.getPasswordCopyforUser().sendKeys("Welcome1234");
			Thread.sleep(3000);
			oPage.getClickOnUserSaveChanges().click();
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try
		{
			oPage.getClickonCreatedUser().click();
			Thread.sleep(5000);
			oPage.getClickonDeleteUser().click();
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try
		{
			oPage.getLogoutLink().click();
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void close()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
