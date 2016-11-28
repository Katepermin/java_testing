package ru.stqa.kate.addressbook.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.kate.addressbook.model.ContactData;

import java.util.List;

public class ContactCreating extends TestBase{

  @Test
    public void testContactCreating() {
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getNavigationHelper().gotoAddNewPage();
    app.getContactHelper().createContact(new ContactData("Adam", "Smith", "Ady", "A", "+16190000000", "+16191111111", "adam@gmail.com", "Kate"), true);
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size()+1);
  }


}
    

