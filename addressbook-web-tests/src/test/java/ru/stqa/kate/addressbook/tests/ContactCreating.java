package ru.stqa.kate.addressbook.tests;

import org.testng.annotations.Test;

import ru.stqa.kate.addressbook.model.ContactData;

public class ContactCreating extends TestBase{

  @Test
    public void testContactCreating() {

    app.getContactHelper().gotoAddNewPage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Adam", "Smith", "Ady", "Apple", "+16190000000", "+16191111111", "adam@gmail.com"));
    app.getContactHelper().submitContactForm();
    app.getContactHelper().returnToContacts();
  }


}
    

