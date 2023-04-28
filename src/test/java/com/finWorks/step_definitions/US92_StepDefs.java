package com.finWorks.step_definitions;

import com.finWorks.pages.RozaPage;
import com.finWorks.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US92_StepDefs {

    RozaPage roza = new RozaPage();

    @And("user sees logged_name is {string}")
    public void user_sees_logged_avatar_in_as(String userName) {
       BrowserUtils.sleep(3);
        System.out.println(roza.logged_avatar.getText());
        System.out.println(userName);
        BrowserUtils.sleep(2);


        Assert.assertTrue(roza.logged_avatar.getText().contains(userName));


    }
    @And("user sees fifteen modules")
    public void user_sees_fifteen_modules() {
        List<String> modules=new ArrayList();
        int expected = 16;
        int actual = 0;

        for(WebElement each:roza.modules){
            modules.add(each.getText());
            actual++;

        }

        System.out.println(modules);
        Assert.assertEquals(expected,actual);
    }
}
