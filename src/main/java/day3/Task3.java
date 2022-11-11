package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x=0;
        double y=0;

        for (int i = 0; i < 5; i++) {
            x = in.nextDouble();
            y = in.nextDouble();
            if (y == 0){
                System.out.println("Деление на 0");
                continue;
            }

            System.out.println(x/y);

        }

    }
}
