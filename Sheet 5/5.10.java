
package org.example.finals;
import java.util.Date;


public class Launcher {
    public static Comparable max(Comparable[] array){
        Comparable max=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max)>0) {
                max = array[i];
            }
        }
        return max;
    }



    public static void main(String[] args) {
        String[] strings = {"a", "an", "and", "hard", "apple"};
        Integer[] integers = {1,2,3,4,5};
        Date[] dates = {new Date(2022),new Date(2023),new Date(2024),new Date(2025),new Date(2026)};
        System.out.println(max(strings));
        System.out.println(max(integers));
        System.out.println(max(dates));
    }
}

