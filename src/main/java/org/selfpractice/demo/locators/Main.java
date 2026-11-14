package org.selfpractice.demo.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    static void main() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().fullscreen();

        //xpath
        driver.findElement(By.xpath("//input[@value=\"1\"]")).click();

        //use thread to see what is happening
        Thread.sleep(5000);

        //ID locators
        driver.findElement(By.id("small-searchterms"));
        driver.findElement(By.id("small-searchterms")).sendKeys("Apple");

        //classname locators
        driver.findElement(By.className("search-box-button")).click();

        //name locators
        driver.findElement(By.name("pollanswers-1")).click();

        //link text locators
//        driver.findElement(By.linkText("Sitemap")).click();

        //Tag Name
        //Remember that if the tag name is unique then only it will work or else it may not work everytime
        driver.findElement(By.tagName("input")).click();

        //partial link text
        driver.findElement(By.partialLinkText("Recently")).click();



        driver.quit();
        driver.close();
    }
}
