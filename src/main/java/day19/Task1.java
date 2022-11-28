package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("/Users/vladimir/Documents/Работа/JAVA/JavaMarathon2021/src/main/resources/dushi.txt");
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            Map<String,Integer> hashMap = new HashMap<>();
            String tempScannerNext = null;

            while (scanner.hasNext()){
                tempScannerNext = scanner.next();
                if (hashMap.containsKey(tempScannerNext)){
                    hashMap.put(tempScannerNext,hashMap.get(tempScannerNext).intValue()+1);
                } else {
                    hashMap.put(tempScannerNext, 1);
                }
            }

            List<Map.Entry<String,Integer>> sortList = new ArrayList<>(hashMap.entrySet());
            sortList.sort(Map.Entry.comparingByValue());
            for (int i = sortList.size()-1; i >= sortList.size()-100; i--){
                System.out.println(sortList.get(i).getKey()+ " - " +sortList.get(i).getValue());      //Чичиков - 601
            }


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
