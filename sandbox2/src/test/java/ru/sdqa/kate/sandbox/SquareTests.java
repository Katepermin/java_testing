package ru.sdqa.kate.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Katya on 11/8/2016.
 */
public class SquareTests {
  @Test
  public void testArea(){

    Square s = new Square(5);
    Assert.assertEquals(s.area(),25.0);
  }
}
