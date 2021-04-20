package domain.model;

import domain.race.Race;

import java.util.List;

public interface ChClass {
    List<Integer> getAttributes(Race race);

    int getHealthPoints();

    int getStamina();

    String toString();
    void addSkils(String skils);
    List<String> getSkills();


}
