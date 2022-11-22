package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File input = new File("/Users/vladimir/Documents/Работа/JAVA/JavaMarathon2021/src/main/resources/shoes.csv");
        try {
            Scanner scanner = new Scanner(input);
            if (!scanner.hasNext()){
                throw new IllegalArgumentException();
            }

            File output = new File("task1Output.txt");
            PrintWriter pw = new PrintWriter(output);
            while (scanner.hasNext()){
                String[] oneLine = scanner.nextLine().split(";");
                if (oneLine.length != 3){
                    throw new ArrayIndexOutOfBoundsException();
                }
                if (Integer.parseInt(oneLine[2]) == 0){
                    pw.println(new Shoe(oneLine[0],Integer.parseInt(oneLine[1]),Integer.parseInt(oneLine[2])));
                }
            }

            scanner.close();
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Исходный файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Исходный файл пустой");
        }  catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исходный файл c ошибками");
        }


    }
}
