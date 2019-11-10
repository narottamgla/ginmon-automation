/**
 * 
 */
package com.ui.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ui.utils.CommonUtils;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

/**
 * 
 * @version $Id$
 */
public class HomePage extends PageObject
{

   @FindBy(css = ".gm-login__top h1")
   private WebElement homePageHeader;

   @FindBy(css = "a.gm-selector__current")
   private WebElement langaugeDropdown;

   @FindBy(css = ".gm-selector__list li a")
   private List<WebElement> langaugeDropdownOptions;

   public String getHomePageTitle()
   {
      return getDriver().getTitle();
   }

   public String getHomePageHeader()
   {
      CommonUtils.waitForElementToBeVisible(getDriver(), homePageHeader);
      return homePageHeader.getText();
   }

   public List<String> getLanguageList()
   {
      return CommonUtils.getElementOptionsAsList(langaugeDropdownOptions);

   }

   public void selectLanguageByName(String name)
   {

      CommonUtils.selectOptionByFullText(langaugeDropdownOptions, name);

   }

   /**
    * 
    */
   public void clickHomePageLanguageDropDown()
   {
      langaugeDropdown.click();

   }
}
