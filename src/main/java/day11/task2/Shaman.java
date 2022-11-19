package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack{
    private double magicAtt = 15;
    private int healHimself = 50;
    private int healTeammate = 30;

    public int getHealHimself() {
        return healHimself;
    }

    public int getHealTeammate() {
        return healTeammate;
    }

    public Shaman() {
        this.healHimself = healHimself;
        this.healTeammate = healTeammate;
        this.physAtt = 10;
        this.physDef = 20;
        this.magicDef = 20;
    }

    @Override
    public String toString() {
        return "Shaman{" +
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


    public void magicalAttack(Hero hero){
        hero.health = hero.health - (this.magicAtt - this.magicAtt*(hero.magicDef/100));
        if (hero.health < 0){
            hero.health = 0;
        }
    }
}
