package uk.co.paysolution.cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        glue={"uk.co.paysolution"},
        monochrome = true,
        tags = "@regression"
)

public class CukeTest {

    @AfterClass
    public static void setUp() {
        String projectPath = System.getProperty("user.dir");
        String reportConfigPath = projectPath + "/src/test/resources/extendreport/extend.config.xml";
    }
}
