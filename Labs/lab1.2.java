import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        int[] XY = inputXAndY();
        int x=XY[0];
        int y=XY[1];
        int xLength = calculateNumberLength(x);
        int yLength = calculateNumberLength(y*x)+1;
        printMultiplicationLine(xLength, yLength, y);
        printYAxis(x, xLength,yLength);
        printDashes(xLength, y, yLength);
        printTable(x, xLength, y, yLength);
    }

    private static void printTable(int x, int xLength, int y, int yLength) {
        for (int i = 1; i <= x; i++) { //  printing the table's rows.
            System.out.printf("%-"+ xLength +"d|", i); // printing the x-axis;
            printRow(y, yLength, i);
        }
    }

    private static void printRow(int y, int yLength, int i) {
        for (int j = 1; j <= y; j++) { // printing the table row's individual items with spacing.
            System.out.printf("%"+ yLength +"d", i *j);
        }

        System.out.println(); // row's end.
    }

    private static void printDashes(int xLength, int y, int yLength) {
        for (int i = 0; i <= xLength + y * yLength; i++) { // computing how much dashes needed and printing it.
            System.out.print("-");
        }
        System.out.println();
    }

    private static void printYAxis(int x, int xLength, int yLength) {
        budgeYAxis(xLength);
        for (int i = 1; i <= x; i++) { // printing the y-axis.
            System.out.printf("%"+ yLength +"d", i);
        }
        System.out.println();

    }

    private static void budgeYAxis(int xLength) {
        for (int i = 0; i <= xLength; i++) { // printing the spaces for the x-axis in the y-axis to align each other.
            System.out.print(" ");
        }
    }

    private static void printMultiplicationLine(int xLength, int yLength, int y) {
        int rowLength = xLength + 1 + yLength * y;
        int multiplicationLineSpaces = (int)((rowLength /2.0)-("Multiplication Table".length()/2.0));// compute the amount of spaces needed to center the multiplication line heading.
        for (int i = 0; i < multiplicationLineSpaces; i++) {
            System.out.print(" ");
        }
        System.out.println("Multiplication Table");
    }

    public static int[] inputXAndY(){
        int x,y;
        Scanner input = new Scanner (System.in);
        System.out.print("please enter x: ");
        x= input.nextInt();
        System.out.print("please enter y: ");
        y= input.nextInt();
        return new int[]{x,y};
    }
    public static int calculateNumberLength(int number){
        return Integer.toString(number).length();// converts int to string to then acquire its length.
    }
}