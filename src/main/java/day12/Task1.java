package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List <String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Jeep");
        cars.add("KIA");
        cars.add("Mini");
        System.out.println(cars);
        cars.add(cars.size()/2,"Dodge");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);

        System.out.println("-------------------- ");

        List <String> cars2 = new ArrayList<>(Arrays.asList("BMW","Audi","Jeep","KIA","Mini"));
        System.out.println(cars2);
        cars2.add(cars2.size()/2,"Dodge");
        System.out.println(cars2);
        cars2.remove(0);
        System.out.println(cars2);

    }
}
