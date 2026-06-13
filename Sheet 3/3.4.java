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
    public static double footToMeters(double foot, /*
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
        int[][] matrix1 = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] matrix2 = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for (int i=0;i<matrix1.length;i++){
            for (int j=0;j<matrix1.length;j++){
                matrix1[i][j] +=matrix2[i][j];
            }
        }
        for (int i=0;i<matrix1.length;i++){
            for (int j=0;j<matrix1.length;j++){
                System.out.printf("%-5d",matrix1[i][j]);
            }
            System.out.println();
        }
    }
}
