package com.veeva.Seesion3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//lets talk about css locators example
public class CssLocators {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("url of the brower");

        // 1. ID Selector
        driver.findElement(By.cssSelector("#username"));

        // 2. Class Selector
        driver.findElement(By.cssSelector(".user"));

        // 3. Tag Selector
        driver.findElement(By.cssSelector("input"));

    }
}
