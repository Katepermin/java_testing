package ru.stqa.kate.addressbook.tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.kate.addressbook.appmanager.ContactHelper;
import ru.stqa.kate.addressbook.model.ContactData;

import java.util.HashSet;
import java.util.List;

/**
 * Created by Katya on 11/18/2016.
 */
public class ContactModificationTest extends TestBase{
  @Test

  public void testContactModification() {

    app.getNavigationHelper().gotoHomePage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoAddNewPage();
      app.getContactHelper().createContact(new ContactData("Adam", "Smith", "Ady", "Apple", "+16190000000", "+16191111111", "adam@gmail.com", "Kate"), true);
    }
    // app.getNavigationHelper().gotoHomePage();
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectContact(before.size() - 1);
    app.getContactHelper().initContactModification();
    ContactData contact = new ContactData(before.get(before.size() - 1).getId(), "Contact12", "Test", "T", "YYY", "UUU", "789", "567", "hh");
    app.getContactHelper().fillContactForm(contact, false);
    app.getContactHelper().updateContactModification();
    app.getNavigationHelper().gotoHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());

    before.remove(before.size() - 1);
    before.add(contact);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
  }

  }

