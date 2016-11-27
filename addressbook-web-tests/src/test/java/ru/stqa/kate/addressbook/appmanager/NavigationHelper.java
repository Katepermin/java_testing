package ru.stqa.kate.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Katya on 11/13/2016.
 */
public class NavigationHelper extends HelperBase{


  public NavigationHelper(WebDriver wd) {

    super(wd);
  }

  public void gotoGroupPage() {
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.name("new"))){
     return;
    }

    click(By.linkText("groups"));
  }


  public void gotoAddNewPage() {
    click(By.linkText("add new"));
  }

  public void gotoHomePage() {
    if (isElementPresent(By.id("maintable"))){
      return;
    }
    click(By.xpath(".//*[@id='nav']/ul/li[1]/a"));
  }

  public void selectEditContact(int index) {

    wd.findElements(By.xpath(".//*[@id='maintable']/tbody/tr[2]/td[8]/a/img")).get(index).click();
  }
}
