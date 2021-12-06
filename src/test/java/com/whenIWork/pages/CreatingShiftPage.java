package com.whenIWork.pages;

import com.whenIWork.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreatingShiftPage {

    public CreatingShiftPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@id='hour_09am_57']")
    public WebElement emptyCell9am;

    @FindBy (xpath = "//div[.='Create Custom Shift']")
    public WebElement createCustomShift;

    @FindBy (xpath = "//input[@class='form-control time-picker-input react-autosuggest__input']")
    public WebElement inputTimeForShift;

    @FindBy (xpath = "//input[@id='break_time']")
    public WebElement inputUnpaidBreakTime;

    @FindBy (xpath = "//button[@name='save']")
    public WebElement saveButtonForShift;

    @FindBy (xpath = "//div[@class='details col text-black']")
    public WebElement occupiedShiftBoard;

    @FindBy (xpath = "//i[@class='fa fa-ellipsis-v']")
    public WebElement editButton;

    @FindBy (xpath = "//button[@class='btn btn-danger delete-shift btn-sm']")
    public WebElement deleteButton;

    @FindBy (xpath = "//button[@class='btn btn-danger btn-sm']")
    public WebElement confirmDeleteButton;

    @FindBy (xpath = "//div[@id='hour_09am_9']")
    public WebElement openShift9am;

    @FindBy (xpath = "//button[@name='save-publish']")
    public WebElement saveAndPublishButton;

    @FindBy (xpath = "(//div[@class='Select css-2b097c-container'])[3]")
    public WebElement inputAssignTo;

}
