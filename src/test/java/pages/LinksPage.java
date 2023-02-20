package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksPage extends BasePage {
    public LinksPage(WebDriver driver) {
        super(driver);
    }

    public WebElement openNewTab() {
        return driver.findElement(By.xpath("//p/a[text()= 'Home']"));
    }

    public void openNewTabClick() {
        openNewTab().click();
    }
}
