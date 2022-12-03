package HomePage;

import BaseClass.openBrowser;
import org.junit.Assert;
import org.junit.Test;


import java.io.IOException;

public class AT01_Navigate {
//test
@Test

public static void AT01_nav() throws IOException {
    //test
        openBrowser.NavToWebsite("url2");

        }

@Test
public static void AssertHNpage() throws InterruptedException {

    String ExpectedTitle= openBrowser.driver.getTitle();
    System.out.println(ExpectedTitle);
    Assert.assertTrue(ExpectedTitle.contains("Outsize"));
          }

        }

