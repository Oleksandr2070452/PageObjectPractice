package Tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.WebTablesPage;

public class TestWebTables extends TestInit {
    @Test
    public void addNewEmployee() {
        HomePage homePage = new HomePage(driver);
        ElementsPage elementsPage = new ElementsPage(driver);
        WebTablesPage webTablesPage = new WebTablesPage(driver);

        homePage.goToElements().click();
        elementsPage.getWebTable();
        webTablesPage.addNewRecordButton().click();
        webTablesPage.fullFirstNameField();
        webTablesPage.fullLastNameField();
        webTablesPage.fullUserEmailField();
        webTablesPage.fullAgeField();
        webTablesPage.fullSalaryField();
        webTablesPage.fullDepartmentField();
        webTablesPage.submitButton().click();







    }
}
