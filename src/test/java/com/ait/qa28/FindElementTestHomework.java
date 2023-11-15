package com.ait.qa28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementTestHomework {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByCssSelectorTest() {
        // 1 element
        driver.findElement(By.cssSelector(".product-item"));
        // 2 element
        driver.findElement(By.cssSelector("#bar-notification"));
        // 3 element
        driver.findElement(By.cssSelector(".header-links"));
        // 4 element
        driver.findElements(By.cssSelector(".topic-html-content-body"));
        // 5 element
        driver.findElements(By.cssSelector("#dialog-notifications-error"));
        // 6 element
        driver.findElement(By.cssSelector("[name='NewsletterEmail']"));
        // 7 element
        driver.findElement(By.cssSelector(".customer-service"));
        // 8 element
        driver.findElements(By.cssSelector(".ajax-loading-block-window"));
        // 9 element
        driver.findElement(By.cssSelector("#subscribe-loading-progress"));
        // 10 element
        driver.findElement(By.cssSelector(".footer-poweredby"));
    }

    @Test
    public void findElementByxPathTest() {
        // 1 element
        driver.findElement(By.xpath("//div[@class='product-item']"));
        // 2 element
        driver.findElement(By.xpath("//div[@id='bar-notification']"));
        // 3 element
        driver.findElement(By.xpath("//div[@class='header-links']"));
        // 4 element
        driver.findElements(By.xpath("//div[@class='topic-html-content-body']"));
        // 5 element
        driver.findElements(By.xpath("//div[@class='dialog-notifications-error']"));
        // 6 element
        driver.findElement(By.xpath("//input[@name='NewsletterEmail']"));
        // 7 element
        driver.findElement(By.xpath("//div[@class='column customer-service']"));
        // 8 element
        driver.findElements(By.xpath("//ul[@class='ajax-loading-block-window']"));
        // 9 element
        driver.findElement(By.xpath("//span[@id='subscribe-loading-progress']"));
        // 10 element
        driver.findElement(By.xpath("//div[@class='footer-poweredby']"));
    }

}