package day5;

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setModel("Lada2101");
        myCar.setColor("White");
        myCar.setYear(1980);

        System.out.println(myCar.getModel());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getYear());
    }
}

class Car{
    private String model;
    private String color;
    private int year;

    public void setModel (String userModel){
        if (userModel.isEmpty()){
            System.out.println("Ошибка");
        }else {
            model = userModel;
        }
    }

    public String getModel (){
        return model;
    }

    public void setColor (String userColor){
        if (userColor.isEmpty()){
            System.out.println("Ошибка");
        }else {
            color = userColor;
        }
    }

    public String getColor (){
        return color;
    }

    public void setYear (int userYear){
        if (userYear < 0){
            System.out.println("Ошибка");
        } else {
            year = userYear;
        }
    }

    public int getYear (){
        return year;
    }

}
