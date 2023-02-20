package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement goToElements() {
        return driver.findElement(By.xpath("//div[@class='avatar mx-auto white']"));
    }

    public WebElement goToForms() {
        return driver.findElement(By.xpath("//h5[text()='Forms']"));
    }

    public WebElement goToAlertsFramesWindows() {
        return driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
    }

    public WebElement goToWidgets() {
        return driver.findElement(By.xpath("//h5[text()='Widgets']"));
    }

    public WebElement goToInteractions() {
        return driver.findElement(By.xpath("//h5[text()='Interactions']"));
    }

    public WebElement goToBookStoreApplications() {
        return driver.findElement(By.xpath("//h5[text()='Book Store Application']"));
    }
}
