
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
import java.util.Arrays;





public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of the list: ");
        int m = input.nextInt();
        int originalArray[] = new int[m];
        int toBeSortedArray[] = new int[m];
        int num;
        for (int i=0;i<originalArray.length;i++){
            System.out.println("please enter element which index is " + i +": ");
            num  = input.nextInt();
            originalArray[i] = num;
            toBeSortedArray[i] = num;
        }
        Arrays.sort(toBeSortedArray);
        boolean isSorted=true;
        for (int i = 0; i < m; i++) {
            if (originalArray[i] == toBeSortedArray[i]){
                continue;
            }
            isSorted=false;

        }
        if (isSorted){
            System.out.println("the list is sorted");
            for (int i = 0; i < originalArray.length; i++) {
                System.out.print(originalArray[i] + " ");
            }

            return;
        }
        System.out.println("the list entered isn't sorted.");
        for (int i = 0; i < toBeSortedArray.length; i++) {
            System.out.print(toBeSortedArray[i] + " ");
        }
    }
}