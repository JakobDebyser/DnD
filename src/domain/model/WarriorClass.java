package domain.model;

import domain.race.Attributes;

import java.util.ArrayList;
import java.util.List;

public class WarriorClass implements ChClass{
    private String name;
    private int strength = 3;
    private int Constitution = 2;
    private List<String> skillsList = new ArrayList<>();
    private List<Integer> attributes = new ArrayList<>();

    public WarriorClass(String name) {
        this.name = name;
    }

    @Override
    public void getAttributes() {
        attributes.add(Attributes.STRENGTH.getSpeed());
        attributes.add(Attributes.CONSTITUTION.getSpeed());
    }

    @Override
    public int getHealthPoints() {
        return 0;
    }

    @Override
    public int getStamina() {
        return 0;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void addSkils(String skils) {
        skillsList.add("Shield bash");
    }

    @Override
    public List<String> getSkills() {
        return skillsList;
    }
}
