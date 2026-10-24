package FirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstSeleniumTest {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // The browser will run invisibly in the background
        WebDriver driver = new ChromeDriver(options);

        //create webdriver instance
    WebDriver webdriver = new ChromeDriver();

    //navigate to the instance
    webdriver.get("https://google.com");

    //now perform activity
    webdriver.manage().window().fullscreen();

    webdriver.close();
    }

}
