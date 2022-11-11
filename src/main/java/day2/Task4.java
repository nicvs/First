package day2;

import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = 420;

        if (x >=5 ){
            y = (Math.pow(x,2) - 10)/(x+7);
            System.out.println(y);
        } else if ((-3 < x)&&(x < 5)){
            y = (x+3)/(Math.pow(x,2)-2);
            System.out.println(y);
        }else System.out.println(y);

    }
}
