package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();

        addEven(0,30,300,500,list);
        System.out.println(list);

    }
    static void addEven (int a, int b, int c, int d, List <Integer> list){
        for (int i = a; i <= b; i++){
            if (i % 2 == 0){
                list.add(i);
            }
        }

        for (int i = c; i <= d; i++){
            if (i % 2 == 0){
                list.add(i);
            }
        }
    }
}
