package stepDefinations;

import HomePage.AT01_Navigate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD01_NavToSite {

@Given("open browser and enter url and press enter key")
public void open_browser_and_enter_url_and_press_enter_key() throws IOException {
    AT01_Navigate.AT01_nav();

}
    @Then("system navigates to homepage of HN")
    public void system_navigates_to_homepage_of_hn() throws InterruptedException {
        AT01_Navigate.AssertHNpage();
    }
}
