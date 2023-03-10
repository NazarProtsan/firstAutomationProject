package com.finWorks.pages;

import com.finWorks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ModulesPage {
    public ModulesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul/li[@style='display: block;']")

    public List<WebElement> listOfModules;


    public int modulesCount(){
        return listOfModules.size();





    }
}
