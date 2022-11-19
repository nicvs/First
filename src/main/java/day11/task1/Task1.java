package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Warehouse warehouseNew = new Warehouse();
        Picker picker1 = new Picker(warehouse);
        Picker picker2 = new Picker(warehouse);
        Courier courier1 = new Courier(warehouse);

        Picker pickerNew = new Picker(warehouseNew);
        Courier courierNew = new Courier(warehouseNew);

        businessProcess(picker1,5000);
        businessProcess(picker2,5000);
        businessProcess(courier1,5000);

        System.out.println(warehouse);
        System.out.println("Сборщик №1: " + picker1);//первый работник собрал 5 000 заказов - бонус не получает.
        System.out.println("Сборщик №2: " + picker2);//второй работник собрал еще 5 000 заказов (на складе стало 10 000) - он получает бонус.
        picker1.bonus();                //Теперь и первому работнику полагается бонус. Но чтобы он его получил,
                                        // приходится принудительно вызывать метод bonus для данного работника.
                                        // Правильно ли это? Или при получении бонуса одним из работников, остальные
                                        // должны получать его автоматически?
        System.out.println("Сборщик №1: " + picker1);
        System.out.println("Курьер №1: "+ courier1);


        System.out.println("_______________________________________");

        businessProcess(pickerNew,10000);
        businessProcess(courierNew,10000);
        System.out.println(warehouseNew);
        System.out.println("Сборщик 2й склад: "+pickerNew);
        System.out.println("Курьер 2й склад: "+courierNew);

    }
    static void businessProcess(Worker worker,int count){
        for (int i = 0; i < count; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}
