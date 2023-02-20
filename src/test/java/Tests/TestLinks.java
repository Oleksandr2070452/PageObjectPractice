package Tests;

import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.LinksPage;

public class TestLinks extends TestInit{
@Test
    public void clicking(){

        HomePage homePage = new HomePage(driver);
        ElementsPage elementsPage = new ElementsPage(driver);
        LinksPage linksPage = new LinksPage(driver);

        homePage.goToElements();
        elementsPage.getButtonLinks();
        linksPage.openNewTab();
    }
}
