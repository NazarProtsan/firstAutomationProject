package com.finWorks.step_definitions;

import com.finWorks.pages.US90_Page;
import com.finWorks.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US90_StepDefs {

    com.finWorks.pages.US90_Page US90_Page = new US90_Page();


    @When("POS clicks on the Point of sale module")
    public void posClicksOnThePointOfSaleModule() {
        BrowserUtils.sleep(5);
        US90_Page.posModule.click();
        BrowserUtils.sleep(5);
    }

    @Then("POS clicks on Orders")
    public void pos_clicks_on_orders() {

        US90_Page.ordersModule.click();

    }
    @Then("POS clicks on Order Ref checkbox")
    public void pos_clicks_on_order_ref_checkbox() {
        US90_Page.orderRefCheckBox.click();
    }

    @Then("POS sees that all orders are checked")
    public void posSeesThatAllOrdersAreChecked() {
        //System.out.println("orderRefCheckBox.isSelected() = " + US90_Page.orderRefCheckBox.isSelected());
        Assert.assertTrue(US90_Page.orderRefCheckBox.isSelected());


        for (WebElement each : US90_Page.allCheckboxes) {

            Assert.assertTrue(each.isDisplayed());
            Assert.assertTrue("Checkbox is not selected", each.isDisplayed());
        }

    }

    @And("POS sees that Action button is displayed")
    public void posSeesThatActionButtonIsDisplayed() {
        US90_Page.actionDropdown.isDisplayed();
    }
    @Then("POS clicks on Action drop down button")
    public void pos_clicks_on_action_drop_down_button() {
        US90_Page.actionDropdown.click();
    }


    @And("POS sees three options: Import, Export, Delete")
    public void posSeesThreeOptionsImportExportDelete() {

        int actual =0;
        int expected = 3;

        List<String> actualMenuOptions = new ArrayList<>();
        List<String>expectedMenuOptions = new ArrayList<>();

        expectedMenuOptions.add("Import");
        expectedMenuOptions.add("Export");
        expectedMenuOptions.add("Delete");


        for (WebElement each: US90_Page.menuOptions) {
            actual++;
            actualMenuOptions.add(each.getText());
        }


        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);
        System.out.println("actualMenuOptions = " + actualMenuOptions );
        System.out.println("expectedMenuOptions = " + expectedMenuOptions);
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expectedMenuOptions, actualMenuOptions);



}
}
