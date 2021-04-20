package domain;

import domain.gender.Gender;
import domain.model.ChClass;
import domain.model.Inventory;
import domain.race.Race;
import domain.skills.Skills;

import java.util.ArrayList;
import java.util.List;

public class GameCharacter {
    private String name;
    private Gender gender;
    private Race race;
    private ChClass chClass;
    private List<Integer> hp = new ArrayList<>();
    private List<Inventory> inventories = new ArrayList<>();
    private List<Integer> attributes = new ArrayList<>();

    public GameCharacter() {
    }

    public ChClass getChClass() {
        return chClass;
    }

    public void setChClass(ChClass chClass) {
        this.chClass = chClass;
    }
    public void addInventory(Inventory inventory){
        inventories.add(inventory);
    }
    public void addHp(int i){
        hp.add(i);
    }

    public List<Integer> getHp() {
        return hp;
    }

    public void setHp(List<Integer> hp) {
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
         Skills.getSkillList();
    }
    public void getAttributes(){


    }

    @Override
    public String toString() {
        return
                "Name='" + name + '\'' +"\n"+
                "Gender=" + gender +"\n"+
                "Race=" + race +"\n"+
                "Class=" + chClass +"\n"+
                "Hp=" + hp +"\n"+
                "Initiative=" + inventories +"\n"+
                "Attributes=" + attributes +"\n";
    }
}
