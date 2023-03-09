package com.finWorks.step_definitions;

import com.finWorks.pages.HomePage;
import com.finWorks.pages.LoginPage;
import com.finWorks.pages.SalesPage;
import com.finWorks.utilities.BrowserUtils;
import com.finWorks.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US86_Step_def {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    SalesPage salesPage = new SalesPage();


    @Then("user clicks on sales module")
    public void user_clicks_on_sales_module() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(homePage.salesModule));
        homePage.salesModule.click();
        BrowserUtils.sleep(5);
    }

    @Then("user sees six columns")
    public void userSeesSixColumns() {
        System.out.println("Still working on it");

        List<String> expectedList = new ArrayList<>();
        expectedList.addAll(Arrays.asList("Quotation Number","Quotation Date","Customer", "Salesperson","Total","Status"));
        System.out.println(expectedList);

        System.out.println(salesPage.menuOptions.size());

        List <String> actualList = new ArrayList<>();

        for (WebElement eachMenuOption : salesPage.menuOptions) {
            actualList.add(eachMenuOption.getText());
        }

        System.out.println(actualList);

        Assert.assertTrue(expectedList.containsAll(actualList));

    }

}
