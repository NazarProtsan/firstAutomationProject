package com.finWorks.step_definitions;

import com.finWorks.pages.ModulesPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US88_StepDef {

    ModulesPage modulesPage = new ModulesPage();
    @Then("user should see {int} modules")
    public void user_should_see_modules(int expectedModulesCount) {
        Assert.assertEquals(expectedModulesCount,modulesPage.modulesCount());
    }




}
