package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaPhoto {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/accounts/login");

        //signin
        Thread.sleep(1000);
//        driver.findElement(By.name("username")).sendKeys("asishkumar829@gmail.com");
//        driver.findElement(By.name("password")).sendKeys("chotu829");
//        Thread.sleep(1000);
//        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
//        login.click();
//        Thread.sleep(10000);
        WebElement fb=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[5]/button/span[2]"));
        fb.click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("asishkumar829@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("chotu829");
        Thread.sleep(1000);
        WebElement login = driver.findElement(By.id("loginbutton"));
        login.click();
        Thread.sleep(30000);

        driver.close();
    }
}
