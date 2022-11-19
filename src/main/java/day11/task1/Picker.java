package day11.task1;

public class Picker implements Worker{
    private int salary = 0;
    boolean isPayed = false;
    private final int salaryRate = 80;

    private final int bonus = 70000;

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

    public Picker(Warehouse warehouse) {
        this.whereIwork = warehouse;
    }

    @Override
    public void doWork() {
        salary+=salaryRate;
        whereIwork.newPickedOder();
    }

    @Override
    public void bonus() {
        if (whereIwork.getCountPickedOrders()>=10000){
            if (!isPayed){
                salary += bonus;
                isPayed = true;
            }else System.out.println("Бонус уже был выплачен");
        }else System.out.println("Бонус пока не доступен");
    }
}
