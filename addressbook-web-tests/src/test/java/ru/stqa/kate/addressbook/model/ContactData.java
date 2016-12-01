package ru.stqa.kate.addressbook.model;

public class ContactData {
  private final String id;
  private final String firstName;
  private final String lastname;
  private final String nick;
  private final String work;
  private final String phoneHome;
  private final String phoneCell;
  private final String email;
  private String group;

  private boolean creation;


  public ContactData(String id, String firstName, String lastname, String nick, String work, String phoneHome, String phoneCell, String email, String group) {
    this.firstName = firstName;
    this.lastname = lastname;
    this.nick = nick;
    this.work = work;
    this.phoneHome = phoneHome;
    this.phoneCell = phoneCell;
    this.email = email;
    this.group = group;
    this.creation = creation;
    this.id = id;

  }
  public ContactData(String firstName, String lastname, String nick, String work, String phoneHome, String phoneCell, String email, String group) {
    this.firstName = firstName;
    this.lastname = lastname;
    this.nick = nick;
    this.work = work;
    this.phoneHome = phoneHome;
    this.phoneCell = phoneCell;
    this.email = email;
    this.group = group;
    this.creation = creation;
    this.id = null;

  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id='" + id + '\'' +
            ", firstName='" + firstName + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    return firstName != null ? firstName.equals(that.firstName) : that.firstName == null;

  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
    return result;
  }

  public String getId() {
    return id;
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

  public String getGroup() {
    return group;
  }
}
