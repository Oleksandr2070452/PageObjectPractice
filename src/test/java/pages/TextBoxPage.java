package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage extends BasePage {
    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    public WebElement fullNameField() {
        return driver.findElement(By.xpath("//input[@id='userName']"));
    }

    public TextBoxPage fillFullNameField() {
        fullNameField().sendKeys("Oleksandr");
        return this;
    }

    public WebElement emailField() {
        return driver.findElement(By.xpath("//input[@id='userEmail']"));
    }

    public TextBoxPage fillFullEmailField() {
        emailField().sendKeys("oleksandr.kraglyk@gmail.com");
        return this;
    }

    public WebElement currentAddressField() {
        return driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
    }

    public TextBoxPage fillCurrentAddress() {
        currentAddressField().sendKeys("Washington Street 12");
        return this;
    }

    public WebElement permanentAddress() {
        return driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
    }

    public TextBoxPage fillPermanentAddress() {
        permanentAddress().sendKeys("Franklin Avenue 112b");
        return this;
    }

    public WebElement submitBtn() {
        return driver.findElement(By.xpath("//button[@id='submit']"));
    }

    public TextBoxPage clickSubmitBtn() {
        submitBtn().click();
        return this;
    }

    public WebElement getPersonalInformationField(String personalInformation) {
        return driver.findElement(By.xpath(String.format("//div[@class='border col-md-12 col-sm-12']/p[@id='%s']", personalInformation)));
    }

}
