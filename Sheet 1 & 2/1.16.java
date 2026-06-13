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
        num=input.nextInt();
        int divisor=2;
        while (num >1){
            if(num % divisor ==0){
                System.out.print(divisor+" ");
                num/=divisor;
            }
            else{
                divisor++;
            }
        }
        
    }
}
