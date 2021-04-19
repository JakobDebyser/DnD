package domain.classes;

import domain.skills.Skills;

public class Ranger extends CharacterClass {
    private String name;
    public Ranger(String name) {
        this.name = name;
        Skills.add("Piercing Shot");
    }


    @Override
    public void startingSkill() {

    }

    @Override
    public void startingItems() {

    }

//    @Override
//    void startingSkill() {
//
//    }
//
//    @Override
//    void startingItems() {
//
//    }
//
//    @Override
//    public String toString() {
//        return name;
//    }
}
