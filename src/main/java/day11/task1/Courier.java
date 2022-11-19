package day11.task1;

public class Courier implements Worker{
    private int salary = 0;
    private boolean isPayed = false;

    private final int salaryRate = 100;

    private final int bonus = 50000;

    private Warehouse whereIwork;

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        if (isPayed){
            return "Зарплата: "+salary+". Бонус выплачен.";}
        else return "Зарплата: "+salary+". Бонус не выплачен.";
    }

    public Courier (Warehouse warehouse) {
        this.whereIwork = warehouse;
    }

    @Override
    public void doWork() {
        salary+=salaryRate;
        whereIwork.newDeliveredOder();
    }

    @Override
    public void bonus() {
        if (whereIwork.getCountDeliveredOrders()>=10000){
            if (!isPayed){
                salary += bonus;
                isPayed = true;
            }else System.out.println("Бонус уже был выплачен");
        }else System.out.println("Бонус пока не доступен");
    }
}
