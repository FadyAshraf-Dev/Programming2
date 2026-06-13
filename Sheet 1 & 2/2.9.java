/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programming;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author DESKTOP
 */
public class Programming{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the pentagon: ");
        double s, w, h;
        s=input.nextDouble();
        System.out.print("Enter the width of the rectangle/square: ");
        w=input.nextDouble();
        System.out.print("Enter the height of the rectangle/square: ");
        h=input.nextDouble();
        System.out.println(area(s));
        System.out.println(area(w,h));
        
        
    }
    public static double area(double side){
        double area = (5*Math.pow(side, 2))/(4*Math.tan(Math.PI/5));
        return area;
    }
    public static double area(double width, double height){
        double area = width * height;
        return area;
    }
}
