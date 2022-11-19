package day11.task2;

public class Paladin extends Hero implements Healer{
    private int healHimself = 25;
    private int healTeammate = 10;



    public Paladin() {
        this.healHimself = healHimself;
        this.healTeammate = healTeammate;
        this.physAtt = 15;
        this.physDef = 50;
        this.magicDef = 20;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }

    public void healHimself(){
        if ((this.health + this.healHimself) >= 100) {
            this.health = 100;
        }else this.health += this.healHimself;
    }
    public void healTeammate(Hero hero){
        if ((hero.health + this.healTeammate) >= 100) {
            hero.health = 100;
        }else hero.health += this.healTeammate;
    }


}
