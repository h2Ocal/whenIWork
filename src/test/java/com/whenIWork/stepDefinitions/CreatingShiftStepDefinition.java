package com.whenIWork.stepDefinitions;

import com.whenIWork.pages.CreatingShiftPage;
import com.whenIWork.pages.EmployeePage;
import com.whenIWork.pages.LoginPage;
import com.whenIWork.utilities.BrowserUtil;
import com.whenIWork.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;

public class CreatingShiftStepDefinition extends CreatingShiftPage {

    LoginPage loginPage = new LoginPage();
    EmployeePage employeePage = new EmployeePage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("User is on Scheduler Page")
    public void user_is_on_scheduler_page() {
        loginPage.userLogin();
        employeePage.scheduler.click();
    }

    @When("User clicks on a specific time on shift board")
    public void user_clicks_on_a_specific_time_on_shift_board() {
        BrowserUtil.sleep(2);
       emptyCell9am.click();
    }

    @And("User clicks on create a custom shift")
    public void user_clicks_on_create_a_custom_shift() {
        createCustomShift.click();
    }

    @And("User enters time {string} for shift")
    public void user_enters_time_for_shift(String userTime) {
        inputTimeForShift.sendKeys(userTime);
    }

    @And("User enters for unpaid {string} break amount")
    public void user_enters_for_unpaid_break_amount(String unPaidBreakAmount) {
       inputUnpaidBreakTime.sendKeys(unPaidBreakAmount);
    }

    @And("User clicks on save button")
    public void user_clicks_on_save_button() {
        saveButtonForShift.click();
    }

    @Then("User verifies that OpenShift schedule is displayed")
    public void userVerifiesThatOpenShiftScheduleIsDisplayed() {
        Assert.assertTrue(occupiedShiftBoard.isDisplayed());

    }

    @And("User deletes the openShift")
    public void userDeletesTheOpenShift() {
        occupiedShiftBoard.click();
        deleteButton.click();
        BrowserUtil.sleep(1);
        confirmDeleteButton.click();

    }

    @Given("User clicks on a specific time on openShift board")
    public void user_clicks_on_a_specific_time_on_open_shift_board() {
        BrowserUtil.sleep(2);
        openShift9am.click();
    }
    @When("User clicks on save and publish")
    public void user_clicks_on_save_and_publish() {
        saveAndPublishButton.click();
    }
    @When("User clicks on edit")
    public void user_clicks_on_edit() {
        occupiedShiftBoard.click();
    }
    @When("User assigns it to an employee")
    public void user_assigns_it_to_an_employee() {
        inputAssignTo.click();
    }



}
