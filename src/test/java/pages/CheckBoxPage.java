package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage extends BasePage {
    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    public WebElement checkBox() {
        return driver.findElement(By.xpath("//li[@id='item-1']"));
    }

    public void checkBoxClick() {
        checkBox().click();
    }

    public WebElement toOpenFolders() {
        return driver.findElement(By.xpath("//button[@aria-label='Toggle']"));
    }

    public void clickToOpenFolders() {
        toOpenFolders().click();
    }

    public WebElement toFileCommands() {
        return driver.findElement(By.xpath("//span[text()='Commands']"));
    }

    public void clickToFileCommands() {
        toFileCommands().click();
    }

    public void clickCheckBox() {
        checkBox().click();
    }

}
