package stepDefinations;

import BaseClass.openBrowser;
import RegistrationPage.AT02_CreateAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import java.io.IOException;

public class SD04_DataDrivenTesting {

    @Given("open browser and navigate to Reg Screen")
    public void open_browser_and_navigate_to_reg_screen() throws IOException {
        AT02_CreateAccount.AccCreate();
    }
    @Then("enter Firstname as {string}")
    public void enter_firstname_as(String FirstName) {
        openBrowser.driver.findElement(By.id("firstname")).sendKeys(FirstName);
    }


    @Then("enter Lastname as {string}")
    public void enter_lastname_as(String LastName) {
        openBrowser.driver.findElement(By.id("lastname")).sendKeys(LastName);
    }
    @Then("enter EmailAddress as {string}")
    public void enter_email_address_as(String EmailAddress) {
            openBrowser.driver.findElement(By.id("email_address")).sendKeys(EmailAddress);

    }
}
