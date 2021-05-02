package com.yantraQA.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageObjectsPageFactory {

    //1 thing
    WebDriver driver;

    //2nd thing
    @FindBy(id = "email")
    private WebElement email ;

    @FindBy(id = "enterimg")
    private WebElement clickSubmitButton ;

    //3rd Thing
    public SignUpPageObjectsPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,SignUpPageObjectsPageFactory.class);
    }

    //4th Methods
    public void setEmail(String arg){
        email.sendKeys(arg);
    }

    public void clickOnSubmitButton(){
        clickSubmitButton.click();
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
