package com.yantraQA.base;

import com.yantraQA.managers.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected String baseUrl = "http://demo.automationtesting.in";

    @Before
    public void setUp(){
        String getBrowserNameFromCmd = System.getProperty("browserName");
        System.out.println("Browser Passed as : " + getBrowserNameFromCmd);
        driver  = DriverManager.getDriver(getBrowserNameFromCmd);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void cleanUp(){
        driver.quit();
    }

}
