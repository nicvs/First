package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] arr = new int[12][8];
        Random rand = new Random();
        int sumLine = 0;
        int max = 0;
        int line = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = rand.nextInt(51);
                System.out.print(arr[i][j]+" ");
                sumLine+=arr[i][j];
            }
            System.out.println();
            if (sumLine >= max) {
                line = i;
                max = sumLine;
            }
            sumLine = 0;
        }
        System.out.println(line);
    }
}
