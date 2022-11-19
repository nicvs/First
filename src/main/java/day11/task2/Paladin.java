package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack{
    private int healHimself = 25;
    private int healTeammate = 10;

    public int getHealHimself() {
        return healHimself;
    }

    public int getHealTeammate() {
        return healTeammate;
    }

    public Paladin() {
        this.healHimself = healHimself;
        this.healTeammate = healTeammate;
        this.health = 100;
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

    public void healHimself(int healHimself){
        if ((this.health + healHimself) >= 100) {
            this.health = 100;
        }else this.health += healHimself;
    }
    public void healTeammate(Hero hero, int healTeammate){
        if ((hero.health + healTeammate) >= 100) {
            hero.health = 100;
        }else hero.health += healTeammate;
    }

    public void physicalAttack(Hero hero){
        hero.health = hero.health - (this.physAtt - this.physAtt*(hero.physDef/100));
        if (hero.health < 0){
            hero.health = 0;
        }
    }
}
