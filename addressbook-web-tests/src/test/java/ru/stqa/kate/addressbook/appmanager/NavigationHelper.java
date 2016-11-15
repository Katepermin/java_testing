package ru.stqa.kate.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Katya on 11/13/2016.
 */
public class NavigationHelper extends HelperBase{

  private FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
     click(By.linkText("groups"));
  }

  public void gotoAddNewPage() {
    wd.findElement(By.linkText("add new")).click();
  }
}
