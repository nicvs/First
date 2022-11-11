package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();

        while (true){
            System.out.println(x/y);
            x = in.nextDouble();
            y = in.nextDouble();
            if (y==0){
                break;
            }
        }
    }
}
