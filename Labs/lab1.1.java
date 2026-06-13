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
        Scanner input = new Scanner(System.in);
		float celsius;
		celsius=input.nextFloat();
		float fahrenheit = (9.0/5.0)*celsius+32;
		System.out.print(fahrenheit);
    }

}
