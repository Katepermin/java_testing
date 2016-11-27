package ru.stqa.kate.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.kate.addressbook.model.ContactData;
import ru.stqa.kate.addressbook.model.GroupData;

/**
 * Created by Katya on 11/18/2016.
 */
public class ContactDeletionTest extends TestBase {
  @Test

  public void testContactDeletion(){

     app.getNavigationHelper().gotoHomePage();
    int before = app.getContactHelper().getContactCount();
    if (!app.getContactHelper().isThereAContact()){
      app.getNavigationHelper().gotoAddNewPage();
      app.getContactHelper().createContact(new ContactData("Adam", "Smith", "Ady", "Apple", "+16190000000", "+16191111111", "adam@gmail.com", "Kate"), true);
    }
    app.getContactHelper().selectContact(before-1);
    app.getContactHelper().deleteContact();
    app.getContactHelper().acceptAlert();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before -1);
  }
}
