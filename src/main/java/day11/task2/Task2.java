package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Shaman shaman = new Shaman();
        Magician magician = new Magician();
        Paladin paladin = new Paladin();
        Warrior warrior = new Warrior();

        warrior.physicalAttack(paladin);
        System.out.println(paladin);

        paladin.physicalAttack(magician);
        System.out.println(magician);

        shaman.healTeammate(magician,shaman.getHealTeammate());
        System.out.println(magician);

        magician.magicalAttack(paladin);
        System.out.println(paladin);


        shaman.physicalAttack(warrior);
        System.out.println(warrior);


        paladin.healHimself(paladin.getHealHimself());
        System.out.println(paladin);

        System.out.println();

        for (int i = 0; i < 5; i++){
            warrior.physicalAttack(magician);
            System.out.println(magician);
        }




    }
}
