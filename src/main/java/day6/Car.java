package day6;

class Car {
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

    public void info(){
        System.out.println("Это автомобиль");
    }

    public int yearDifference (int inputYear){
        return Math.abs(inputYear-year);
    }
}
