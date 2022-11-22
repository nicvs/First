package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        File input = new File("people.txt");
        System.out.println(parseFileToObjList(input));

    }
    public static List<Person> parseFileToObjList(File file){

        List<Person> persons = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String[] oneString = scanner.nextLine().split(" ");
                if (Integer.parseInt(oneString[1]) < 0){
                    throw new IllegalArgumentException();
                }
                persons.add(new Person(oneString[0],Integer.parseInt(oneString[1])));

            }
            return persons;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
