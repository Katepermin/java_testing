package ru.stqa.kate.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.kate.addressbook.model.GroupData;

public class GroupDeletionTest extends TestBase {
    
    @Test
    public void testGroupDeletion() {
      app.getNavigationHelper().gotoGroupPage();
      int before = app.getGroupsHelper().getGroupCount();
      if(!app.getGroupsHelper().isThereAGroup()){
        app.getGroupsHelper().CreateGroup(new GroupData("Test1", null, "Test2"));
      }
      app.getGroupsHelper().selectGroup(before-1);
      app.getGroupsHelper().deleteselectedGroup();
      app.getGroupsHelper().returnToGroupPage();
      int after = app.getGroupsHelper().getGroupCount();
      Assert.assertEquals(after, before-1);
    }

}
