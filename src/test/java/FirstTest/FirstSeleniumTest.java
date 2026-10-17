package FirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
    public static void main(String[] args) {

    //create webdriver instance
    WebDriver webdriver = new ChromeDriver();

    //navigate to the instance
    webdriver.get("https://google.com");

    //now perform activity
    webdriver.manage().window().fullscreen();

    webdriver.close();
    }

}
