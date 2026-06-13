/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author DESKTOP
 */
public class Main{
    public static void main(String[] args){
        int array[] = new int[]{1,2,3,4};
        add(array,2);
    }
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" +i + "]  = " + array[i]);
        }
    }

    public static void add(int[] array,int addingOperand){
        System.out.println("before:");
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            array[i]+=addingOperand;
        }
        System.out.println("after");
        printArray(array);
    }




}
