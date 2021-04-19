package domain;

import domain.classes.*;
import domain.equipment.Equipment;
import domain.gender.Gender;
import domain.race.Race;
import domain.skills.Skills;

public class GameCharacter {
    private String name;
    private Gender gender;
    private Race race;
    private Character character;

    public GameCharacter() {
    }

    public Character getCharacter() {
        return character;
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


    public void setClass(Warrior warrior) {
    }

    public void setClass(Mage mage) {
    }

    public void setClass(Ranger ranger) {
    }

    public void setClass(Rogue rogue) {
    }

    public void getSkills() {

         Skills.getSkillList() ;
    }
    public void getAttributes(){

    }
    public void getEquipment(){
        Equipment.getEquipments();
    }

    public String getClassName() {
        return CharacterClass.class.getName();
    }
}
