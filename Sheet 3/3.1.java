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
        int arr[] = new int[] {1,2,3,4,5,6};
        double avg = 0;
        for (int i =0;i<arr.length;i++){
            avg +=arr[i];
        }
        avg /= arr.length;
        System.out.println(avg);
        
    }
}
