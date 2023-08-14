package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException{
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/accounts/emailsignup");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Full Name']")).sendKeys("BRIDGELAB TEST");
        driver.findElement(By.name("username")).sendKeys("labzbridge");
        driver.findElement(By.name("password")).sendKeys("123@bridgeLab");
        Thread.sleep(1000);

        WebElement submit=driver.findElement(By.linkText("Sign up"));
        submit.click();
        //driver.close();
    }
}
