package day8;

public class Task1 {
    public static void main(String[] args) {

        // СПОСОБ №1
        String string = "";
        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++){
            string = string + " " + i;
        }

        System.out.println(string);
        long stopTime1 = System.currentTimeMillis()-startTime;


        // СПОСОБ №2
        StringBuilder sb = new StringBuilder();
        startTime = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++){
            sb.append(" "+i);
        }

        System.out.println(sb);

        long stopTime2 = System.currentTimeMillis()-startTime;
        System.out.println("Первый способ. Длительность работы, в мс.: "+ (stopTime1));
        System.out.println("Второй способ. Длительность работы, в мс.: "+ (stopTime2));

    }
}
