package stepdefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.MainPageSteps;

public class MainPageStepDef {

    @Steps
    MainPageSteps mainPageSteps;


    @Given("^I go \"https://www.work.ua/\"$")
    public void igoWorkUaSite() {
        mainPageSteps.openMainPage();
    }


    @When("^Fill search bar with position$")
    public void FillSearchBarWithPosition() {
        mainPageSteps.FillSearchBarWithPosition();
    }

    @Then("^I click on search button$")
    public void iClickOnSearchButton() {
        mainPageSteps.clickOnSearchButton();
    }

    @When("^I click on any available vacancy in the list$")
    public void iClickOnAvailableVacancy() throws Throwable {
        mainPageSteps.clickOnVacancy();
    }

    @And("^I click on call out button$")
    public void iClickOnCallOutButton() throws Throwable {
        mainPageSteps.clickOnCallOutButton();
    }

    @And("^I fill CV form with valid data$")
    public void iFillCVFormWithValidData() {
        mainPageSteps.FillData();
    }

    @And("^I click on Send button$")
    public void iClickOnSendButton() {
        mainPageSteps.ClickOnSendButton();
    }

    @Then("^CV sent to employer$")
    public void CVSentToEmployer() {
    }
}
