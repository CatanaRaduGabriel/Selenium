package com.endava;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by racatana on 7/29/2016.
 */
public class GmailTest {


    static WebDriver webDriver;



    @BeforeClass
    public static void setUp(){

        webDriver = new FirefoxDriver();
        webDriver.get("https://gmail.com");

        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;


    }
    @Test
    public void testGmail(){


        WebElement emailField = webDriver.findElement(By.xpath("//input[@id='Email']"));
        emailField.sendKeys("en.raducatana@gmail.com");
        WebElement nextButton = webDriver.findElement((By.xpath("//input[@id='next']")));
        nextButton.click();
        WebElement passwdField = webDriver.findElement((By.xpath("//input[@id='Passwd']")));
        passwdField.sendKeys("Tunning@112");
        WebElement singinButton = webDriver.findElement(By.xpath("//input[@id='signIn']"));
        singinButton.click();

        WebElement composeButton = webDriver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
        composeButton.click();
        WebElement toField = webDriver.findElement((By.xpath("//textarea[@aria-label='Către']")));
        toField.sendKeys("endavaselenium@gmail.com");
        WebElement subjectField = webDriver.findElement(By.xpath("//input[@placeholder='Subiect']"));
        subjectField.sendKeys("test Catana Radu ");
        WebElement bodyField = webDriver.findElement(By.xpath("//div[@aria-label='Corpul mesajului']"));
        bodyField.sendKeys("testat");
        WebElement sendButton = webDriver.findElement(By.xpath("//div[@aria-label='Trimite ‪(Ctrl-Enter)‬']"));
        sendButton.click();
    }
    @AfterClass
    public static void tearDown(){

        webDriver.close();
    }
}
