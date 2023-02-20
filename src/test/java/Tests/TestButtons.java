package Tests;

import org.testng.annotations.Test;
import pages.ButtonsPage;
import pages.ElementsPage;
import pages.HomePage;

public class TestButtons extends TestInit {
    @Test
    public void clickButtons() {
        HomePage homePage = new HomePage(driver);
        ElementsPage elementsPage = new ElementsPage(driver);
        ButtonsPage buttonsPage = new ButtonsPage(driver);

        homePage.goToElements();
        elementsPage.getButton();
        buttonsPage.makeDoubleClick();
        buttonsPage.rightClick();
        buttonsPage.dynamicButton();




    }
}
