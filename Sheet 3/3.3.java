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
public class Programming {

    public static void main(String[] args) {
        double[] arr = {10, 12, 23, 23, 16, 23, 21, 16};
        double avg = 0;
        for (int i =0;i<arr.length;i++){
            avg +=arr[i];
        }
        avg /= arr.length;
        double numerator=0;
        for(int i=0;i<arr.length;i++){
            numerator +=Math.pow((arr[i]-avg),2);
            
        }
        double stdDeviation = Math.sqrt(numerator/(arr.length-1));
        System.out.println(stdDeviation);
    }
}
