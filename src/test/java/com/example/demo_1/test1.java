package com.example.demo_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class test1 {

    private WebDriver driver;

    @BeforeAll
    public static void setupDriver(){
        WebDriverManager.edgedriver().setup();
    }
    @BeforeEach
    void setUp(){
        driver = new EdgeDriver();
    }
    @AfterEach
    void tearDown(){
        driver.quit();
    }

    @Test
    void openGoogle(){
        driver.get("");

        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("apple");
    }
}
