package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(10001);
            System.out.print(arr[i]+" ");
        }
        int maxSum = 0;
        int sum = 0;
        int maxI = 0;

        for (int i = 0; i < arr.length-2; i++){
            sum = arr[i] + arr[i+1] + arr[i+2];
            if (sum > maxSum) {
                maxSum = sum;
                maxI = i;
            }
        }
        System.out.println();
        System.out.println(maxSum);
        System.out.println(maxI);

    }
}
