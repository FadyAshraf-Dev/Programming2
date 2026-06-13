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
        float grades[] = new float[10];/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import java.lang.Math;
/**
 *
 * @author DESKTOP
 */
public class Main{
    public static void main(String[] args){
        int i =2;
        for (int numberOfPrimeNumbers = 0; numberOfPrimeNumbers < 50;) {
            if (isPrime(i)){
                System.out.println(i);
                numberOfPrimeNumbers++;
            }
            i++;

        }
        System.out.println();
        int numberOfPrimeNumbers=0;
        i =2;
        while (numberOfPrimeNumbers<50){
            if (isPrime(i)){
                System.out.println(i);
                numberOfPrimeNumbers++;
            }
            i++;
        }
    }
    public static boolean isPrime(int num){
        boolean flag = true;
        if (num <2){
            System.out.println("please enter a number bigger than 1!");


        }
        if (num %2==0 && num !=2){
            flag =false;
            return flag;
        }
        for (int i=2;i<=Math.floor(Math.pow(num,.5));i++){
            if (num % i ==0){
                flag =false;
                break;
            }
        }
        return flag;

    }



}
