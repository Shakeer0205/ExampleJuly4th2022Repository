package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	//WebElements for User Name Text Field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	//WebElement for password TextField
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	//WebElement For Login Button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	//Minimize for FlyOutWindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//WebElement for Logout 
	@FindBy(linkText = "Logout")
	private WebElement oLogout;
	public WebElement getLogoutLink()
	{
		return oLogout;
	}
	
	//Create User WebElements
	//WebElement for ClickUser
	@FindBy(xpath = "//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
	//@FindBy(xpath = "//a[contains(@class,'content users')]")
	//@FindBy(xpath = "//a//div[text()='USERS']")
	private WebElement oUser;
	public WebElement getClickonUser()
	{
		return oUser;
	}
	//WebElement for AddUser
	@FindBy(xpath = "//div[text()='Add User']")
	private WebElement oAddUser;
	public WebElement getClickonAddUser()
	{
		return oAddUser;
	}
	//WebElement for CreateUser
	private WebElement userDataLightBox_firstNameField;
	public WebElement getFirstName()
	{
		return userDataLightBox_firstNameField;
	}
	//WebElement for LastName
	private WebElement userDataLightBox_lastNameField;
	public WebElement getLastName()
	{
		return userDataLightBox_lastNameField;
	}
	//WebElement for EmailId
	private WebElement userDataLightBox_emailField;
	public WebElement getEmailId()
	{
		return userDataLightBox_emailField;
	}
	//WebElement for UserName
	private WebElement userDataLightBox_usernameField;
	public WebElement getUserLogin()
	{
		return userDataLightBox_usernameField;
	}
	//WebElement For Password
	private WebElement userDataLightBox_passwordField;
	public WebElement getPasswordforUser()
	{
		return userDataLightBox_passwordField;
	}
	//WebElement for PasswordCopy
	private WebElement passwordCopy;
	public WebElement getPasswordCopyforUser()
	{
		return passwordCopy;
	}
	//WebElement for CreateUserButon
	@FindBy(xpath = "//span[text()='Create User']")
	private WebElement oCreateUserButton;
	public WebElement getCreateUSerButton()
	{
		return oCreateUserButton;
	}
	
	//Delete USer WebElements
	//webElement for clickonUser
	@FindBy(xpath = "//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement oclick;
	public WebElement getClickonCreatedUser()
	{
		return oclick;
	}
	//WebElement for DeleteUser
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getClickonDeleteUser()
	{
		return userDataLightBox_deleteBtn;
	}
	//WebElement for UserModifications
	@FindBy(xpath = "(//span[@class='buttonTitle'])[1]")
	private WebElement oModify;
	public WebElement getClickOnUserSaveChanges()
	{
		return oModify;
	}
	
	//Create Customer WebElements
	//WebElement For ClickOn Tasks
	@FindBy(xpath = "//a[@class='content tasks']")
	//@FindBy(xpath = "//a[contains(@class,'content tasks')]")
	//@FindBy(xpath = "//a//div[text()='TASKS']")
	private WebElement oTasks;
	public WebElement getClickOnTasks()
	{
		return oTasks;
	}
	//WebElement For Click on AddNew
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement oAddNew;
	public WebElement getClickOnAddNewButton()
	{
		return oAddNew;
	}
	//WebElement for Click on Add Customer
	@FindBy(xpath = "//div[@class='item createNewCustomer ellipsis']")
	private WebElement oAddCust;
	public WebElement getClickOnAddCustomerButton()
	{
		return oAddCust;
	}
	//WebElement For Add CustomerName
	private WebElement customerLightBox_nameField;
	public WebElement getWriteCustomerName()
	{
		return customerLightBox_nameField;
	}
	//WebElement for Customer Discription
	private WebElement customerLightBox_descriptionField;
	public WebElement getWriteCustomerDiscription()
	{
		return customerLightBox_descriptionField;
	}
	//WebElement for Click CreateCustomer
	@FindBy(xpath = "//span[text()='Create Customer']")
	private WebElement oCreate;
	public WebElement getClickOnCreateCustomerButton()
	{
		return oCreate;
	}
	
	//Delete Customer WebElements
	//webElement for clickon to modify
	@FindBy(xpath = "//div[@class='editButton available']")
	private WebElement oEdit;
	public WebElement getClickEditCustomerButton()
	{
		return oEdit;
	}
	//WebElement for deleteCustomer
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement oAction;
	public WebElement getClickDeleteCustomerstep1()
	{
		return oAction;
	}
	//WebElement for deleteCustomer2
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
	private WebElement oDelete2;
	public WebElement getClickDeleteCustomerStep2()
	{
		return oDelete2;
	}
	//webElement for Deletecustomer3
	@FindBy(xpath = "//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")
	private WebElement oDelete3;
	public WebElement getClickDeleteCustomerStep3()
	{
		return oDelete3;
	}
	//WebElement for modify
	@FindBy(xpath = "//div[@class='node customerNode notSelected']//div[@class='editButton available']")
	private WebElement oEdit1;
	public WebElement getClickToModifyCustomer()
	{
		return oEdit1;
	}
	
	//Create Project WebElements
	//webElement for click on AddProject
	@FindBy(xpath = "//div[@class='item createNewProject ellipsis']")
	private WebElement oProject;
	public WebElement getClickOnAddProject()
	{
		return oProject;
	}
	//WebElement for Write Project Name
	private WebElement projectPopup_projectNameField;
	public WebElement getWriteProjectName()
	{
		return projectPopup_projectNameField;
	}
	//WebElement for Write Project Discription
	private WebElement projectPopup_projectDescriptionField;
	public WebElement getWriteProjectDiscription()
	{
		return projectPopup_projectDescriptionField;
	}
	//WebElement for Click on Create Project
	//@FindBy(xpath = "//*[@id=\"projectPopup_commitBtn\"]/div/span")
	@FindBy(xpath = "//span[text()='Create Project']")
	private WebElement oCproject;
	public WebElement getClickOnCreateProjectButton()
	{
		return oCproject;
	}
	
	//Delete Project WebElements
	//WebElement for Modify projectbutton
	@FindBy(xpath = "//div [@class='node projectNode selected']//div[@class='editButton available']")
	private WebElement oModifyp;
	public WebElement getClickToModifyProjectName()
	{
		return oModifyp;
	}
	//WebElement for edit project
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement oEProject;
	public WebElement getClickOnModifyDescription()
	{
		return oEProject;
	}
	//WebElement for DeleteProject1
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement oDeletep;
	public WebElement getClickOnDeleteStep1()
	{
		return oDeletep;
	}
	//WebElement for Delete Project Step2
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement oDeletep2;
	public WebElement getClickOnDeleteStep2()
	{
		return oDeletep2;
	}
	//WebElement for Delete Project Step3
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getClickOnDeleteStep3()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	
	//Create Task WebElements
	//WebElement for clickon addtask button
	@FindBy(xpath = "//div[text()='Add New Task']")
	private WebElement oAddTask;
	public WebElement getClickOnAddTaskButton()
	{
		return oAddTask;
	}
	//WebElement for clickon Create new Task
	@FindBy(xpath = "//div[@class='item createNewTask ellipsis']")
	private WebElement oCreateNewTask;
	public WebElement getClickOnCreateNewTaskButton()
	{
		return oCreateNewTask;
	}
	//WebElement for Enrer TaskName
	@FindBy(xpath = "//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	private WebElement oETName;
	public WebElement getWriteTaskName()
	{
		return oETName;
	}
	//WebElement for Click CheckBox
	@FindBy(xpath = "//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[5]/div/input")
	private WebElement oCheckBox;
	public WebElement getclickOnTaskCheckBox()
	{
		return oCheckBox;
	}
	//WebElement for create task button
	@FindBy(xpath = "//*[@id=\"createTasksPopup_commitBtn\"]/div/span")
	private WebElement oCreateTask;
	public WebElement getclickOnCreateTask()
	{
		return oCreateTask;
	}
	
	//Delete TAsk WebElements
	//WebElement for click on cteated task
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
	private WebElement oCEditTask;
	public WebElement getClickOnCreatedTaskForEdit()
	{
		return oCEditTask;
	}
	//WebElement for DeleteTask1
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement oDTask1;
	public WebElement getClickOnDeleteTaskStep1()
	{
		return oDTask1;
	}
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
	private WebElement oDTask2;
	public WebElement getClickOnDeleteTaskStep2()
	{
		return oDTask2;
	}
	private WebElement taskPanel_deleteConfirm_submitTitle;
	public WebElement getClickOnDeleteTaskStep3()
	{
		return taskPanel_deleteConfirm_submitTitle;
	}
}

