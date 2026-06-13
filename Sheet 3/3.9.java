
import java.util.Scanner;





public class Main {
    public static void main(String[] args) {
        int maxRow=0;
        int indexOfMaxRow=0;

        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 12, 8},
                {9, 10, 11, 7},
        };
        int currentMaxRow;
        for (int i =0;i<matrix.length;i++){
            currentMaxRow=0;
            for (int j=0;j<matrix[0].length;j++){
                currentMaxRow+=matrix[i][j];
            }
            if (currentMaxRow>maxRow){
                maxRow=currentMaxRow;
                indexOfMaxRow=i;
            }
        }
        System.out.println(maxRow +" " +indexOfMaxRow );

    }
}