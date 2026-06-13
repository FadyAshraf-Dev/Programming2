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
    }
    public static int max(int a,int b,int c){
        int max;
        if (a>b && a>c){
            max=a;
        }
        else if (b>a&&b>c){
            max=b;
        }
        else{
            max=c;
        }
        return max;
    }
    public static int min(int a,int b,int c){
        int min;
        if (a<b && a<c){
            min=a;
        }
        else if (b<a&&b<c){
            min=b;
        }
        else{
            min=c;
        }
        return min;
    }
        
        
        
        

}
