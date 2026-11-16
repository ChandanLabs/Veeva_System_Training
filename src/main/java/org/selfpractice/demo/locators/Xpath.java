package org.selfpractice.demo.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Challenge 1: CSS Selector
        WebElement productCard = driver.findElement(By.cssSelector("div[data-product-id='99401']"));

        // Challenge 2: CSS Selector
        WebElement qtyInput = driver.findElement(By.cssSelector("input.qty-input"));
        qtyInput.clear();
        qtyInput.sendKeys("2");

        // Challenge 3: XPath matching exact visible text
        WebElement addToCartBtn = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
        addToCartBtn.click();

        // Challenge 4: XPath traversing from title to price
        WebElement priceElement = driver.findElement(
                By.xpath("//h3[text()='Wireless Noise-Canceling Headphones']/following-sibling::div[@class='price-box']/span[@class='amount']")
        );
        System.out.println("Product Price: " + priceElement.getText());
    }
}
