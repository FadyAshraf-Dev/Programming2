package org.example.finals;

import java.util.Date;
import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
    }
}


class Circle {
    private double radius = 1.0;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color = "red";

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }


    public Circle() {

    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";

    }

}


class Cylinder extends Circle{
    private double height =1.0;

    public Cylinder(double radius, double height,String color) {
        super(radius, color);
        this.height = height;

    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return 2*Math.PI *getRadius()*height;
    }
}