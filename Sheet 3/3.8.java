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
        double[][] matrix = new double[][]{
            {1, 2, 3, 4},
            {5, 6, 12, 8},
            {9, 10, 11, 7}
        };
        System.out.println(locateLargest(matrix)[0] + " " + locateLargest(matrix)[1]);
    }    public static int[] locateLargest(double matrix[][]) {
        int lgX=0,lgY=0;
        double max = matrix[0][0];
        for (int i =0;i<matrix.length;i++){
            for (int j =1;j<matrix[0].length;j++){
                if (matrix[i][j]>max){
                    lgX = i;
                    lgY=j;
                    max= matrix[i][j];
                }
            }
        }
        return new int[]{lgX,lgY};
    }

}
