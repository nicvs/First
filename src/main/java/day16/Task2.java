package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1.txt");
        PrintWriter pw = new PrintWriter(file1);

        Random rand = new Random();
        for (int i = 0; i < 1000; i++){
            pw.print(rand.nextInt(101));
            pw.print(" ");
        }
        pw.close();

        File file2 = new File("file2.txt");
        pw = new PrintWriter(file2);
        Scanner scanner = new Scanner(file1);
        String[] stringFile1 = scanner.nextLine().split(" ");

        int i = 0;
        for (int count = 0; count < (stringFile1.length/20); count++) {
            double sum = 0;
            for (i = count*20; i < (count*20)+20; i++) {
                sum+=Double.parseDouble(stringFile1[i]);
            }
            pw.print((double)sum/20);
            pw.print(" ");
        }
        scanner.close();
        pw.close();

        printResult(file2);
    }
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String[] string = scanner.nextLine().split(" ");
        double sum=0;
        for (int i = 0; i < string.length; i++){
            sum+=Double.parseDouble(string[i]);
        }
        System.out.println((int)sum);
    }
}
