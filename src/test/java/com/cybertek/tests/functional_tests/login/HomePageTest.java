package com.cybertek.tests.functional_tests.login;

import com.cybertek.pages.HomePage;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    @Test
    public void test1(){
        driver.get("https://www.iaai.com/");
        hover(pages.getHomePage().Vehicle);
        pages.getHomePage().AdvanceSearch.click();


    }




}
