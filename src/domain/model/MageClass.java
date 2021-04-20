package domain.model;

import java.util.List;

public class MageClass implements ChClass {
    private String name;


    public MageClass(String name) {
        this.name = name;
    }


    @Override
    public void getAttributes() {
        System.out.println("dit is een attrubutes");

    }

    @Override
    public int getHealthPoints() {
        return 10;
    }

    @Override
    public int getStamina() {
        return 15;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void addSkils(String skils) {

    }

    @Override
    public List<String> getSkills() {
        return null;
    }
}
