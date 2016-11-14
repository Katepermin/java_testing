package ru.stqa.kate.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.kate.addressbook.appmanager.ApplicationManager;

/**
 * Created by Katya on 11/13/2016.
 */
public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
