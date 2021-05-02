package com.yantraQA.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {

    private static WebDriver driver;
    public static WebDriver getDriver(String browserName){

        if (browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }else if  (browserName.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }else if  (browserName.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }else{
            driver=null;
        }

        return driver;
    }

    public WebDriver getDriver(){

        return driver;
    }
}
