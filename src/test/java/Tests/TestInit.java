package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    public WebDriver driver;
    public Actions actions;
    public Select select;
    public JavascriptExecutor javascriptExecutor;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    }

//    @AfterMethod
//    public void closeDriver() {
//        driver.quit();
//    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setActions() {
        actions = new Actions(driver);
    }

    public void setSelect() {
        select = new Select((WebElement) driver);
    }

    public void scrollDown(){
        javascriptExecutor.executeScript("window.scroll(0,200)");
    }

}
