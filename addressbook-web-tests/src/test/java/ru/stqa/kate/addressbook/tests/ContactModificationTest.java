package ru.stqa.kate.addressbook.tests;

import org.openqa.selenium.firefox.FirefoxDriver;
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
    app.getNavigationHelper().selectEditContact();
    app.getContactHelper().fillContactForm(new ContactData("Contact","Test","T", "YYY","UUU","789","567"));
    app.getContactHelper().updateContactModification();
    app.getNavigationHelper().gotoHomePage();
  }

  }

