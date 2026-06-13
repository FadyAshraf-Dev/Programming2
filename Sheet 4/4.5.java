package org.example.finals;

import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan2.setSpeed(fan1.MEDIUM);
        fan1.setRadius(10);
        fan2.setRadius(5);
        fan1.setColor("yellow");
        fan2.setColor("blue");
        fan1.setOn(true);
        fan2.setOn(false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
class Fan{
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed = SLOW;
    private double radius=5;
    private boolean isOn=false;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        String description;
        if (isOn){
            description="speed = " +speed  + ", color = " + color + ", radius = " + radius;
        }
        else{
            description= "color = " + color + ", radius = " + radius + "\nthe fan is off";
        }

        return description;
    }
}