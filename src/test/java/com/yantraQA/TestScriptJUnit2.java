package com.yantraQA;

import com.yantraQA.base.TestBase;
import com.yantraQA.pageobjects.RegisterPageObjects;
import com.yantraQA.pageobjects.SignUpPageObjects;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


/*
Page Factory Demo
 */
public class TestScriptJUnit2 extends TestBase {

    @Test
    public void t_01_sign_up(){
        driver.get(baseUrl + "/Index.html");
        SignUpPageObjects signUpPageObjects = new SignUpPageObjects(driver);

        //Test Steps
        signUpPageObjects.signUpUser("akashdktyagi@gmail.com");
        signUpPageObjects.verifyTheTitle("Register");
    }

    @Test
    public void t_02_registration_form(){
        driver.get(baseUrl + "/Register.html");

        RegisterPageObjects registerPageObjects = new RegisterPageObjects(driver);
        registerPageObjects.setFirstNameTextBox("Akash");
        registerPageObjects.clickOnGenderAsMale();
        registerPageObjects.selectSkillsFromList("Analytics");

//        driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Akash");
//        driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Tyagi");
//        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("pune");
//        driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("Akash.gmail.com");
//        driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9876543212");
//        driver.findElement(By.xpath("//input[@ng-model='radiovalue' and @value='Male']")).click();
//        driver.findElement(By.xpath("//*[@value='Cricket']")).click();
//        driver.findElement(By.xpath("//input[@type='checkbox' and @value='Movies']")).click();

//        WebElement skillListElement = driver.findElement(By.id("Skills"));
//        Select skillsDropDown = new Select(skillListElement);
//        skillsDropDown.selectByVisibleText("Analytics");

        //Assertion
        //Junit Assertion
    }

}
