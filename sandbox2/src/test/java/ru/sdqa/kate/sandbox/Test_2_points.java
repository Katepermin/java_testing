package ru.sdqa.kate.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

/**
 * Created by Katya on 11/8/2016.
 */
public class Test_2_points {
  @Test
  public void testPoints(){

    Point p = new Point(0,0);
    Point k = new Point(3,4);

    System.out.println(p.distance(k));
         Assert.assertEquals(p.distance(k),5.0);

  // Assert.assertEquals(s.distance(p));
  }
}