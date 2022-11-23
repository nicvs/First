package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File input = new File("test");
        printResult(input);

    }

    public static void printResult (File file){
        try {
            Scanner scanner = new Scanner(file);
            String[] stringNumbers = scanner.nextLine().split(" ");
            int sum = 0;
            for (String number : stringNumbers){
                sum += Integer.parseInt(number);
            }
            double average = (double)sum/stringNumbers.length;
            System.out.printf(average + " --> "+ "%.3f",average);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

