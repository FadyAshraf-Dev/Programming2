package org.example.finals;

public class Launcher {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,40);
        Rectangle r2 = new Rectangle(3.5,35.9);
        System.out.println(r1.getWidth());
        System.out.println(r1.getHeight());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r2.getWidth());
        System.out.println(r2.getHeight());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());

    }
}
class Rectangle {
    private double width=1;
    private double height=1;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    Rectangle(){

    }
    Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }
    double getArea(){
        return width*height;
    }
    double getPerimeter(){
        return (width+height)*2;
    }
}