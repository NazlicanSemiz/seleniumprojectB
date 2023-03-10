package com.cydeo.tests.day2_locators_getText_getAttiribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {

      //  TC #1: Cydeo practice tool verifications
      //  1. Open Chrome browser
        WebDriverManager.chromedriver().setup(); //1- Set up the browser driver
        WebDriver driver = new ChromeDriver();   // This is the line opening an empty browser
        driver.manage().window().maximize();     // This line will maximize the browser size

      //  2. Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com"); // Test if driver is working as expected

      //  3.Verify URL contains
        //  Expected: cydeo
        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification Passed!");
        }else {
            System.out.println("URL verification Failed!");
        }

      //  4.Verify title:
      //  Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed!");
        }else {
            System.out.println("Title verification Failed!");
        }

        driver.close(); // this will close the currently opened  window



    }
}
