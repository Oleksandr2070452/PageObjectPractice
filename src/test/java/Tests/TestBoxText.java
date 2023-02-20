package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;

public class TestBoxText extends TestInit {

    @Test
    public void searchName() {
        HomePage homePage = new HomePage(driver);
        ElementsPage elementsPage = new ElementsPage(driver);
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", homePage.goToElements());
        sleep(5);
        homePage.goToElements().click();
        elementsPage.getTextBox();
        textBoxPage
                .fillFullNameField()
                .fillFullEmailField()
                .fillCurrentAddress()
                .fillPermanentAddress()
                .clickSubmitBtn();

        Assert.assertTrue(textBoxPage.fillFullNameField().fullNameField().isDisplayed());

        Assert.assertTrue(textBoxPage.fillFullEmailField().emailField().isDisplayed());

        Assert.assertTrue(textBoxPage.fillCurrentAddress().currentAddressField().isDisplayed());

        Assert.assertTrue(textBoxPage.fillPermanentAddress().permanentAddress().isDisplayed());

        Assert.assertTrue(textBoxPage.submitBtn().isDisplayed());





    }
}
