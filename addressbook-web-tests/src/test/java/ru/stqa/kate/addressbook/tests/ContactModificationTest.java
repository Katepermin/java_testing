package ru.stqa.kate.addressbook.tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.kate.addressbook.appmanager.ContactHelper;
import ru.stqa.kate.addressbook.model.ContactData;

/**
 * Created by Katya on 11/18/2016.
 */
public class ContactModificationTest extends TestBase{
  @Test

  public void testContactModification(){

    app.getNavigationHelper().gotoHomePage();
    int before = app.getContactHelper().getContactCount();
    if (!app.getContactHelper().isThereAContact()){
      app.getNavigationHelper().gotoAddNewPage();
      app.getContactHelper().createContact(new ContactData("Adam", "Smith", "Ady", "Apple", "+16190000000", "+16191111111", "adam@gmail.com", "Kate"), true);
    }
   // app.getNavigationHelper().gotoHomePage();
    app.getNavigationHelper().selectEditContact(before-1);
    app.getContactHelper().fillContactForm(new ContactData("Contact12","Test","T", "YYY","UUU","789","567", "hh"), false);
    app.getContactHelper().updateContactModification();
    app.getNavigationHelper().gotoHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before);
  }

  }

