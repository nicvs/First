package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("/Users/vladimir/Documents/Работа/JAVA/JavaMarathon2021/src/main/resources/taxi_cars.txt");
        try {
            Scanner scanner = new Scanner(file);
            Map<Integer,Point> taxi = new HashMap<>();
            String[] oneString = new String[]{};
            while (scanner.hasNext()){
                oneString = scanner.nextLine().split(" ");
                taxi.put(Integer.parseInt(oneString[0]),new Point(Integer.parseInt(oneString[1]),Integer.parseInt(oneString[2])));
            }

            Scanner input = new Scanner(System.in);
            System.out.println("Введите координаты x1 y1 x2 y2:");
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int x2 = input.nextInt();
            int y2 = input.nextInt();
//------------------------------------------------------------------------------------------------------------------
// Способ №1, неправильный, т.к. сперва подумал что задача на сопоставление множеств. Подходит только для целочисленных координат

            List<Point> field = new ArrayList<>();
            for (int x = x1+1; x < x2 ; x++){
                for (int y = y2+1; y < y1; y++){
                    field.add(new Point(x,y));   // В списке находятся ВСЕ координаты, которые есть внутри квадрата
                }
            }
            int count = 0;
            //Проверяю координату каждой машины, входит ли она в список всех координат квадрата
            for (Map.Entry<Integer,Point> entry : taxi.entrySet()){
                if (field.contains(entry.getValue())){
                    System.out.print(entry.getKey() + " ");
                    count++;
                }
            }
            System.out.println("");
            System.out.println("Машин в квадрате: "+ count);

//------------------------------------------------------------------------------------------------------------------
// Способ №2, проверяю по границам квадрата
            count = 0;
            for (Map.Entry<Integer,Point> entry : taxi.entrySet()){
                if ((entry.getValue().getX() > x1)&&(entry.getValue().getX() < x2)&&
                        (entry.getValue().getY() > y2)&&(entry.getValue().getY() < y1 )){
                    System.out.print(entry.getKey() + " ");
                    count++;
                }
            }
            System.out.println("");
            System.out.println("Машин в квадрате: "+ count);
//------------------------------------------------------------------------------------------------------------------
            scanner.close();
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}

