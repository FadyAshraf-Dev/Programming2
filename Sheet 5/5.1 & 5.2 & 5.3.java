

package org.example.finals;
import java.util.Date;
import java.util.Scanner;
import java.util.Arrays;




public class Launcher {

    public static void main(String[] args) {
    }
}

abstract class Simple2DShape{
    private String color;
    private Date dateCreated;
    private boolean filled;
    Simple2DShape(String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "this is a simple 2d shape";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract public double getArea();
    abstract public double getPerimeter();
}


class Circle extends Simple2DShape{
    private double radius=1.0;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius* radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public Circle() {
        super("blue");

    }

    @Override
    public String toString() {
        return "this is a simple circle";

    }

}
class Rectangle extends Simple2DShape{
    private double width=1.0;
    private double height=1.0;

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return (width+height) *2;
    }

    @Override
    public String toString() {
        return "this is a simple rectangle";
    }

    public Rectangle(double width, double height) {
        super("blue");
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}