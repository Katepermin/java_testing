package ru.stqa.kate.addressbook.tests;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.kate.addressbook.appmanager.ApplicationManager;


/**
 * Created by Katya on 11/13/2016.
 */
public class TestBase {
FirefoxDriver wd;
  public ApplicationManager app;

  @BeforeMethod
  public void setUp() throws Exception {
    app = new ApplicationManager();
    app.init();
  }

  @AfterMethod
  public void tearDown() {


    app.stop();
  }
  public ApplicationManager getApp() {

    return app;
  }

}
