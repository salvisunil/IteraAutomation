package StepDefination;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

public class FeatureStep {
    @Steps
    SignUpPage viewSignUp;
    @Given("I am on Home page")
    public void homePage() {
        viewSignUp.open();
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Home is oped");
    }
    @Then("I click on Signup page")
    public void ClickSignUpPage() {
        viewSignUp.clickSignUp();
    }
    @When("I fill in the Registration page")
    public void fillInRegistrationPage() {
        viewSignUp.fillInRegistration();
    }
    @When("I submit the form")
    public void submitForm() {
        viewSignUp.submitClick();
    }
    @Then("I should see a success message")
    public void verifySuccessMessage() {
        viewSignUp.SuccessMessage();
    }

}
