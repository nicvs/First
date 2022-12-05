package Battleship;


import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введитя имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введитя имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());

        player1.fillShips();
        player2.fillShips();

        Random rand = new Random();
        if (rand.nextInt(2) == 0){
            player1.setMyShot(true);
        }else {
            player2.setMyShot(true);
        }

        do{
            if (player1.getMyShot()){
                System.out.println("Игровое поле и поле выстрелов игрока "+player1.getName());
                player1.PrintGameBoard();
                player1.PrintShotBoard(player2);
                player1.shot(player2);
            } else {
                System.out.println("Игровое поле и поле выстрелов игрока "+player2.getName());
                player2.PrintGameBoard();
                player2.PrintShotBoard(player1);
                player2.shot(player1);
            }

        }while (!((player1.getAllHits().size() == 20) || (player2.getAllHits().size() == 20)));

        if (player1.getAllHits().size() != 20){
            System.out.println("Поздравляем! Выграл игрок " + player1.getName());
        }else System.out.println("Поздравляем! Выграл игрок " + player2.getName());


        scanner.close();
    }


}
