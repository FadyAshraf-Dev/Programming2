/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.programming;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

/**
 *
 * @author DESKTOP
 */
public class Programming {

    public static void main(String[] args) {
        float grades[] = new float[10];
        Scanner input = new Scanner(System.in);
        for (int i=0;i<grades.length;i++){
            grades[i] = input.nextFloat();
        }
        Arrays.sort(grades);
        for (int i =0;i<grades.length;i++){
            System.out.print(grades[i] +" ");
        }
        
    }

}
