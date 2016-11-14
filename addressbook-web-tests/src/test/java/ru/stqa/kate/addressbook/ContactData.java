package ru.stqa.kate.addressbook;

public class ContactData {
  private final String firstName;
  private final String lastname;
  private final String nick;
  private final String work;
  private final String phoneHome;
  private final String phoneCell;
  private final String email;

  public ContactData(String firstName, String lastname, String nick, String work, String phoneHome, String phoneCell, String email) {
    this.firstName = firstName;
    this.lastname = lastname;
    this.nick = nick;
    this.work = work;
    this.phoneHome = phoneHome;
    this.phoneCell = phoneCell;
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNick() {
    return nick;
  }

  public String getWork() {
    return work;
  }

  public String getPhoneHome() {
    return phoneHome;
  }

  public String getPhoneCell() {
    return phoneCell;
  }

  public String getEmail() {
    return email;
  }
}
