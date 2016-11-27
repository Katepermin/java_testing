package ru.stqa.kate.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.kate.addressbook.model.GroupData;


public class GroupCreating extends TestBase {

    @Test
    public void testGroupCreating() {

        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupsHelper().getGroupCount();
        app.getGroupsHelper().CreateGroup(new GroupData("Test1", null, "Test2"));
        int after = app.getGroupsHelper().getGroupCount();
        Assert.assertEquals(after, before +1);
    }

}
