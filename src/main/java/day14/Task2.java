package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        File input = new File("people.txt");
        System.out.println(parseFileToStringList(input));

    }

    public static List<String>  parseFileToStringList(File file){
        try {
            Scanner scanner = new Scanner(file);
            List<String> strings = new ArrayList<>();

            while (scanner.hasNext()){
                String oneString = scanner.nextLine();
                String[] testOneString = oneString.split(" ");

                if (Integer.parseInt(testOneString[1])<0){
                    throw new IllegalArgumentException();
                }
                strings.add(oneString);
            }
            return strings;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");

        }
        return null;
    }
}
