package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public Player (int stamina){
        this.stamina=stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public static void run (Player player){
        if (player.stamina>0) {
            player.stamina--;
            if (player.stamina == MIN_STAMINA) {
                countPlayers--;
            }
        }
    }

    public static void info (){
        if (countPlayers<6){
            System.out.println("Команды неполные. На поле еще есть "+ (6-countPlayers) + " свободных мест");
        } else System.out.println("На поле нет свободных мест");
    }


}
