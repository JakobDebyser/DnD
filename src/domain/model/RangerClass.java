package domain.model;

import java.util.List;

public class RangerClass implements ChClass {
    private String name;

    public RangerClass(String name) {
        this.name = name;
    }

    @Override
    public void getAttributes() {

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

    }

    @Override
    public List<String> getSkills() {
        return null;
    }
}
