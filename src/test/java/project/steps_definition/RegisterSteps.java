package project.steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project.pages.Register;

public class RegisterSteps {
    Register register = new Register();
    @Given("User open Cermati Register Page")
    public void userOpenCermatiRegisterPage() {
        register.openPage();
    }

    @When("User input new email {string} on email text field")
    public void userInputNewEmailOnEmailTextField(String email) {
        register.inputEmail(email);
    }

    @And("User input new password {string} on new password text field")
    public void userInputNewPasswordOnNewPasswordTextField(String password) {
        register.inputPassword(password);
    }

    @And("User input confirmation password {string} on confirmation password text field")
    public void userInputConfirmationPasswordOnConfirmationPasswordTextField(String password) {
        register.inputConfirmPassword(password);
    }

    @And("User input first name {string} on first name text field")
    public void userInputFirstNameOnFirstNameTextField(String name) {
        register.inputFirstName(name);
    }

    @And("User input last name {string} on last text field")
    public void userInputLastNameOnLastTextField(String name) {
        register.inputLastName(name);
    }

    @And("User input phone number {string} on phone number field")
    public void userInputPhoneNumberOnPhoneNumberField(String phone) {
        register.inputPhoneNumber(phone);
    }

    @And("User input residence city {string} on residence city field")
    public void userInputResidenceCityOnResidenceCityField(String city) {
        register.inputResidenceCity(city);
    }

    @And("User click Register button")
    public void userClickRegisterButton() {
        register.clickRegister();
    }

    @Then("User register complete and directed to account page")
    public void userRegisterCompleteAndDirectedToAccountPage() {
        boolean actual = register.isSuccess();
        Assert.assertTrue(actual);
    }
}
