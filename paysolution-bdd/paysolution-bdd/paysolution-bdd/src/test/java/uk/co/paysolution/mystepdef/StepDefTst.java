package uk.co.paysolution.mystepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.paysolution.pages.LoginPage;


public class StepDefTst {

    LoginPage loginPage = new LoginPage();

    @Given("^User is on Login Page$")
    public void userIsOnLoginPage(){
    }
    @When("^User click on Its ok message$")
    public void userClickOnItsOkMessage() {
        loginPage.clickOnOkGotIt();
    }

    @And("^User click on Sign up tab$")
    public void userClickOnSignUpTab() {
        loginPage.clickOnSignUp();
    }
    @And("^User enter FirstName \"([^\"]*)\"$")
    public void userEnterFirstName(String FirstName) {
        loginPage.enterFirstName(FirstName);
    }

    @And("^User enter LastName \"([^\"]*)\"$")
    public void userEnterLastName(String SurName) {
        loginPage.enterSurname(SurName);
    }

    @And("^User enter UserName \"([^\"]*)\"$")
    public void userEnterUserName(String UserName) {
        loginPage.enterUserName(UserName);
    }

    @And("^User enter Password \"([^\"]*)\"$")
    public void userEnterPassword(String password){
      loginPage.enterPassword(password);
    }

    @And("^User click on Create an account tab$")
    public void userClickOnCreateAnAccountTab() {
        loginPage.clickAccountCreate();
    }
    @Then("^User successfully entered Sign up page$")
    public void userSuccessfullyEnteredSignUpPage() {
        loginPage.validateSuccessAccountCreate();
    }


}
