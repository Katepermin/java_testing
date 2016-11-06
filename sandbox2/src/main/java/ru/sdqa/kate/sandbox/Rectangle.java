package ru.sdqa.kate.sandbox;

/**
 * Created by Katya on 11/5/2016.
 */
public class Rectangle {
  public double a;
  public double b;

  public Rectangle(double a, double b){
    this.a=a;
    this.b=b;
  }
  public static double area(){
    return this.a*this.b;
  }
}