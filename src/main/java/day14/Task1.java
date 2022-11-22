package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {

        File myFile = new File("test");
        printSumDigits (myFile);


    }
    public static void printSumDigits(File file) {

        try {
            Scanner scanner;
            scanner = new Scanner(file);
            String[] stringNumbers = scanner.nextLine().split(" ");
            if (stringNumbers.length != 10){
                throw new IllegalArgumentException();
            }
            int[] intNumbers = new int[stringNumbers.length];
            int sumIntNumbers = 0;
            for (int i = 0; i < 10; i++) {
                intNumbers[i] = Integer.parseInt(stringNumbers[i]);
                sumIntNumbers += intNumbers[i];
            }
            System.out.println(sumIntNumbers);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
    }

}
