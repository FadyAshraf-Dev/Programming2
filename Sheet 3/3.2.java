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
        double lg = arr[0];
        for (int i =1;i<arr.length;i++){
            if (arr[i] > lg){
                lg=arr[i];
            }
        }
        System.out.println(lg);
        
    }
}
