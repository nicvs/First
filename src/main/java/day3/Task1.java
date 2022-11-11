package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String city = in.nextLine();

        while (!city.equals("Stop")){
            switch (city){
                case "Москва" :
                case "Владивосток" :
                case "Ростов" :
                    System.out.println("Россия");
                    city = in.nextLine();
                    break;
                case "Рим" :
                case "Милан" :
                case "Турин" :
                    System.out.println("Италия");
                    city = in.nextLine();
                    break;
                case "Ливерпуль" :
                case "Манчестер" :
                case "Лондон" :
                    System.out.println("Англия");
                    city = in.nextLine();
                    break;
                case "Берлин" :
                case "Мюнхен" :
                case "Кёльн" :
                    System.out.println("Германия");
                    city = in.nextLine();
                    break;
                default:
                    System.out.println("Неизвестная страна");
                    city = in.nextLine();
            }
        }
    }
}
