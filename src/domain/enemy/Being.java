package domain.enemy;

import domain.dice.Dice;
import domain.enemy.Skills.Attack;

public class Being {

    private String name;
    private  int hpMax;
    private int hpActual;
    private  int spMax;
    private int spActual;
    private  int initiative;
    private  int dexterity;
    private int strength;
    private boolean alive;
    private Attack basicAttack;
    private Dice dice;

    public Being(String name, int hpMax, int spMax, int strength){
        this.name=name;
        this.hpMax=hpMax;
        this.hpActual=hpMax;
        this.spMax=spMax;
        this.spActual=spMax;
        this.initiative=5;
        this.dexterity=10;
        this.strength=strength;

        basicAttack= new Attack(this,"Basic Attack",getStrength(),5);
        dice =new Dice();

        alive=true;
    }

    public Being() {

    }

    @Override
    public String toString() {
        return "Being{" +
                ", name='" + name + '\'' +
                ", HP=" + hpActual +"/"+hpMax+
                ", SP=" + spActual +"/"+spMax+
                '}';
    }

    public int getSpMax() {
        return spMax;
    }

    public int getSpActual() {
        return spActual;
    }


    public String getName() {
        return name;
    }

    public int getHpMax() {
        return hpMax;
    }

    public int getHpActual() {
        return hpActual;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getStrength() {
        return strength;
    }

    public boolean isAlive() {
        return alive;
    }
    public void sustainDamage(double value){
        if (value>0){
            hpActual-=value;
            System.out.println(name+" has received "+value+" damage.");
        }
        if (hpActual<=0){
            alive=false;
        }
    }
    public boolean useSP(int value){
        if (value<=spActual){
            spActual-=value;
            System.out.println(name+" has used "+value+" SP.");
            return true;
        }else{
            System.out.println(name+" has not enough SP.");
            return false;
        }

    }
    public void useBasicAttack(Being enemy){
        System.out.println(name+" attacks "+enemy.getName());
        if (useSP(basicAttack.getSP_Requirement())&&(useDice()>enemy.useDice())){
            System.out.println(name+" hits "+enemy.getName()+" for "+basicAttack.getValue());
            System.out.println(enemy.getName()+" has "+enemy.getHpActual()+" HP left");
            enemy.sustainDamage(basicAttack.getValue());
        }else{
            System.out.println(name+" missed the attack");
        }
    }


    public int useDice() {

        return dice.rollNDice(getDexterity());
    }
    public int use20Dice(){
        return dice.roll20Dice();
    }
}
