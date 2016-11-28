package ru.stqa.kate.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.kate.addressbook.model.GroupData;

import java.util.List;


public class GroupCreating extends TestBase {

    @Test
    public void testGroupCreating() {

        app.getNavigationHelper().gotoGroupPage();
        List<GroupData> before =app.getGroupsHelper().getGroupList();
        app.getGroupsHelper().CreateGroup(new GroupData("Test1", null, "Test2"));
        List<GroupData> after = app.getGroupsHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() +1);
    }

}
