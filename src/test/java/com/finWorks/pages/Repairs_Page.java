package com.finWorks.pages;

import com.finWorks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Repairs_Page {

    public Repairs_Page(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//span[normalize-space()='Repairs']")
    public WebElement repairs;

    @FindBy(xpath = "//th[@class='o_column_sortable']")
    public List <WebElement> columns;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement logged_as;

}
