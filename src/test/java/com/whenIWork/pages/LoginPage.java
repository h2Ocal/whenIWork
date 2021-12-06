package com.whenIWork.pages;

import com.whenIWork.utilities.ConfigurationReader;
import com.whenIWork.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;


public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[.='Log In']")
    public WebElement loginHomeButton;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement inputEmail;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement inputPassword;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginSubmit;

    @FindBy (xpath = "//div[@class='notice-list']//div[@class='notice alert alert-danger']")
    public WebElement alert;

    public void userLogin() {
        Driver.getDriver().get(ConfigurationReader.getProperty("homePage"));
        loginHomeButton.click();
        inputEmail.sendKeys(ConfigurationReader.getProperty("userEmail"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("userPassword"));
        loginSubmit.click();
    }
}
