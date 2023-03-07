package com.finWorks.pages;

import com.finWorks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesPage {

    public SalesPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//th[@class='o_list_record_selector']")
    public WebElement selectallcheckbox;

    @FindBy(xpath = "//tr[@class='o_data_row']//input[@type='checkbox']")

    public List<WebElement> checkBoxesSales;


}
