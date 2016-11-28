package ru.stqa.kate.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.kate.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTest extends TestBase {
    
    @Test
    public void testGroupDeletion() {
      app.getNavigationHelper().gotoGroupPage();
      if(!app.getGroupsHelper().isThereAGroup()){
        app.getGroupsHelper().CreateGroup(new GroupData("Test1", null, "Test2"));
      }
      List<GroupData> before = app.getGroupsHelper().getGroupList();
      app.getGroupsHelper().selectGroup(before.size()-1);
      app.getGroupsHelper().deleteselectedGroup();
      app.getGroupsHelper().returnToGroupPage();
      List<GroupData> after = app.getGroupsHelper().getGroupList();
      Assert.assertEquals(after.size(), before.size()-1);

      before.remove(before.size()-1);

        Assert.assertEquals(before, after);


    }

}
