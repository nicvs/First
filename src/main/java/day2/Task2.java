package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long startNum = a;
        if (a < b){
            for (long i=a+1; (i % 5 == 0) || (i<=b); i++){   // поиск первого числа из диапазана, которое удовлетворяет уловиям задачи
                if ((i % 5 == 0)&&(i % 10 != 0)) {
                    startNum = i;                            // запоминаем это число
                    System.out.print(startNum + " ");
                    break;
                }
            }

            for (startNum+=10; startNum < b; startNum+= 10){    // печатаем остальные числа из диапазона, удовлетворяющие условию
                System.out.print(startNum + " ");
            }
        }else System.out.println("Некорректный ввод");
    }
}
