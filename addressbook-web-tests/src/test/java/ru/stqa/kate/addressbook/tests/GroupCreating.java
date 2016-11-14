package ru.stqa.kate.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.kate.addressbook.model.GroupData;


public class GroupCreating extends TestBase {

    @Test
    public void testGroupCreating() {

        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("Test1", "Test2", "Test2"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
