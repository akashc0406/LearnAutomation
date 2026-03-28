package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
   
    
    public WebDriver driver;
    ConfigReader config = new ConfigReader();
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(config.getUrl());
    }

   @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
