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
//        int array[] = new int[]{1,2,3};
//        System.out.println("before invoking:");
//        printArray(array);
//        swap(array);
//        System.out.println("after invoking:");
//        printArray(array);
        int x=5,y=2;
        System.out.println("before: x = " +x +", y = " + y);
        swap(x,y);
        System.out.println("before: x = " +x +", y = " + y);

    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" +i + "]  = " + array[i]);
        }
    }

    public static void swap(int x,int y){
        int temp = x;
        x =y;
        y=temp;
        System.out.println("inside: x = " +x +", y = " + y);
    }
    public static void swap(int array[]){
        int firstElement = array[0];
        for (int i = 1; i < array.length; i++) {
         array[i-1]=array[i];

        }
        array[array.length-1] = firstElement;
        printArray(array);
    }




}
