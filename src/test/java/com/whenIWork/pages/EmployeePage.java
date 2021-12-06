package com.whenIWork.pages;

import com.whenIWork.utilities.ConfigurationReader;
import com.whenIWork.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeePage {

    LoginPage loginPage = new LoginPage();

    public EmployeePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[.='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//a[@href='/scheduler']")
    public WebElement scheduler;

    @FindBy (xpath = "//span[.='Add Employees']")
    public WebElement addEmployeeButton;

    @FindBy (xpath = "//input[@id='first_name']")
    public WebElement inputFirstName;

    @FindBy (xpath = "//input[@id='last_name']")
    public WebElement inputLastName;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement inputEmail;

    @FindBy (xpath = "//input[@id='phone_number']")
    public WebElement inputMobile;

    @FindBy (xpath = "//button[@class='btn btn-primary float-right btn-md']")
    public WebElement continueToAssignmentsButton;

    @FindBy (xpath = "//button[@class='btn btn-primary float-right btn-md']")
    public WebElement finalSubmitForAddingEmployee;

    @FindBy (xpath = "//div[@class='text-truncate pl-2']")
    public List<WebElement> listOfAddedEmployees;

    public String lastAddedEmployeeName() {
      return listOfAddedEmployees.get(listOfAddedEmployees.size()-1).getText();
    }



}
