package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;


    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Собрано заказов: " + countPickedOrders + ". Доставленно заказов: " + countDeliveredOrders;
    }

    public void newPickedOder() {
        this.countPickedOrders++;
    }

    public void newDeliveredOder() {
        this.countDeliveredOrders++;
    }
}
