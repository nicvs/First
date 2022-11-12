package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int size = in.nextInt();
        int[] mass = new int [size];

        int more8 = 0;
        int equals1 = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;

        for (int i = 0; i < size-1; i++) {
            mass[i] = rand.nextInt(11);
            if (mass[i] > 8) {
                more8++;
            }
            if (mass[i] == 1) {
                equals1++;
            }
            if (mass[i] % 2 == 0) {
                even++;
            }
            odd = size - even;
            sum += mass[i];
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println("Длина массива: "+size);
        System.out.println("Количество чисел больше 8: "+more8);
        System.out.println("Количество чисел равных 1: "+equals1);
        System.out.println("Количество четных чисел: "+even);
        System.out.println("Количество нечетных чисел: "+odd);
        System.out.println("Сумма всех элементов массива: "+sum);
    }
}
