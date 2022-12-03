package PageObjectModelImplementation;

import PropertiesFile.PropertiesFileExtractor;
import org.junit.Test;

import java.io.IOException;

public class yamlFileDataCalling {
@Test
    public void loginPage() throws IOException {
        System.out.println(PropertiesFileExtractor.initializeTestData("Registration.regurl"));
    }
}
