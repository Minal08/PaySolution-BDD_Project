package uk.co.paysolution.pages;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.paysolution.util.Utility;

import java.util.Random;
import java.util.stream.Stream;

import static org.openqa.selenium.By.xpath;

public class LoginPage extends Utility {


    @FindBy(id = "agree")
    WebElement _acceptOkGotIt;

    @FindBy(id = "create-account-btn")
    WebElement _createAccountBtn;

    @FindBy(id = "firstname-i")
    WebElement _enterFirstName;

    @FindBy(id = "surname-i")
    WebElement _enterSurName;

    @FindBy(id = "username-i")
    WebElement _enterUserName;

    @FindBy(id = "password-i")
    WebElement _enterPassWord;

    @FindBy(id = "password-i")
    WebElement _createPassword;

    @FindBy(id = "new-user")
    WebElement _newUser;

    @FindBy(className = "card-title")
    WebElement validation_str;


    public void clickOnOkGotIt() {
        clickOnElement(_acceptOkGotIt);
    }

    public void clickOnSignUp() {
        clickOnElement(_createAccountBtn);
    }


    public void enterFirstName(String Name) {
        sendTextToElement(_enterFirstName, Name);
    }

    public void enterSurname(String Surname) {
        sendTextToElement(_enterSurName, Surname);

    }

    public void enterUserName(String UserName) {
        UserName = "07" + new Random().nextInt((999999999 - 1 + 1) + 1);
        if (new Utility().validateNumber(UserName)) {
            sendTextToElement(_enterUserName, UserName);
        }
    }

    public void enterPassword(String password) {
        if (new Utility().validatePassword(password)) {
            sendTextToElement(_enterPassWord, password);
        }
    }

    public void clickAccountCreate() {
        clickOnElement(_newUser);
    }

    public void validateSuccessAccountCreate() {
        By ele = By.xpath("//div[@class='card-header bgm-primary']");
        waitForVisibilityOfElements(ele,10);
        verifyTextAssertEqualsMethod(validation_str, "We've sent you a One Time Passcode");
    }
}
