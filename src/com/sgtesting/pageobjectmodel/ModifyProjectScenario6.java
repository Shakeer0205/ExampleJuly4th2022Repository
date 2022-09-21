package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyProjectScenario6 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyWindow();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
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
	private static void createCustomer()
	{
		try
		{
			oPage.getClickOnTasks().click();
			Thread.sleep(3000);
			oPage.getClickOnAddNewButton().click();
			Thread.sleep(3000);
			oPage.getClickOnAddCustomerButton().click();
			Thread.sleep(3000);
			oPage.getWriteCustomerName().sendKeys("DemoCustomer");
			oPage.getWriteCustomerDiscription().sendKeys("Demo Description");
			oPage.getClickOnCreateCustomerButton().click();
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createProject()
	{
		try
		{
			oPage.getClickOnAddNewButton().click();
			Thread.sleep(3000);
			oPage.getClickOnAddProject().click();
			Thread.sleep(3000);
			oPage.getWriteProjectName().sendKeys("Demo Project");
			oPage.getWriteProjectDiscription().sendKeys("Demo Project Description");
			oPage.getClickOnCreateProjectButton().click();
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyProject()
	{
		try
		{
			oPage.getClickToModifyProjectName().click();
			Thread.sleep(3000);
			oPage.getClickOnModifyDescription().click();
			oPage.getClickOnModifyDescription().clear();
			oPage.getClickOnModifyDescription().sendKeys("DummyProject");
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try
		{
			oPage.getClickOnDeleteStep1().click();
			Thread.sleep(3000);
			oPage.getClickOnDeleteStep2().click();
			Thread.sleep(3000);
			oPage.getClickOnDeleteStep3().click();
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try
		{
			oPage.getClickEditCustomerButton().click();
			Thread.sleep(3000);
			oPage.getClickDeleteCustomerstep1().click();
			Thread.sleep(3000);
			oPage.getClickDeleteCustomerStep2().click();
			Thread.sleep(3000);
			oPage.getClickDeleteCustomerStep3().click();
			Thread.sleep(3000);
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
