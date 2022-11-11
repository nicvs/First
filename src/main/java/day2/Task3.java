package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long startNum = a;
        if (a < b){
            long i = a+1;
            while ((i % 5 != 0) || (i < b)){
                if ((i % 5 == 0)&&(i % 10 != 0)) {
                    startNum = i;
                    System.out.print(startNum + " ");
                    break;
                }
                i++;
            }

            while (startNum < (b-10)){
                System.out.print(startNum+10 + " ");
                startNum+=10;
            }
        }else System.out.println("Некорректный ввод");
    }
}
