package ru.stqa.kate.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.kate.addressbook.model.ContactData;

/**
 * Created by Katya on 11/14/2016.
 */
public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnToContacts() {
   click(By.linkText("home page"));
  }

  public void submitContactForm() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"),contactData.getFirstName());
    type(By.name("lastname"),contactData.getLastname());
    type(By.name("nickname"),contactData.getNick());
    type(By.name("company"),contactData.getWork());
    type(By.name("home"),contactData.getPhoneHome());
    type(By.name("mobile"),contactData.getPhoneCell());
    type(By.name("email"),contactData.getEmail());
  }

  public void initContactCreation() {
    click(By.name("firstname"));
  }


}
