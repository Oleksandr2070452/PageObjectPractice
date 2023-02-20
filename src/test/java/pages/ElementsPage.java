package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage extends BasePage {
    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement textBoxButton() {
        return driver.findElement(By.xpath("//span[text()='Text Box']"));
    }

    public void getTextBox() {
        textBoxButton().click();
    }

    public WebElement checkBoxButton() {
        return driver.findElement(By.xpath("//span[text()='Check Box']"));
    }

    public void getCheckBox() {
        checkBoxButton().click();
    }

    public WebElement radioButtons() {
        return driver.findElement(By.xpath("//span[text()= 'Radio Button']"));
    }

    public void getRadiButton() {
        radioButtons().click();
    }

    public WebElement webTablesPageClick() {
        return driver.findElement(By.xpath("//span[text()='Web Tables']"));
    }

    public void getWebTable() {
        webTablesPageClick().click();
    }

    public WebElement buttonsClick() {
        return driver.findElement(By.xpath("//span[text()='Buttons']"));
    }

    public void getButton() {
        buttonsClick().click();
    }
    public WebElement buttonLinks() {
        return driver.findElement(By.xpath("//li[text()= 'Links']"));
    }

    public void getButtonLinks() {
        buttonLinks().click();
    }
}
