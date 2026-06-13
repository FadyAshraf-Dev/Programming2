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
        System.out.print("Enter the side of the pentagon");
        double s;
        s=input.nextDouble();
        System.out.println(area(s));
        
        
    }
    public static double area(double side){
        double area = (5*Math.pow(side, 2))/(4*Math.tan(Math.PI/5));
        return area;
    }
}
