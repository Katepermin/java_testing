package ru.stqa.kate.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.kate.addressbook.model.GroupData;

/**
 * Created by Katya on 11/18/2016.
 */
public class GroupModificationTests extends TestBase{
  @Test

  public void testGroupModification(){


    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupsHelper().getGroupCount();
    if(!app.getGroupsHelper().isThereAGroup()){
      app.getGroupsHelper().CreateGroup(new GroupData("Test1", null, "Test2"));
    }
    app.getGroupsHelper().selectGroup(before-1);
    app.getGroupsHelper().initGroupModification();
    app.getGroupsHelper().fillGroupForm(new GroupData("Kate", null, "Fish"));
    app.getGroupsHelper().submitGroupModification();
    app.getGroupsHelper().returnToGroupPage();
    int after = app.getGroupsHelper().getGroupCount();
    Assert.assertEquals(after, before);
  }
}
