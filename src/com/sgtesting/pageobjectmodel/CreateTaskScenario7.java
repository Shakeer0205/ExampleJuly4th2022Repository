package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateTaskScenario7 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyWindow();
		createCustomer();
		createProject();
		createTask();
		deleteTask();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();
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
			oBrowser.navigate().to("http://localhost:808/login.do");
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
			Thread.sleep(4000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimizeFlyWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(4000);
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
			Thread.sleep(4000);
			oPage.getWriteCustomerName().sendKeys("Demo Customer");
			oPage.getWriteCustomerDiscription().sendKeys("Demo Customer Description");
			oPage.getClickOnCreateCustomerButton().click();
			Thread.sleep(4000);
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
			oPage.getWriteProjectDiscription().sendKeys("Demo Description");
			oPage.getClickOnCreateProjectButton().click();
			Thread.sleep(4000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createTask()
	{
		try
		{
			oPage.getClickOnAddTaskButton().click();
			Thread.sleep(4000);
			oPage.getClickOnCreateNewTaskButton().click();
			Thread.sleep(4000);
			oPage.getWriteTaskName().sendKeys("DoTask");
			oPage.getclickOnTaskCheckBox().click();
			oPage.getclickOnCreateTask().click();
			Thread.sleep(4000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteTask()
	{
		try
		{
			oPage.getClickOnCreatedTaskForEdit().click();
			Thread.sleep(4000);
			oPage.getClickOnDeleteTaskStep1().click();
			Thread.sleep(4000);
			oPage.getClickOnDeleteTaskStep2().click();
			Thread.sleep(4000);
			oPage.getClickOnDeleteTaskStep3().click();
			Thread.sleep(4000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try
		{
			oPage.getClickToModifyProjectName().click();
			Thread.sleep(4000);
			oPage.getClickOnDeleteStep1().click();
			Thread.sleep(4000);
			oPage.getClickOnDeleteStep2().click();
			Thread.sleep(4000);
			oPage.getClickOnDeleteStep3().click();
			Thread.sleep(4000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try
		{
			oPage.getClickEditCustomerButton().click();
			Thread.sleep(4000);
			oPage.getClickDeleteCustomerstep1().click();
			Thread.sleep(4000);
			oPage.getClickDeleteCustomerStep2().click();
			Thread.sleep(4000);
			oPage.getClickDeleteCustomerStep3().click();
			Thread.sleep(4000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oPage.getLogoutLink().click();
			Thread.sleep(4000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
