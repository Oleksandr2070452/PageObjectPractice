package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonsPage extends BasePage {
    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement buttonPage() {
        return driver.findElement(By.xpath("//span[text() = 'Buttons']"));
    }

    public void getButton() {
        buttonPage().click();
    }

    public WebElement buttonDoubleClick() {
        return driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
    }

    public void makeDoubleClick() {
        actions.doubleClick(buttonDoubleClick());
    }

    public WebElement rightClick() {
        return driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
    }

    public WebElement makeRightClick() {
        actions.contextClick(rightClick());
        return null;
    }

    public WebElement clickMe() {
        return driver.findElement(By.xpath("//button[@id = 'NcBSL']"));
    }

    public void dynamicButton() {
        clickMe().click();
    }
}
