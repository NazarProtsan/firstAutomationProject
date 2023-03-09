package com.finWorks.step_definitions;


import com.finWorks.pages.BasePage;
import com.finWorks.pages.SalesPage;
import com.finWorks.utilities.BrowserUtils;
import io.cucumber.core.runtime.BackendServiceLoader;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US95_Stepdefenition {

  BasePage basePage = new BasePage() ;
  SalesPage salesPage=new SalesPage();



    @When("the user click on sales module")
    public void the_user_click_on_sales_module() {
        basePage.salesButton.click();
      BrowserUtils.sleep(5);
    }
    @When("user click on top checkbox")
    public void user_click_on_top_checkbox() {
    salesPage.selectallcheckbox.click();
      BrowserUtils.sleep(5);
    }
    @Then("Verify all checkboxes are selected")
    public void verify_all_checkboxes_are_selected() {
      boolean check = true;
      for (WebElement each:salesPage.checkBoxesSales){

        if (!each.isSelected()){
          check=false;
        break;


        }


      }
      Assert.assertTrue(check);

    }


}
