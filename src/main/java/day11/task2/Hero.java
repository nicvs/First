package day11.task2;

public abstract class Hero implements PhysAttack{
    public double health = 100;
    public double physDef;
    public double magicDef;
    public double physAtt;



    public void physicalAttack(Hero hero){
        if (hero.health - (this.physAtt - this.physAtt*(hero.physDef/100)) < 0){
            hero.health = 0;
        } else {
            hero.health = hero.health - (this.physAtt - this.physAtt*(hero.physDef/100));
        }

    }


}
