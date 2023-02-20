package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.RadioButtonPage;

public class TestRadioButtons extends TestInit{
    @Test
    public void clickingBtn() throws InterruptedException {
    HomePage homePage = new HomePage(driver);
    ElementsPage elementsPage = new ElementsPage(driver);
    RadioButtonPage radioButtonPage = new RadioButtonPage(driver);

    homePage.goToElements().click();
    elementsPage.getRadiButton();
    radioButtonPage.yesBtn().click();
    sleep(2);
    radioButtonPage.impressiveBtn().click();
    sleep(2);
    radioButtonPage.nonClickableBtnNo().isEnabled();

        Assert.assertTrue(radioButtonPage.yesBtn().isDisplayed());
        Assert.assertTrue(radioButtonPage.impressiveBtn().isDisplayed());
        Assert.assertFalse(radioButtonPage.nonClickableBtnNo().isEnabled());


    }




}
