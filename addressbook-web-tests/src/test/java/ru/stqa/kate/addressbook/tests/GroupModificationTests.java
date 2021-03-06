package ru.stqa.kate.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.kate.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

/**
 * Created by Katya on 11/18/2016.
 */
public class GroupModificationTests extends TestBase{
  @Test

  public void testGroupModification(){


    app.getNavigationHelper().gotoGroupPage();
    if(!app.getGroupsHelper().isThereAGroup()){
      app.getGroupsHelper().CreateGroup(new GroupData("Test1", null, "Test2"));
    }
    List<GroupData> before = app.getGroupsHelper().getGroupList();
    app.getGroupsHelper().selectGroup(before.size()-1);
    app.getGroupsHelper().initGroupModification();
    GroupData group = new GroupData(before.get(before.size()-1).getId(),"Kate", null, "Fish");

    app.getGroupsHelper().fillGroupForm(group);
    app.getGroupsHelper().submitGroupModification();
    app.getGroupsHelper().returnToGroupPage();
    List<GroupData> after = app.getGroupsHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size());

    before.remove(before.size()-1);
    before.add(group);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
  }
}
