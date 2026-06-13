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
        System.out.println(convertMillis(555550000));
    }
    public static String convertMillis(long milliseconds){
        long hours,minutes,seconds;
        hours = milliseconds/3600000;
        milliseconds -= (milliseconds/3600000)*3600000;
        minutes = milliseconds/60000;
        milliseconds -= (milliseconds/60000)*60000;
        seconds = milliseconds/1000;
        
        
        
        
        
        
        
        return hours+";"+minutes+";"+seconds;
    }
}
