package com.finWorks.step_definitions;

import com.finWorks.pages.Repairs_Page;
import com.finWorks.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US97_StepDefs {

    Repairs_Page repairs = new Repairs_Page();

    @And("user sees logged in as {string}")
    public void userSeesLoggedInAs(String userName) {

        System.out.println(repairs.logged_as.getText());
        System.out.println(userName);
        BrowserUtils.sleep(2);

        Assert.assertTrue(repairs.logged_as.getText().contains(userName));;
    }

    @When("user clicks on Repairs module")
    public void user_clicks_on_repairs_module() {
        BrowserUtils.sleep(2);
        repairs.repairs.click();
        BrowserUtils.sleep(2);

    }
    @Then("user sees six columns: Repair Reference, Product to Repair, Customer, Delivery Address, Warranty Expiration, Status")
    public void user_sees_six_columns_repair_reference_product_to_repair_customer_delivery_address_warranty_expiration_status() {

        List<String> expected_columns = new ArrayList<>(Arrays.asList("Repair Reference", "Product to Repair", "Customer", "Delivery Address", "Warranty Expiration", "Status"));

        List<String> actual_columns = new ArrayList<>();

        for (WebElement each : repairs.columns) {
            actual_columns.add(each.getText());
        }
        System.out.println(expected_columns);
        System.out.println(actual_columns);

        Assert.assertTrue(expected_columns.containsAll(actual_columns));
        BrowserUtils.sleep(2);

    }

}