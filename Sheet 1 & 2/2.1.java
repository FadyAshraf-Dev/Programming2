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
        getFoot();
    }
    public static double footToMeters(double foot, double inches){
        double foots = foot +  inches/12;
        double meters = .3048 *foots;
        return meters;
    }
    public static void getFoot(){
        Scanner input = new Scanner(System.in);
        double foot,inches;
        System.out.print("Please enter the foot[0 for exiting]: ");
        foot= input.nextInt();
        System.out.print("Please enter the inches[0 for exiting]: ");
        inches= input.nextInt();
        double meters = Programming.footToMeters(foot, inches);
        int meter = (int)meters;
        double centimeter =Math.round((meters-(int)meters)*100);
        System.out.println("Meters: " + meter);
        System.out.println("CentiMeters: " + centimeter);
        
        
        
        

    }
}
