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


    System.out.println("Дистанция между точками p1 и p2 = " +k.distance(l));
  }


  }


