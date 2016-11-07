package ru.sdqa.kate.sandbox;

/**
 * Created by Katya on 11/6/2016.
 */
public class Engine {

  public static void main(String[] args) {

    Point k = new Point(8,5);
    Point l = new Point (4,10);

    System.out.println("p1 = " + k.x + ", " + k.y);

    System.out.println("p2 = " + l.x + ", " + l.y);


    System.out.println("Дистанция между точками p1 и p2 = " +distance(k,l));
  }
  public static double distance(Point p1, Point p2) {

    double dx = p2.x-p1.x;
    double dy = p2.y-p1.y;
    return Math.sqrt(dx*dx + dy*dy);

  }

}
