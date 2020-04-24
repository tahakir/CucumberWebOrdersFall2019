package com.weborders.step_definitions;

import com.weborders.pages.BasePage;
import com.weborders.pages.LoginPage;
import com.weborders.utilities.BrowserUtilities;
import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefinitions extends BasePage {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Going to Web Orders web page");
        Driver.getDriver(ConfigurationReader.getProperty("url"));

    }

    @When("user enters credentials")
    public void user_enters_credentials() {
        System.out.println("Entering credentials");
        BrowserUtilities.wait(3);
        LoginPage loginPage=new LoginPage();
        loginPage.login();

    }

    @Then("user verifies header as Web Orders")
    public void user_verifies_header_as_Web_Orders() {
        BrowserUtilities.wait(3);
        System.out.println("Verifying the title");
        String expected="Web Orders";
        String actual=driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(actual,expected);
    }


}
