package org.selfpractice.demo.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();


        driver.close();
    }
}
