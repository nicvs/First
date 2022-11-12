package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int size = 100;
        int[] arr = new int[size];
        Random rand = new Random();

        int min = 10000;
        int max = 0;
        int count0 = 0;
        int sum0 =0;

        for (int i = 0; i<size; i++){
            arr[i] = rand.nextInt(10001);
            System.out.print(arr[i]+" ");
        }

        for (int i:arr){
            if (i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }
            if (i % 10 == 0){
                count0++;
                sum0+=i;
            }
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
        System.out.println(count0);
        System.out.println(sum0);

    }
}
