package com.finWorks.pages;

import com.finWorks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RozaPage {

    public RozaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement logged_avatar;

    @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> modules;
}
