/**
 * 
 */
package com.ui.steps;

import java.util.List;

import com.ui.actions.HomePageActions;
import com.ui.utils.CommonUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * 
 * @version $Id$
 */
public class HomePageSteps
{
   @Steps
   HomePageActions homePageActions;

   @Given("I open the Ginmon login page url")
   public void i_open_the_Ginmon_login_page_url()
   {
      homePageActions.openHomePageurl();
   }

   @Then("I should see Ginmon login page title as {string}")
   public void i_should_see_Ginmon_login_page_title_as(String title)
   { 
      CommonUtils.waitForSeconds(5);
      homePageActions.verifyHomePageTitle(title);
   }

   @Then("I should see Ginmon login page header as {string}")
   public void i_should_see_Ginmon_login_page_header_as(String header)
   {
      homePageActions.verifyHomePageHeader(header);
   }
   
   
   @When("I click on langauge dropdown on home page")
   public void i_click_on_langauge_dropdown_on_home_page() {
      homePageActions.clickLanuageDropdown(); 
   }

   @Then("I should see Ginmon site lanuage options")
   public void i_should_see_Ginmon_site_lanuage_options(io.cucumber.datatable.DataTable dataTable) {
      List<String> langauges = dataTable.asList(String.class);
      homePageActions.verifyLanguageOptions(langauges); 
   }
}
