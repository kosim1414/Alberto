package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 public HomePage(){
     PageFactory.initElements(Driver.getDriver(),this);
 }

 @FindBy(xpath = "//nav[@id='https://www.iaai.com/']/ul/li/a")
 public WebElement Vehicle;

 @FindBy(xpath = "//ul[@class='subMenu']/li/a")
    public WebElement AdvanceSearch;









}
