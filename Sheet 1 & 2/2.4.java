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
        Scanner input = new Scanner(System.in);
        int num;
        boolean isPrime = true;
        System.out.println("please enter a number bigger than 2 to determine whether it's a prime number or not: ");
        num = input.nextInt();
        if (num <2){
            System.out.println("please enter a number bigger than 1!");
            
            
        }
        if (num %2==0 && num !=2){
            isPrime=false;
            return isPrime;
        }
        for (int i=2;i<=Math.floor(Math.pow(num,.5));i++){
            if (num % i ==0){
                isPrime=false;
                break;
            }
        }
        System.out.println((isPrime?"This number is prime":"This number isn't prime"));
        
    }
        
        
        

}
