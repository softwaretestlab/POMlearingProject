package BaseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PropertiesFile.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class openBrowser {

    public static WebDriver driver;

    public static void NavToWebsite(String url) throws IOException {


        // This code will know what version of chrome you have installed on ur machine
        // and will open chrome browser

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);

        // Navigate to HN website
        driver.get(ReadPropertiesFile.PropFile(url));

        //maxium Wait for 30 sec
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void CloseBrowser() {
        driver.close();
        driver.quit();
    }

}