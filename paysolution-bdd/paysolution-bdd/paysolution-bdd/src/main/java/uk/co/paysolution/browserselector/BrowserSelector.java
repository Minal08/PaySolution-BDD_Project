package uk.co.paysolution.browserselector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import uk.co.paysolution.basepage.BasePage;

public class BrowserSelector extends BasePage {


    private static final Logger log = LogManager.getLogger(BrowserSelector.class.getName());

    public void selectBrowser(String browser) {
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                log.info("Launching Chrome Browser");
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                log.info("Launching Firefox Browser");
                break;
            default:
                System.out.println("Unexpected value: " + browser);
                log.info("Incorrect Browser Selected");
        }

    }
}
