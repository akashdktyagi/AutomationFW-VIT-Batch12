package com.yantraQA.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {

    //1 thing
    WebDriver driver;

    String emailID = "email";
    //2nd thing
    private By email = By.id("email");
    private By clickSubmitButton = By.id("enterimg");

    //3rd Thing
    public SignUpPageObjects(WebDriver driver){
        this.driver = driver;
    }

    //4th Methods
    public void setEmail(String arg){
        driver.findElement(email).sendKeys(arg);
        //driver.findElement(By.id(emailID)).sendKeys(arg);
    }


    public void clickOnSubmitButton(){
        driver.findElement(clickSubmitButton).click();
    }

    // 5. Wrapper Methods/Business Method/Keyword Methods
    public void signUpUser(String arg){
        setEmail(arg);
        clickOnSubmitButton();
    }

    // Wrapper
    public void verifyTheTitle(String expectedTitle){
        String titleAfter = driver.getTitle();
        Assert.assertEquals("Title Matching Assertion",expectedTitle,titleAfter);
    }

}
