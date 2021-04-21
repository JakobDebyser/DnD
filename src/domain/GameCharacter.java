package domain;

import domain.equipment.Equipment;
import domain.gender.Gender;
import domain.model.ChClass;
import domain.model.Inventory;
import domain.race.Race;
import domain.skills.Skill;

import java.util.ArrayList;
import java.util.List;

public class GameCharacter {
    private String name;
    private Gender gender;
    private Race race;
    private ChClass chClass;
    private int hp;
 //   private int HPActual;
    private int xp;
    private int sp;
    private int initiative;
    private List<Inventory> inventories = new ArrayList<>();
    private List<Integer> attributes = new ArrayList<>();
//    private int SP_actual;
//
//    public void setHPActual(int value) {
//        this.HPActual = value;
//    }
//
//    public void setSP_actual(int value) {
//        this.SP_actual = value;
//    }

    public GameCharacter() {
        super();
    }

    public ChClass getChClass() {
        return chClass;
    }

    public void setChClass(ChClass chClass) {
        this.chClass = chClass;
    }

    public void addInventory(Inventory inventory) {
        inventories.add(inventory);
    }

    public void addHp(int value) {
        hp += value;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getXp() {
        return xp;
    }

    public void addXp(int xp) {
        this.xp += xp;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public List<Inventory> getInventories() {
        return inventories;
    }

    public void setInventories(List<Inventory> inventories) {
        this.inventories = inventories;
    }


    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAttributes(List<Integer> attribute) {
        attributes.addAll(attribute);
    }

    public void setAttributes(List<Integer> attributes) {
        this.attributes = attributes;
    }

    public void getSkills() {
        Skill.getSkillList();
    }

    public void getEquipment() {
        Equipment.getEquipments();
    }

    @Override
    public String toString() {
        return
                "Name='" + name + '\'' + "\n" +
                        "Gender=" + gender + "\n" +
                        "Race=" + race + "\n" +
                        "Class=" + chClass + "\n" +
                        "Xp=" + xp + "\n" +
                        "Hp=" + hp + "\n" +
                        "Sp=" + sp + "\n" +
                        "Initiative=" + initiative + "\n" +
                        "Attributes=" + attributes + "\n";
    }

 /*   public void chooseOption(Being enemy) {

            System.out.println("[1] Basic attack");
            System.out.println("[2] Skill or spell");
            System.out.println("[3] use item");
            System.out.println("[4] flee");
            int input = KeyboardHelper.askForNumber("input: ");
            switch (input) {
                case 1:
                    useBasicAttack(enemy);
                case 2:

                case 3:
                case 4:
                    if (enemy.useDice() > useDice()) {
                        System.out.println("attempt to flee failed");
                    } else {
                        System.out.println("flee attempt was a success!");
                        break;
                    }
                default:
                    System.out.println("wrong input. please try again");
            }

    }*/

}
