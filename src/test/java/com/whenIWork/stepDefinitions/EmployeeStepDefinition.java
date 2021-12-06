package com.whenIWork.stepDefinitions;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class EmployeeStepDefinition extends EmployeePage {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

    @Given("User is on Employee Page")
    public void user_is_on_employee_page() {
        loginPage.userLogin();
    }

    @When("User clicks on continue button")
    public void user_clicks_on_continue_button() {
        scheduler.click();
    }

    @And("User clicks on addEmployee button")
    public void user_clicks_on_add_employee_button() {
        addEmployeeButton.click();
    }

    @And("User enters enters valid credentials")
    public void user_enters_enters_valid_credentials(Map<String, Object> dataTable) {

        for (String key : dataTable.keySet()) {
            String locator = "//input[@id='"+key+"']";
            Driver.getDriver().findElement(By.xpath(locator)).sendKeys((CharSequence) dataTable.get(key));
        }
    }

    @And("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        continueToAssignmentsButton.click();
        wait.until(ExpectedConditions.visibilityOf(finalSubmitForAddingEmployee));
        finalSubmitForAddingEmployee.click();
    }

    @Then("Employee first name {string} and last name {string} should be displayed")
    public void employeeFirstNameAndLastNameShouldBeDisplayed(String expectedFirstName, String expectedLastName) {

        String expectedName = expectedFirstName + " " + expectedLastName;

        Assert.assertEquals(expectedName, lastAddedEmployeeName()); // Update data for email and mobile for each test!!!
    }
}
