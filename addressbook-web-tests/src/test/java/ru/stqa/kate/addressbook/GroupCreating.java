package ru.stqa.kate.addressbook;


import org.testng.annotations.Test;


public class GroupCreating extends TestBase{

    @Test
    public void testGroupCreating() {

        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("Test1", "Test2", "Test2"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
