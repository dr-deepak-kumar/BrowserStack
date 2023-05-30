package com.browserstack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Webdriverwaitclass {
    
	@Test
    public void verifyProductSearchFunctionality() {
        WebDriver driver = new ChromeDriver();

        // Your test code here
        driver.get("www.headsupfortails.com");
        // Find the element
        WebElement searchInput = driver.findElement(By.xpath("//input[@id='huftproductsearch']"));

        // Wait for the element to be clickable
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchInput));

        // Perform the interaction with the element
       // searchInput.sendKeys("Test search query");
        searchInput.sendKeys("dog collar");
        Thread.sleep(5000);
        String actualSearchResultsTitle = driver.getTitle();
        Assert.assertTrue(actualSearchResultsTitle.contains("dog collar"));
    
        // Continue with the rest of the test code
        
        driver.quit();
    }

    // Other test methods here
}
