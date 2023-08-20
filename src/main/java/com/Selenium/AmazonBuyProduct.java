package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBuyProduct {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/ref=nav_logo");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung s23");
        driver.findElement(By.id("nav-search-submit-button")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[1]")).click();

        driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.name("proceedToRetailCheckout")).click();

        driver.findElement(By.id("ap_email")).sendKeys("9493792019");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("asish717");
        driver.findElement(By.id("signInSubmit")).click();

        driver.findElement(By.id("shipToThisAddressButton")).click();

        Thread.sleep(5000);
        driver.close();
    }
}
