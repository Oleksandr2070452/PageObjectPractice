package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablesPage extends BasePage {
    public WebTablesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement addNewRecordButton() {
        return driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
    }

    public WebElement firsNameField() {
        return driver.findElement(By.xpath("//input[@id='firstName']"));
    }

    public void fullFirstNameField() {
        firsNameField().sendKeys("Marlen");
    }

    public WebElement lastNameField() {
        return driver.findElement(By.xpath("//input[@id='lastName']"));
    }

    public void fullLastNameField() {
        lastNameField().sendKeys("Oven");
    }

    public WebElement userEmailField() {
        return driver.findElement(By.xpath("//input[@id='userEmail']"));
    }

    public void fullUserEmailField() {
        userEmailField().sendKeys("marlenoven@gmail.com");
    }

    public WebElement ageField() {
        return driver.findElement(By.xpath("//input[@id='age']"));
    }

    public void fullAgeField() {
        ageField().sendKeys("35");
    }

    public WebElement salaryField() {
        return driver.findElement(By.xpath("//input[@id='salary']"));
    }
    public void fullSalaryField(){
        salaryField().sendKeys("2700");
    }

    public WebElement departmentField() {
        return driver.findElement(By.xpath("//input[@id='department']"));
    }
    public void fullDepartmentField(){
        departmentField().sendKeys("Test office");
    }

    public WebElement submitButton() {
        return driver.findElement(By.xpath("//button[@id='submit']"));
    }

    public WebElement reduceRowsNumbers() {
        return driver.findElement(By.xpath("//select[@aria-label='rows per page']"));
    }

    public WebElement manageRowsSize() {
        return driver.findElement(By.xpath("//select/option[text()='5 rows']"));
    }


}
