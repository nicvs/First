package day8;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;



    public double getFuel() {
        return fuel;
    }
    public void fillUp (int n){
        fuel+=n;
    }

    public Airplane(String manufacturer, int year, int length, int weight){
        this.manufacturer=manufacturer;
        this.year=year;
        this.length=length;
        this.weight=weight;
        this.fuel=0;
    }

    public void info(){
        System.out.println("Изготовитель: "+manufacturer+", год выпуска: "+year+", длина: "+length+
                ", вес: "+weight+", количество топлива в баке: "+fuel);
    }

    public String toString (){
        return "Изготовитель: "+manufacturer+", год выпуска: "+year+", длина: "+length+
                ", вес: "+weight+", количество топлива в баке: "+fuel;
    }

}
