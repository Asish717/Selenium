package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAuto {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login");

        //signin
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("asishkumar829@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("chotu829");
        Thread.sleep(1000);
        WebElement login = driver.findElement(By.id("loginbutton"));
        login.click();
        Thread.sleep(10000);

//        driver.findElement( By(""));

        driver.close();
    }
}
