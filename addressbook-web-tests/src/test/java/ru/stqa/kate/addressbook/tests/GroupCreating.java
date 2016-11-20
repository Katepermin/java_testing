package ru.stqa.kate.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.kate.addressbook.model.GroupData;


public class GroupCreating extends TestBase {

    @Test
    public void testGroupCreating() {

        app.getNavigationHelper().gotoGroupPage();
        app.getGroupsHelper().initGroupCreation();
        app.getGroupsHelper().fillGroupForm(new GroupData("Test1", null, "Test2"));
        app.getGroupsHelper().submitGroupCreation();
        app.getGroupsHelper().returnToGroupPage();
    }

}
