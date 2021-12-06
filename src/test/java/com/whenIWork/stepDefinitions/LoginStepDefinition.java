package com.whenIWork.stepDefinitions;

import com.whenIWork.pages.LoginPage;
import com.whenIWork.utilities.BrowserUtil;
import com.whenIWork.utilities.ConfigurationReader;
import com.whenIWork.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinition extends LoginPage {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

    @Given("User is on home page")
    public void user_is_on_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("homePage"));
    }
    @When("User clicks on login")
    public void user_clicks_on_login() {
        loginHomeButton.click();
    }
    @When("User should be able to enter {string} and {string}")
    public void user_should_be_able_to_enter_and(String validEmail, String validPassword) {
        inputEmail.sendKeys(validEmail);
        inputPassword.sendKeys(validPassword);
    }
    @When("User should be able to click login button")
    public void user_should_be_able_to_click_login_button() {
        loginSubmit.click();
    }
    @Then("Title should be {string}")
    public void title_should_be(String expectedTitle) {
        BrowserUtil.sleep(3);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("User should be able to enter invalid {string} and valid {string}")
    public void user_should_be_able_to_enter_invalid_and_valid(String invalidEmail, String validPassword) {
        inputEmail.sendKeys(invalidEmail);
        inputPassword.sendKeys(validPassword);
    }

    @When("User should be able to enter valid {string} and invalid {string}")
    public void user_should_be_able_to_enter_valid_and_invalid(String validEmail, String invalidPassword) {
        inputEmail.sendKeys(validEmail);
        inputPassword.sendKeys(invalidPassword);
    }

    @And("User should be able to enter invalid {string} and invalid {string}")
    public void userShouldBeAbleToEnterInvalidAndInvalid(String invalidEmail, String invalidPassword) {
        inputEmail.sendKeys(invalidEmail);
        inputPassword.sendKeys(invalidPassword);
    }

    @Then("Login button should NOT be clickable")
    public void loginButtonShouldNOTBeClickable() {
        Assert.assertFalse(loginSubmit.isEnabled());
    }

    @Then("{string} should be displayed")
    public void shouldBeDisplayed(String alertNotice) {
        Assert.assertTrue(alert.isDisplayed() && alert.getText().equals(alertNotice));
    }
}
