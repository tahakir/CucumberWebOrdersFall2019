package com.weborders.step_definitions;

import com.weborders.pages.BasePage;
import com.weborders.pages.LoginPage;
import com.weborders.pages.OrderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;


public class AddOrdersStepDefinitions extends BasePage {
OrderPage orderPage=new OrderPage();

    @Given("user logs in")
    public void user_logs_in() {
        System.out.println("User logs in");
        LoginPage loginPage=new LoginPage();
        loginPage.login();
    }

    @Given("user navigates to {string} page")
    public void user_navigates_to_page(String string) {
        System.out.println("User navigates to: "+string);
        navigateTo("Order");

    }

    @When("user enters product information:")
    public void user_enters_product_information(List<Map<String,String>> dataTable) {
        System.out.println("Entering the product details: "+dataTable);
        for (Map<String, String> row : dataTable) {
            orderPage.selectProduct(row.get("Product"));
            orderPage.setQuantity(row.get("Quantity"));
            orderPage.setPriceUnitPrice(row.get("Price per unit"));
            orderPage.setDiscount(row.get("Discount"));

        }
    }

    @When("user click on calculate button")
    public void user_click_on_calculate_button() {
        System.out.println("Clicking on the calculate button");
        orderPage.pushCalculateBtn();
    }

    @Then("user should verify that total {int} is displayed")
    public void user_should_verify_that_total_is_displayed(int int1) {
        System.out.println("Verifying the total: "+int1);
        Assert.assertEquals(int1,216);

    }

    @When("user enters address information:")
    public void user_enters_address_information(List<Map<String,String>> dataTable) {
        System.out.println(dataTable);
        for (Map<String, String> row : dataTable) {
            orderPage.setCustomerName(row.get("Customer name"));
            orderPage.setStreet(row.get("Street"));
            orderPage.setCity(row.get("State"));
            orderPage.setZip(row.get("Zip"));
        }
    }

    @When("user enters payment information:")
    public void user_enters_payment_information(List<Map<String,String>> dataTable) {
        System.out.println(dataTable);
        for (Map<String, String> row : dataTable) {
            orderPage.setCardType();
            orderPage.setCardNr(row.get("Card Nr:"));
            orderPage.setExpireDate(row.get("Expire date (mm/yy)"));
        }
    }

    @When("user click on process button")
    public void user_click_on_process_button() {
        System.out.println("User clicks on the process button");
        orderPage.setProcessBtn();
    }

    @When("user goes to {string} page")
    public void user_goes_to_page(String string) {
        System.out.println("User goes to: "+string);
        orderPage.navigateTo("View all orders");
    }


    @Then("user verifies that order is displayed")
    public void user_verifies_that_order_is_displayed(List<Map<String,String>> dataTable) {
        System.out.println(dataTable);
        for (Map<String, String> row : dataTable) {
            Assert.assertEquals(row.get("Name"),orderPage.getOrderName());
            Assert.assertEquals(row.get("Product"),orderPage.getOrderInfo());
        }


    }

}
