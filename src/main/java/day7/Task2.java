package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int startMinStamina = 90;
        Random rand = new Random();

        Player player1 = new Player(startMinStamina+rand.nextInt(11));
        Player player2 = new Player(startMinStamina+rand.nextInt(11));
        Player player3 = new Player(startMinStamina+rand.nextInt(11));
        Player player4 = new Player(startMinStamina+rand.nextInt(11));
        Player player5 = new Player(startMinStamina+rand.nextInt(11));
        Player player6 = new Player(startMinStamina+rand.nextInt(11));

        Player.info();
        System.out.println("Игроков в игре: "+Player.getCountPlayers());

        Player player7 = new Player(startMinStamina+rand.nextInt(11));  // пробуем создать 7го игрока
        System.out.println("Игроков в команде: "+Player.getCountPlayers());              // создался ли?

        System.out.println("Выносливость до бега: "+player1.getStamina());              //проверяем выносливость ДО
        for (int i = player1.getStamina(); i > 0; i--){                                 //заставляем бегать
            Player.run(player1);
        }
        System.out.println("Выносливость после бега: "+player1.getStamina());
        System.out.println("Игроков в команде: "+Player.getCountPlayers());             //проверяем ушел ли из команды

    }
}
