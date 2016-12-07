package ru.stqa.kate.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.kate.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Katya on 11/14/2016.
 */
public class ContactHelper extends HelperBase {

  private boolean creation;

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToContacts() {
   click(By.linkText("home page"));
  }

  public void submitContactForm() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getFirstName());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("nickname"), contactData.getNick());
    type(By.name("company"), contactData.getWork());
    type(By.name("home"), contactData.getPhoneHome());
    type(By.name("mobile"), contactData.getPhoneCell());
    type(By.name("email"), contactData.getEmail());

    if (creation){
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    }else{
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }

  }

  public void initContactCreation() {
    click(By.name("firstname"));
  }


  public void updateContactModification() {
    click(By.name("update"));
  }


  public void selectContact(int index) {

    wd.findElements(By.name("selected[]")).get(index).click();
  }
  public void initContactModification(int index) {
   wd.findElements(By.cssSelector("img[title=Edit]")).get(index).click();

  }

  public void deleteContact() {
    click(By.xpath(".//*[@id='content']/form[2]/div[2]/input"));
  }

  public void acceptAlert() {
    wd.switchTo().alert().accept();
  }

  public void createContact(ContactData contact, boolean creation) {

    initContactCreation();
    fillContactForm(contact, true);
    submitContactForm();
    returnToContacts();

  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }

  public List<ContactData> getContactList() {
    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> elements = wd.findElements(By.cssSelector("tr[name*=tr]"));
    for( WebElement element : elements){
      String name = element.getText();
      String id = element.findElement(By.tagName("input")).getAttribute("value");
      ContactData contact = new ContactData(id, name, null, null, null, null,null,null,null);
   contacts.add(contact);
    }return contacts;

  }
}

