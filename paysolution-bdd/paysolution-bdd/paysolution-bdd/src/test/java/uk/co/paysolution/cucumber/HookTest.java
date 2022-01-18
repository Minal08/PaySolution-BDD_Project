package uk.co.paysolution.cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.co.paysolution.basepage.BasePage;
import uk.co.paysolution.browserselector.BrowserSelector;
import uk.co.paysolution.loadproperties.LoadProperty;

import java.util.concurrent.TimeUnit;

import static uk.co.paysolution.basepage.BasePage.driver;

public class HookTest extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl =loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("chrome");
    @Before
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @After
    public void tearDown() {
        driver.quit();
    }











}
