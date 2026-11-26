package com.veeva.session5;


import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait  {

    public FluentWait(WebDriver driver) {

    }

    public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            // Open website
            driver.get("https://the-internet.herokuapp.com/login");

            // Create Fluent Wait
            FluentWait wait =
                    new FluentWait(driver)

                            // Maximum wait time
                            .withTimeout(Duration.ofSeconds(15))

                            // Check every 500 milliseconds
                            .pollingEvery(Duration.ofMillis(500))

                            // Ignore exception
                            .ignoring(NoSuchElementException.class);

            // Wait for username field
            WebElement username =
                    wait.until(d -> {

                        WebElement element = d.findElement(By.id("username"));

                        if (element.isDisplayed()) {
                            return element;
                        }

                        return null;
                    });

            username.sendKeys("tomsmith");

            // Enter password
            driver.findElement(By.id("password"))
                    .sendKeys("SuperSecretPassword!");

            // Click login
            driver.findElement(
                    By.cssSelector("button[type='submit']")
            ).click();

            System.out.println("Fluent Wait login completed");

            driver.quit();
        }
}

