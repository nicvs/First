package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();

        if (i > 0){
            if ((1 <= i) && (i <= 4)){System.out.println("Малоэтажный дом");}
            else if ((5 <= i) && (i <= 8)){System.out.println("Среднеэтажный дом");}
            else System.out.println("Многоэтажный дом");
        }else System.out.println("Ошибка ввода");
    }
}
