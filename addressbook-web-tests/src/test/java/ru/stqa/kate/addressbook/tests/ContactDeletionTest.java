package ru.stqa.kate.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Katya on 11/18/2016.
 */
public class ContactDeletionTest extends TestBase {
  @Test

  public void testContactDeletion(){

    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();
    app.getContactHelper().acceptAlert();

    //app.getNavigationHelper().gotoHomePage();
  }
}
