package RegistrationPage;

import BaseClass.openBrowser;
import org.junit.Test;

import java.io.IOException;

public class AT02_CreateAccount {

    @Test
    public static void AccCreate() throws IOException {
        openBrowser.NavToWebsite("RegUrl");
    }

}
