package com.cydeo.utilities;

/*
In this class only general utility methods that are not related to some specific page.
 */

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    /*
    This method will accept int (in seconds) and execute Thread.sleep for given duration
     */

    public void sleep(int second) {
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){


        }
    }

public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl,String expectedInTitle){

    Set<String> allWindowsHandles = driver.getWindowHandles();

    for (String each : allWindowsHandles) {

        driver.switchTo().window(each);

        System.out.println("Current URL: " + driver.getCurrentUrl());

        if (driver.getCurrentUrl().contains(expectedInUrl)){
            break;

        }
    }


    //5. Assert: Title contains “Etsy”
    String actualTitle = driver.getTitle();


    Assert.assertTrue(actualTitle.contains(expectedInTitle));



}

/*
This method accepts String "expectedTtitle" and Assert if its true
 */

    public static void verifyTitle(WebDriver driver ,String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }

    /*
    Creating a utility method for ExplicitWait, so we don't have to repeat the lines
     */
    /*
    public static void waitForInvisibilityOf(WebElement webElement){
        //driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }*/
}