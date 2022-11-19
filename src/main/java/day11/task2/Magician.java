package day11.task2;

public class Magician extends Hero implements MagicAttack{
    private double magicAtt = 20;
    public Magician() {
        this.physAtt = 5;
        this.physDef = 0;
        this.magicDef = 80;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }


    public void magicalAttack(Hero hero){
        hero.health = hero.health - (this.magicAtt - this.magicAtt*(hero.magicDef/100));
        if (hero.health < 0){
            hero.health = 0;
        }
    }
}
