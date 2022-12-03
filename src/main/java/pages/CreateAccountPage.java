package pages;

import BaseClass.openBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends openBrowser {
    // this is how we store the locator of the webelement
    @FindBy(id="firstname")
    WebElement FirstName;

    @FindBy(id="lastname")
    WebElement Lastname;

    @FindBy(id="email_address")
    WebElement EmailAdd;

    public CreateAccountPage(WebDriver d) {
        driver = d;
        PageFactory.initElements(d, this);
    }
// FirstName
    public void ClearFirstNameField(){
        FirstName.clear();
    }
    public void EnterFirstName(String fname){
        FirstName.sendKeys(fname);
    }
    // LastName
    public void ClearLastNameField(){
        Lastname.clear();
    }
    public void EnterLastName(String lname){
        Lastname.sendKeys(lname);
    }
    // FirstName
    public void ClearEmailAddField(){
        EmailAdd.clear();
    }
    public void EnterEmailAdd(String Entemail){
        EmailAdd.sendKeys(Entemail);
    }

}
