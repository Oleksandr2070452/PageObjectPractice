package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxPage;
import pages.ElementsPage;
import pages.HomePage;

public class TestCheckBox extends TestInit {
    @Test
    public void chooseFolder(){
    HomePage homePage = new HomePage(driver);
    ElementsPage elementsPage = new ElementsPage(driver);
    CheckBoxPage checkBoxPage = new CheckBoxPage(driver);


    homePage.goToElements().click();
    elementsPage.getCheckBox();














    }




}
