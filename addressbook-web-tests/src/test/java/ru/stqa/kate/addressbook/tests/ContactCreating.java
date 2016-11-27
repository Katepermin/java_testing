package ru.stqa.kate.addressbook.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.kate.addressbook.model.ContactData;

public class ContactCreating extends TestBase{

  @Test
    public void testContactCreating() {
    int before = app.getContactHelper().getContactCount();
    app.getNavigationHelper().gotoAddNewPage();
    app.getContactHelper().createContact(new ContactData("Adam", "Smith", "Ady", "A", "+16190000000", "+16191111111", "adam@gmail.com", "Kate"), true);
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before+1);
  }


}
    

