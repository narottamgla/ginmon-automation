/**
 * 
 */
package com.ui.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;


import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


import com.ui.pages.HomePage;

import net.thucydides.core.annotations.Step;

/**
 * 
 * @version $Id$
 */
public class HomePageActions
{

   HomePage homePage;

   /**
    * 
    */
   @Step
   public void openHomePageurl()
   {
      homePage.open();

   }

   /**
    * 
    */
   @Step
   public void verifyHomePageTitle(String title)
   {
      assertThat("Verify home page title:", homePage.getHomePageTitle(), equalTo(title));

   }

   /**
    * 
    */
   @Step
   public void verifyHomePageHeader(String header)
   {
      assertThat("Verify home page header:", homePage.getHomePageHeader(), equalTo(header));

   }

   /**
    * @param language
    */
   @Step
   public void selectStateByName(String name)
   {
      homePage.selectLanguageByName(name);

   }

   /**
    * 
    */
   @Step
   public void clickLanuageDropdown()
   {
      homePage.clickHomePageLanguageDropDown();
      
   }

   /**
    * @param langauges
    */
   public void verifyLanguageOptions(List<String> langauges)
   {
      assertThat("Verify home page header:", homePage.getLanguageList(), equalTo(langauges));      
   }
}
