package PageObjectModelImplementation;

import BaseClass.openBrowser;
import PropertiesFile.ReadPropertiesFile;
import io.cucumber.java.en.Then;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.CreateAccountPage;

import java.io.IOException;

public class AT01_CreateAccountHN   {

    @Test
    public void CreateAnAccountHN() throws IOException, InterruptedException {
        openBrowser.NavToWebsite("RegUrl");
        Thread.sleep(20000);
        CreateAccountPage AccPage= new CreateAccountPage(openBrowser.driver);
        AccPage.EnterFirstName("John");
        AccPage.EnterLastName("William");
        AccPage.EnterEmailAdd("John.William@gmail.com");



    }
}
