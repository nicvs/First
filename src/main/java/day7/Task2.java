package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();

        Player player1 = new Player(90+rand.nextInt(11));
        Player player2 = new Player(90+rand.nextInt(11));
        Player player3 = new Player(90+rand.nextInt(11));
        Player player4 = new Player(90+rand.nextInt(11));
        Player player5 = new Player(90+rand.nextInt(11));
        Player player6 = new Player(90+rand.nextInt(11));

        Player.info();
        System.out.println(Player.getCountPlayers());

        Player player7 = new Player(90+rand.nextInt(11));
        System.out.println(Player.getCountPlayers());

        System.out.println("Выносливость до бега: "+player1.getStamina());
        for (int i = player1.getStamina(); i > 0; i--){
            Player.run(player1);
        }
        System.out.println("Выносливость после бега: "+player1.getStamina());
        System.out.println("Количество в команде: "+Player.getCountPlayers());






    }
}
