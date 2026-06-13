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
        double[][] matrix = new double[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        displayMatrix(matrix);
        for (int i=0;i<matrix[0].length;i++){
            System.out.println("the sum of colum "+i+" is " + sumColumn(matrix,i));
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double columnSum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (j == columnIndex) {
                    columnSum += m[i][j];
                }
            }
        }
        return columnSum;
    }

    public static void displayMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.printf("%-5.1f", m[i][j]);
            }
            System.out.println();
        }

    }
}
