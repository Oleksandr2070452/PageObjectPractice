package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public Actions actions;

    public BasePage(Actions actions) {
        this.actions = actions;
    }

}
