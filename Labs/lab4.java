package org.example;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the rows of x:");
        int r1 = input.nextInt();
        System.out.print("please enter the columns of x:");
        int c1 = input.nextInt();
        System.out.print("please enter the rows of y:");
        int r2 = input.nextInt();
        System.out.print("please enter the columns of y:");
        int c2 = input.nextInt();
        int x[][] = new int[r1][c1];
        int y[][] = new int[r2][c2];
        int z[][] = new int[r1][c2];
        System.out.println("Matrix X");
        inputMatrix(x);
        System.out.println("Matrix Y");
        inputMatrix(y);
        sum(x,y,z);
        System.out.println("Matrix Z");
        outputMatrix(z);

    }
    public static boolean multiply(int[][] x, int[][]y, int[][] z){
        int r1 = x.length;
        int c1 = x[0].length;
        int r2 = y.length;
        int c2 = y[0].length;
        if (c1!=r2){
            System.err.println("Can't multiply matrices");
            return false;
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {

                for (int k = 0; k < c1; k++) {
                    z[i][j] += x[i][k]*y[k][j];
                }
            }
        }
        return true;
    }
    public static void sum(int[][] x,int[][] y, int[][] z){
        int r1 = x.length;
        int c1 = x[0].length;
        int r2 = y.length;
        int c2 = y[0].length;
        int r3 = z.length;
        int c3 = z[0].length;
        if (r1!= r2 || r2 !=r3 || r1!=r3 ||c1!= c2 || c2 !=c3 || c1!=c3 ){
            System.out.println("Can't add matrices");
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                z[i][j] = x[i][j]+y[i][j];
            }
        }

    }
    public static void inputMatrix(int[][] x){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print("Please, Enter matrix["+i+"]["+j+"]:");
                x[i][j] = input.nextInt();
            }
        }
    }
    public static void outputMatrix(int[][] x){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}