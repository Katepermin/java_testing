package ru.stqa.kate.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Katya on 11/13/2016.
 */
public class NavigationHelper extends HelperBase{


  public NavigationHelper(FirefoxDriver wd) {

    super(wd);
  }

  public void gotoGroupPage() {

    click(By.linkText("groups"));
  }


  public void gotoAddNewPage() {
    click(By.linkText("add new"));
  }

  public void gotoHomePage() {
    click(By.xpath(".//*[@id='nav']/ul/li[1]/a"));
  }

  public void selectEditContact() {
    click(By.xpath(".//*[@id='maintable']/tbody/tr[3]/td[8]/a/img"));
  }
}
