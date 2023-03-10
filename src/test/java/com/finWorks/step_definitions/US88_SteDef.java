package com.finWorks.step_definitions;

import com.finWorks.pages.ModulesPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US88_SteDef {
    ModulesPage modulesPage = new ModulesPage();
    @Then("user should see the {int} modules")
    public void user_should_see_the_modules(int expectedNumber) {
        int actualNumber = modulesPage.modulesCount();
        Assert.assertEquals(expectedNumber,actualNumber);
    }
}
