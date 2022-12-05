package Battleship;

import java.util.*;

public class Player {
    private String name;
    private boolean myShot = false;
    private List<List> allShips = new ArrayList<>();            // Флот игрока. Список из списков. Каждый внутренний список - корабль
    private List<Point> allHits = new ArrayList<>();            // Список всех успешных попаданий врагом в корабли игрока
    private Set<Point> halo = new HashSet<>();                    // Список всех точек, являющихся ореолом кораблей
    private List<Point> allMissedShots = new ArrayList<>();    // Список всех точек промахов по кораблям соперника
    private final int XMAX = 10;
    private final int YMAX = 10;


    public boolean getMyShot() {
        return myShot;
    }

    public void setMyShot(boolean myShot) {
        this.myShot = myShot;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public List<Point> getAllHits() {
        return allHits;
    }


    /*
    Процедура создания кораблей игроком. Внутри процедуры запрашиваются координаты, и отправляются в
    соответствующие процедуры проверки. Ввод координат будет запрашиваться до тех пор, пока переменная isChecked не
    примет значение true. А принять такое значение она может только если все процедуры проверки корректности ввода координат
    вернут true.
    */
    public void fillShips(){
        boolean isChecked = false;
        System.out.println("");
        System.out.println("Расстановляем корабли на поле игрока " + this.name);
        Scanner scanner = new Scanner(System.in);


    //-----------------------------Ввод одного 4х палубного корабля---------------------------------
        do {
            System.out.println("Введите координаты 4-х палубного корабля. Формат x,y;x,y;x,y;x,y");
            String inputString = scanner.nextLine();

            if (!checkNumberOfPoints(inputString,4)){    // Проверяем количество введенных координат
                continue;
            }

            if (!checkRangeOfPoints(inputString)){                  // Проверяем диапазон введенных координат
                continue;
            }

            String[] ship = inputString.split(";");           // Если первые две проверки прошли, вносим координаты в список "один_корабль"
            List<Point> oneShip = new ArrayList<>();
            for (int i = 0; i < ship.length; i++){
                String[] shipPoint = ship[i].split(",");
                oneShip.add(new Point(shipPoint[0],shipPoint[1]));
            }

            if (checkTrueShip(oneShip)){
                isChecked = true;
                allShips.add(oneShip);
                createHalo(oneShip);
            }
        }while (!isChecked);
        System.out.println("4х палубный - ОК");
        PrintGameBoard();

        //--------------------------Ввод двух 3х палубных кораблей-----------------------------
        for (int count = 0; count < 2; count++){
            isChecked = false;
            do {
                System.out.println("Введите координаты 3-х палубного корабля. Формат x,y;x,y;x,y");
                String inputString = scanner.nextLine();

                if (!checkNumberOfPoints(inputString,3)){    // Проверяем количество введенных координат
                    continue;
                }

                if (!checkRangeOfPoints(inputString)){                  // Проверяем диапазон введенных координат
                    continue;
                }

                String[] ship = inputString.split(";");           // Если первые две проверки прошли, вносим координаты в список "один_корабль"
                List<Point> oneShip = new ArrayList<>();
                for (int i = 0; i < ship.length; i++){
                    String[] shipPoint = ship[i].split(",");
                    oneShip.add(new Point(shipPoint[0],shipPoint[1]));
                }

                if ((checkTrueShip(oneShip)) && (checkHalo(oneShip)) && (checkAnotherShip(oneShip))){
                    isChecked = true;
                    allShips.add(oneShip);
                    createHalo(oneShip);
                }
            }while (!isChecked);
            switch (count) {
                case (0):
                    System.out.println("Первый 3х палубный - ОК");
                    break;
                case (1):
                    System.out.println("Второй 3х палубный - ОК");
                    break;
            }
            PrintGameBoard();
        }

        //--------------------------Ввод трёх 2х палубных кораблей-----------------------------
        for (int count = 0; count < 3; count++){
            isChecked = false;
            do {
                System.out.println("Введите координаты 2-х палубного корабля. Формат x,y;x,y");
                String inputString = scanner.nextLine();

                if (!checkNumberOfPoints(inputString,2)){    // Проверяем количество введенных координат
                    continue;
                }

                if (!checkRangeOfPoints(inputString)){                  // Проверяем диапазон введенных координат
                    continue;
                }

                String[] ship = inputString.split(";");           // Если первые две проверки прошли, вносим координаты в список "один_корабль"
                List<Point> oneShip = new ArrayList<>();
                for (int i = 0; i < ship.length; i++){
                    String[] shipPoint = ship[i].split(",");
                    oneShip.add(new Point(shipPoint[0],shipPoint[1]));
                }

                if ((checkTrueShip(oneShip)) && (checkHalo(oneShip)) && (checkAnotherShip(oneShip))){
                    isChecked = true;
                    allShips.add(oneShip);
                    createHalo(oneShip);
                }
            }while (!isChecked);
            switch (count) {
                case (0):
                    System.out.println("Первый 2х палубный - ОК");
                    break;
                case (1):
                    System.out.println("Второй 2х палубный - ОК");
                    break;
                case (2):
                    System.out.println("Третий 2х палубный - ОК");
                    break;
            }
            PrintGameBoard();
        }


        //--------------------------Ввод четырех 1 палубных кораблей-----------------------------
        for (int count = 0; count < 4; count++){
            isChecked = false;
            do {
                System.out.println("Введите координаты 1 палубного корабля. Формат x,y");
                String inputString = scanner.nextLine();

                if (!checkNumberOfPoints(inputString,1)){    // Проверяем количество введенных координат
                    continue;
                }

                if (!checkRangeOfPoints(inputString)){                  // Проверяем диапазон введенных координат
                    continue;
                }

                String[] ship = inputString.split(";");           // Если первые две проверки прошли, вносим координаты в список "один_корабль"
                List<Point> oneShip = new ArrayList<>();
                for (int i = 0; i < ship.length; i++){
                    String[] shipPoint = ship[i].split(",");
                    oneShip.add(new Point(shipPoint[0],shipPoint[1]));
                }

                if ((checkHalo(oneShip)) && (checkAnotherShip(oneShip))){
                    isChecked = true;
                    allShips.add(oneShip);
                    createHalo(oneShip);
                }
            }while (!isChecked);
            switch (count) {
                case (0):
                    System.out.println("Первый 1 палубный - ОК");
                    break;
                case (1):
                    System.out.println("Второй 2 палубный - ОК");
                    break;
                case (2):
                    System.out.println("Третий 3 палубный - ОК");
                    break;
                case (3):
                    System.out.println("Четвертый 3 палубный - ОК");
                    break;
            }
            PrintGameBoard();
        }
        for (int i = 0; i < 10; i++){
            System.out.println("");
        }
    }

//---------------------------Проверяем сколько координат ввели---------------------------------
    private boolean checkNumberOfPoints(String inputString, int shipLength){

        String[] strings = inputString.split("[,;]");
        try {
            if (strings.length != shipLength*2){
                throw new IllegalArgumentException("Неверное количество координат");
            } else return true;
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
//---------------------------------------------------------------------------------------------

//------------------------------Проверяем диапазон координат-----------------------------------
    private boolean checkRangeOfPoints(String inputString){
        String[] strings = inputString.split("[,;]");
        try {
            for (String point : strings){
                if ((Integer.parseInt(point) < 0) || (Integer.parseInt(point) > 9)){
                    throw new IllegalArgumentException("Недопустимые координаты. Диапазон 0-9");
                }
            } return true;
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
//---------------------------------------------------------------------------------------------

//-----------------------------Проверяем правильный ли корабль---------------------------------
    private boolean checkTrueShip (List<Point> oneShip){
        int lineX = oneShip.get(0).getX();
        int lineY = oneShip.get(0).getY();

        try {

        // Проверяет горизонтальный или вертикальный корабль (одна из координат одинакова для каждой точки)
            for (Point point : oneShip){
                if (!((point.getX() == lineX)||(point.getY() == lineY))) {
                    throw new IllegalArgumentException("Не является горизонтальным или вертикальным единым кораблем");
                }
            }

        // Если одна из координат одинакова для всех - складываем другую координату всех точек в отсортированное дерево
            TreeSet<Integer> checkPoints = new TreeSet<>();
            if (oneShip.get(1).getX() == lineX){
                for (Point point : oneShip){
                    checkPoints.add(point.getY());
                }
            } else {
                for (Point point : oneShip){
                    checkPoints.add(point.getX());
                }
            }

        // Проверяем есть ли повторяющаяся координата
            if (oneShip.size() != checkPoints.size()){
                throw new IllegalArgumentException("Введены повторяющиеся координаты");
            }
        // Проверяем последовательны ли координаты, т.е. един ли корабль
            if (checkPoints.last()-checkPoints.first()+1 != oneShip.size()){
                throw new IllegalArgumentException("Введенный корабль - не одно целое");
            }
            return true;
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
//---------------------------------------------------------------------------------------------

//-----------------------Проверяем попадает ли корабль в чужой ореол--------------------------
    private boolean checkHalo (List<Point> oneShip){
        try {
            for (Point point : oneShip){
                if (halo.contains(point)){
                    throw new IllegalArgumentException("Введенный корабль затрагивает ореол другого корабля");
                }
            } return true;

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
//---------------------------------------------------------------------------------------------

//-----------------------Проверяем попадает ли корабль в другой корабль---------------------------
private boolean checkAnotherShip (List<Point> oneShip){
    try {
        for (Point point : oneShip){
            if (isAShip(allShips,point)){
                throw new IllegalArgumentException("Введенный корабль попадает на другой корабль");
            }
        } return true;

    }catch (IllegalArgumentException e){
        System.out.println(e.getMessage());
    }
    return false;
}
//---------------------------------------------------------------------------------------------


//------------------------Создаем ореол для вновь введенного корабля---------------------------
    private void createHalo(List<Point> oneShip){
        int lineY;
        int lineX;
        if (oneShip.get(0).getY() == oneShip.get(oneShip.size()-1).getY()){   // Если наш корабль вертикальный
            lineY = oneShip.get(0).getY();
            for (int i = -1; i < oneShip.size()+1 ;i++){
                halo.add(new Point(oneShip.get(0).getX()+i,lineY-1));
                halo.add(new Point(oneShip.get(0).getX()+i,lineY+1));
            }
            halo.add(new Point(oneShip.get(0).getX()-1,lineY));
            halo.add(new Point(oneShip.get(oneShip.size()-1).getX()+1,lineY));
        }else {                                                               // Если наш корабль горизонтальный
            lineX = oneShip.get(0).getX();
            for (int i = -1; i < oneShip.size()+1 ;i++){
                halo.add(new Point(lineX-1,oneShip.get(0).getY()+i));
                halo.add(new Point(lineX+1,oneShip.get(0).getY()+i));
            }
            halo.add(new Point(lineX,oneShip.get(0).getY()-1));
            halo.add(new Point(lineX,oneShip.get(oneShip.size()-1).getY()+1));
        }

    }
//---------------------------------------------------------------------------------------------

//---------------------------Узнаем является ли точка частью коробля---------------------------
    public boolean isAShip(List<List> allShips, Point point){
        for (List ships : allShips) {
            if (ships.contains(point)) {
                return true;
            }
        }
        return false;
    }
//---------------------------------------------------------------------------------------------

//-------------------------------------------Стреляем------------------------------------------
    public void shot (Player anotherPlayer){

        Scanner scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.println("Стреляет игрок "+ this.name + ". Введите координату выстрела x,y");
            inputString = scanner.nextLine();
        }while (!((checkNumberOfPoints(inputString, 1)) && (checkRangeOfPoints(inputString))));
        String[] strings = inputString.split(",");
        Point shot = new Point(strings[0],strings[1]);


        for (List<Point> ships : anotherPlayer.allShips){
            if (ships.contains(shot)){
                anotherPlayer.allHits.add(shot);
                ships.remove(ships.indexOf(shot));
                if (ships.isEmpty()){
                    System.out.println("Убил!");
                } else System.out.println("Ранил");
                return;
            }
        }
        this.allMissedShots.add(shot);
        this.setMyShot(false);
        anotherPlayer.setMyShot(true);
        System.out.println("Промах");

    }
//---------------------------------------------------------------------------------------------

//---------------------------Печатаем игровое поле с кораблями----------------------------------
    public void PrintGameBoard () {
        System.out.print("   0 1 2 3 4 5 6 7 8 9");
        System.out.println("");
        for (int x = 0; x < XMAX; x++){
            System.out.print(x + " ");
            for (int y = 0; y < YMAX; y++){

                if (this.isAShip(this.allShips,new Point(x,y))){
                    System.out.print("\uD83D\uDEE5");
                    continue;
                }

                if (this.halo.contains(new Point(x,y))){
                    System.out.print("\uD83D\uDFE6");
                    continue;
                }
                if (this.allHits.contains(new Point(x,y))){
                    System.out.print("\uD83D\uDFE5");
                    continue;
                }
                System.out.print("⬜");
            }
            System.out.println("");
        }
    }

//---------------------------------------------------------------------------------------------

//---------------------------Печатаем игровое поле с выстрелами---------------------------------
    public void PrintShotBoard (Player anotherPlayer) {
        System.out.print("   0 1 2 3 4 5 6 7 8 9");
        System.out.println("");
        for (int x = 0; x < XMAX; x++){
            System.out.print(x + " ");
            for (int y = 0; y < YMAX; y++){

                if (anotherPlayer.allHits.contains(new Point(x,y))){
                    System.out.print("\uD83D\uDFE5");
                    continue;
                }
                if (this.allMissedShots.contains(new Point(x,y))){
                    System.out.print("⭕");
                    continue;
                }
                System.out.print("⬜");
            }
            System.out.println("");
        }
    }
}
