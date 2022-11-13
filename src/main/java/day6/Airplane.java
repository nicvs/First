package day6;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public void setManufacturer (String manufacturer) {
        if (manufacturer.isEmpty()){
            System.out.println("Ошибка");
        } else
            this.manufacturer=manufacturer;
    }
    public void setYear (int year) {
        if (year<0){
            System.out.println("Ошибка");
        } else
            this.year=year;
    }
    public void setLength (int length) {
        if (length<0){
            System.out.println("Ошибка");
        } else
            this.length=length;
    }
    public void setWeight (int weight) {
        if (weight<0){
            System.out.println("Ошибка");
        } else
            this.weight=weight;
    }
    public void setFuel (int fuel) {
        if (fuel<0){
            System.out.println("Ошибка");
        } else
            this.fuel=fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public Airplane (String manufacturer, int year, int length, int weight){
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

    public void fillUp (int n){
        fuel+=n;
    }

}
