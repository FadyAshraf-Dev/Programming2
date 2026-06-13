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
        System.out.println(fibonacci(5));
    }
    public static int fibonacci(int num){
        int result;
        if (num <1){
            System.out.println("please enter a number larger than 0");
            return 0;
        }
        if (num ==1){
            result = 1;
            return result;
        }
        if (num ==2){
            result = 1;
            return result;
        }
        result = fibonacci(num-1) + fibonacci(num-2);
        return result;
    }
}
