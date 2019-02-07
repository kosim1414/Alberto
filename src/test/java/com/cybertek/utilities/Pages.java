package com.cybertek.utilities;

import com.cybertek.pages.*;

public class Pages {
    private  HomePage homePage;

    public HomePage getHomePage(){
        return (homePage==null) ? homePage=new HomePage() : homePage;
    }



}