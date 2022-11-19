package day11.task2;

public class Warrior extends Hero implements PhysAttack{
    public Warrior() {
        this.health = 100;
        this.physAtt = 30;
        this.physDef = 80;
        this.magicDef = 0;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }

    public void physicalAttack(Hero hero){
        hero.health = hero.health - (this.physAtt - this.physAtt*(hero.physDef/100));
        if (hero.health < 0){
            hero.health = 0;
        }
    }
}
