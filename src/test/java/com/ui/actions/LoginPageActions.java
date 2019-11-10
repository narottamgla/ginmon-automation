/**
 * 
 */
package com.ui.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.ui.pages.LoginPage;

import net.thucydides.core.annotations.Step;

/**
 * 
 * @version $Id$
 */
public class LoginPageActions
{
   LoginPage loginPage;
   /**
    * @param username
    * @param password
    */
   @Step
   public void enterLoginDetails(String username, String password)
   {
      loginPage.enterUserName(username);
      loginPage.enterPassword(password);

   }
   
   @Step
   public void clickLoginButton()
   {
      loginPage.clickLoginButton();

   }

   /**
    * 
    */
   public void verifyIsEmailVerificationPageDisplayed()
   {
      assertThat("Verify home page title:", loginPage.getEmailVerificationSectionHeader(), equalTo("Please verify your email first."));

   }

}
