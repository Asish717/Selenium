package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InstaAuto {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/accounts/login/");

        //signin
        Thread.sleep(1000);
        driver.findElement(By.name("username")).sendKeys("testdata");
        driver.findElement(By.name("password")).sendKeys("testingtestdatablz");
        Thread.sleep(1000);
        WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        //forgetpassword
        WebElement forgetpassword=driver.findElement(By.linkText("Forgot password?"));
        forgetpassword.click();
        Thread.sleep(1000);

        //create new account
        WebElement newaccount=driver.findElement(By.linkText("Create new account"));
        newaccount.click();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);
        WebElement element =  driver.findElement(By.xpath("//*[text()='Mobile number or email address']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys("1234567890");

        driver.findElement(By.xpath("//*[text()='Full Name']")).sendKeys("BRIDGELAB TEST");
        driver.findElement(By.name("username")).sendKeys("labzbridge");
        driver.findElement(By.name("password")).sendKeys("123@bridgeLab");
        Thread.sleep(1000);

        WebElement submit=driver.findElement(By.linkText("Sign up"));
        submit.click();
        //driver.close();
    }
}
