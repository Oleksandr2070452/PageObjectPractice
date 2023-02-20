package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage extends BasePage {
    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }


    public WebElement yesBtn() {
        return driver.findElement(By.xpath("//label[@for='yesRadio']"));
    }

    public WebElement impressiveBtn() {
        return driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
    }

    public WebElement nonClickableBtnNo() {
        return driver.findElement(By.xpath("//input[@id='noRadio']"));
    }
}
