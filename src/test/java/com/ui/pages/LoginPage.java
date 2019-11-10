/**
 * 
 */
package com.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ui.utils.CommonUtils;

import net.serenitybdd.core.pages.PageObject;

/**
 * 
 * @version $Id$
 */
public class LoginPage extends PageObject
{

   @FindBy(css = "input[name=\"username\"]")
   private WebElement usernameTxBx;

   @FindBy(id = "gm-password")
   private WebElement passwordTx;

   @FindBy(css = "button[name=\"login\"]")
   private WebElement loginButton;

   @FindBy(css = "h2.gm-title-2")
   private WebElement emailVerificationSectionHeader;

   /**
    * @param username
    */
   public void enterUserName(String username)
   {
      usernameTxBx.sendKeys(username);

   }

   /**
    * @param password
    */
   public void enterPassword(String password)
   {
      passwordTx.sendKeys(password);

   }

   /**
    * 
    */
   public void clickLoginButton()
   {
      loginButton.click();

   }

   public String getEmailVerificationSectionHeader()
   {
      CommonUtils.waitForElementToBeVisible(getDriver(), emailVerificationSectionHeader);
      return emailVerificationSectionHeader.getText();
   }

}
