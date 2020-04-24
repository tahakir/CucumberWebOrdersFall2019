package com.weborders.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class OrderPage extends BasePage{

    @FindBy(name = "ctl00$MainContent$fmwOrder$ddlProduct")
    private WebElement product;
    public void selectProduct(String selectProduct){

        Select select=new Select(product);
        select.selectByVisibleText(selectProduct);
    }

    @FindBy(name = "ctl00$MainContent$fmwOrder$txtQuantity")
    private WebElement quantity;
    public void setQuantity(String setQuantity){
        quantity.clear();
        quantity.sendKeys(setQuantity);
    }

    @FindBy(name = "ctl00$MainContent$fmwOrder$txtUnitPrice")
    private WebElement priceUnitPrice;
    public void setPriceUnitPrice(String pup){
        priceUnitPrice.clear();
        priceUnitPrice.sendKeys(pup);
    }

    @FindBy(name = "ctl00$MainContent$fmwOrder$txtDiscount")
    private WebElement discount;
    public void setDiscount(String setDiscount){
        discount.clear();
        discount.sendKeys(setDiscount);
    }

    @FindBy(xpath = "(//input[@class='btn_dark'])[1]")
    private WebElement calculateBtn;
    public void pushCalculateBtn(){
        calculateBtn.click();
    }

    @FindBy(name = "ctl00$MainContent$fmwOrder$txtTotal")
    private WebElement total;
      public void getTotal(){
          int x=Integer.parseInt(total.getText());

    }

    //===========================================================
    @FindBy(name = "ctl00$MainContent$fmwOrder$txtName")
    private WebElement customerName;
    public void setCustomerName(String customerName1){
        customerName.clear();
        customerName.sendKeys(customerName1);
    }

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox2")
    private WebElement street;
    public void setStreet(String streetName){
        street.clear();
        street.sendKeys(streetName);
    }

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox3")
    private WebElement city;
    public void setCity(String cityName){
        city.clear();
        city.sendKeys(cityName);
    }

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox4")
    private WebElement state;
    public void setState(String stateName){
        state.clear();
        state.sendKeys(stateName);
    }

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox5")
    private WebElement zip;
    public void setZip(String zipNumber){
        zip.clear();
        zip.sendKeys(zipNumber);
    }
    //====================================================
    @FindBy(xpath = "(//input[@name='ctl00$MainContent$fmwOrder$cardList'])[1]")
    private WebElement cardType;
    public void setCardType(){
        cardType.click();
    }

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox6")
    private WebElement cardNr;
    public void setCardNr(String newCardNr){
        cardNr.sendKeys(newCardNr);
    }
    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox1")
    private WebElement expireDate;
    public void setExpireDate(String expiration){
        expireDate.sendKeys(expiration);
    }
    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    private WebElement processBtn;
    public void setProcessBtn(){
        processBtn.click();
    }

    @FindBy(xpath = "//tbody/tr[2]/td[2]")
    private WebElement orderName;
    public String getOrderName(){
       return orderName.getText();
    }
    @FindBy(xpath = "//tbody/tr[2]/td[3]")
    private WebElement orderInfo;
    public String getOrderInfo(){
       return orderInfo.getText();
    }


}
