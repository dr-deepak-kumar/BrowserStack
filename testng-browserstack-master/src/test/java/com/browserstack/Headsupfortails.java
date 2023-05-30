package com.browserstack;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.browserstack.SeleniumTest;

public class Headsupfortails  extends SeleniumTest {
    private String baseUrl = "https://www.headsupfortails.com";
    

    @Test
    public void verifyHomepageTitle() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(5000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Heads Up For Tails: Online Pet Store for Pet Supplies & Products";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test
    public void verifyProductSearchFunctionality() throws InterruptedException  {
       driver.get(baseUrl);
       //	 WebElement element = driver.findElement(By.name("q"));
       	WebElement element = driver.findElement(By.xpath("//input[@id='huftproductsearch']"));  	 
       //  WebElement searchInput = driver.findElement(By.cssSelector("div[class='DKM_THL_items st-search-bar hidden-mobile'] input[placeholder='Search anything for your pet...']"));
       	//element.sendKeys(Keys.SHIFT);
        element.sendKeys("dog collar");
        Thread.sleep(5000);
        String actualSearchResultsTitle = driver.getTitle();
        Assert.assertTrue(actualSearchResultsTitle.contains("dog collar"));
    
}

}
