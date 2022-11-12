package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike moto = new Motorbike("Honda","White",2020);
        System.out.println(moto.getModel());
        System.out.println(moto.getColor());
        System.out.println(moto.getYear());
    }
}

class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike (String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
