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
    private CharacterClass character_class;

    public CharacterClass getCharacter_class() {
        return character_class;
    }

    public void setCharacter_class(CharacterClass character_class) {
        this.character_class = character_class;
    }

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



    public void getSkills() {

         Skills.getSkillList() ;
    }
    public void getAttributes(){

    }
    public void getEquipment(){
        Equipment.getEquipments();
    }


}
