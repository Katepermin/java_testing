package ru.stqa.kate.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.kate.addressbook.model.ContactData;
import ru.stqa.kate.addressbook.model.GroupData;

import java.util.List;

/**
 * Created by Katya on 11/18/2016.
 */
public class ContactDeletionTest extends TestBase {
  @Test

  public void testContactDeletion(){

     app.getNavigationHelper().gotoHomePage();
    if (!app.getContactHelper().isThereAContact()){
      app.getNavigationHelper().gotoAddNewPage();
      app.getContactHelper().createContact(new ContactData("Adam", "Smith", "Ady", "Apple", "+16190000000", "+16191111111", "adam@gmail.com", "Kate"), true);
    }
    List<ContactData> before=app.getContactHelper().getContactList();
    app.getContactHelper().selectContact(before.size()-1);
    app.getContactHelper().deleteContact();
    app.getContactHelper().acceptAlert();
    app.getNavigationHelper().gotoHomePage();
    List<ContactData> after=app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() -1);

    before.remove(before.size()-1);
    Assert.assertEquals(before, after);
  }
}
