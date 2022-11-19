package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    public Magician() {
        this.health = 100;
        this.physAtt = 5;
        this.magicAtt = 20;
        this.physDef = 0;
        this.magicDef = 80;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
    public void physicalAttack(Hero hero){
        hero.health = hero.health - (this.physAtt - this.physAtt*(hero.physDef/100));
        if (hero.health < 0){
            hero.health = 0;
        }
    }

    public void magicalAttack(Hero hero){
        hero.health = hero.health - (this.magicAtt - this.magicAtt*(hero.magicDef/100));
        if (hero.health < 0){
            hero.health = 0;
        }
    }
}
