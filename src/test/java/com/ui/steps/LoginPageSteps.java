/**
 * 
 */
package com.ui.steps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ui.actions.HomePageActions;
import com.ui.actions.LoginPageActions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * 
 * @version $Id$
 */
public class LoginPageSteps
{
   @Steps
   LoginPageActions loginPageActions;

   @When("I enter user name as {string} and password as {string}")
   public void i_enter_user_name_as_and_password_as(String username, String password) {
      loginPageActions.enterLoginDetails(username, password);
   }

   @When("I click login button")
   public void i_click_login_button() {
      loginPageActions.clickLoginButton();
   }

   @Then("I should see EmailVerification page")
   public void i_should_see_EmailVerification_page() {
      loginPageActions.verifyIsEmailVerificationPageDisplayed();
   }

   
}
