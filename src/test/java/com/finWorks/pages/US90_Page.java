package com.finWorks.pages;

import com.finWorks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US90_Page {

    public US90_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[normalize-space()='Point of Sale'])[1]")
    public WebElement posModule;

    @FindBy (xpath = "(//span[normalize-space()='Orders'])[3]")
    public  WebElement ordersModule;

    @FindBy (xpath ="(//div[@class='o_checkbox']//input[@type='checkbox'])[3]")
    public  WebElement orderRefCheckBox;

    @FindBy (xpath ="//button[normalize-space()='Action']" )
    public  WebElement actionDropdown;

    @FindBy (xpath = "(//ul[@role='menu'])[6]//li")
    public List<WebElement> menuOptions;

    @FindBy(xpath = "//table//div[@class='o_checkbox']")
    public List<WebElement> allCheckboxes;
}
