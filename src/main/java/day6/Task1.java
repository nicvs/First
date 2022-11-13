package day6;

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setModel("Lada");
        myCar.setColor("White");
        myCar.setYear(1999);

        System.out.println(myCar.getModel()+" "+myCar.getColor()+" "+myCar.getYear());
        myCar.info();
        System.out.println(myCar.yearDifference(2022));

        System.out.println();

        Motorbike myMoto = new Motorbike("Honda","SB400", 2012);
        System.out.println(myMoto.getModel()+" "+myMoto.getColor()+" "+myMoto.getYear());
        myMoto.info();
        System.out.println(myMoto.yearDifference(2022));


    }
}
