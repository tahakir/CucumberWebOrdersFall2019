package com.weborders.pages;

import com.weborders.utilities.BrowserUtilities;
import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "#ctl00_MainContent_username")
    private WebElement userName;
    @FindBy(css = "#ctl00_MainContent_password")
    private WebElement password;

    public void login(){
    driver.get(ConfigurationReader.getProperty("url"));
    userName.sendKeys(ConfigurationReader.getProperty("username"));
    password.sendKeys(ConfigurationReader.getProperty("password"),Keys.ENTER);


    }

    public void login(String usernameValue,String passwordValue){

    }
}