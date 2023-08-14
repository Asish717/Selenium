package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkdinAuto {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login");

        //sign in
        driver.findElement(By.id("username")).sendKeys("testing");
        driver.findElement(By.name("session_password")).sendKeys("bridgelabz");

        driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
        Thread.sleep(1000);

        //forget password
        WebElement forgotpasslink = driver.findElement(By.linkText("Forgot password?"));
        forgotpasslink.click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#username")).sendKeys("testing@123");
        Thread.sleep(1000);

        WebElement resetPasswd = driver.findElement(By.id("reset-password-submit-button"));
        resetPasswd.click();
        Thread.sleep(1000);

        //new account
        driver.findElement(By.partialLinkText("Back")).click();
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Join now")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("email-or-phone")).sendKeys("Asish");

        driver.findElement(By.name("password")).sendKeys("dash123");

        WebElement agreeAndJoin = driver.findElement(By.id("join-form-submit"));
        agreeAndJoin.click();
        Thread.sleep(1000);

        driver.findElement(By.partialLinkText("Sign in")).click();
        Thread.sleep(1000);
        driver.close();
    }
}
