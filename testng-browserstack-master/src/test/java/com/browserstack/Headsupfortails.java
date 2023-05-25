package com.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.browserstack.SeleniumTest;

public class Headsupfortails  extends SeleniumTest {
    private String baseUrl = "https://www.headsupfortails.com";
    

    @Test
    public void verifyHomepageTitle() {
        driver.get(baseUrl);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Heads Up For Tails: Online Pet Store for Pet Supplies & Products";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test
    public void verifyProductSearchFunctionality() throws InterruptedException  {
        driver.get(baseUrl);
        WebElement searchInput = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/header[1]/div[1]/div[1]/div[3]/div[2]/input[1]"));
        searchInput.sendKeys("dog collar");
        Thread.sleep(5000);
        String actualSearchResultsTitle = driver.getTitle();
        Assert.assertTrue(actualSearchResultsTitle.contains("dog collar"));
    }
}


