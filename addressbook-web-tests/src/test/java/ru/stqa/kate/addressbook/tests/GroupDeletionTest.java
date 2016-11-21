package ru.stqa.kate.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.kate.addressbook.model.GroupData;

public class GroupDeletionTest extends TestBase {
    
    @Test
    public void testGroupDeletion() {
      app.getNavigationHelper().gotoGroupPage();
      if(!app.getGroupsHelper().isThereAGroup()){
        app.getGroupsHelper().CreateGroup(new GroupData("Test1", null, "Test2"));
      }
      app.getGroupsHelper().selectGroup();
      app.getGroupsHelper().deleteselectedGroup();
      app.getGroupsHelper().returnToGroupPage();
    }

}
