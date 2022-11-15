package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("Boing",2022,1001,2000);
        Airplane air2 = new Airplane("Airbus", 2020, 1000,2222);

        Airplane.compareAirplanes(air1,air2);

    }
}