package ru.stqa.kate.addressbook.model;

public class ContactData {
  private final String firstName;
  private final String lastname;
  private final String nick;
  private final String work;
  private final String phoneHome;
  private final String phoneCell;
  private final String email;
  private String group;
  private boolean creation;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (creation != that.creation) return false;
    if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
    if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
    if (nick != null ? !nick.equals(that.nick) : that.nick != null) return false;
    if (work != null ? !work.equals(that.work) : that.work != null) return false;
    if (phoneHome != null ? !phoneHome.equals(that.phoneHome) : that.phoneHome != null) return false;
    if (phoneCell != null ? !phoneCell.equals(that.phoneCell) : that.phoneCell != null) return false;
    if (email != null ? !email.equals(that.email) : that.email != null) return false;
    return group != null ? group.equals(that.group) : that.group == null;

  }

  @Override
  public int hashCode() {
    int result = firstName != null ? firstName.hashCode() : 0;
    result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "firstName='" + firstName + '\'' +
            ", lastname='" + lastname + '\'' +
            '}';
  }

  public String getGroup() {
    return group;
  }
}
