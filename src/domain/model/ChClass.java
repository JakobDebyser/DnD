package domain.model;

import domain.race.Attributes;
import domain.race.Race;
import domain.race.Stats;
import domain.skills.Skills;

import java.util.List;

public interface ChClass {
    List<Integer> getAttributes(Race race);
    int getHealthPoints();
    int getStamina();
    int getManaPoints();
    int getSpeed(Race race);
    int getInitiative();
    String toString();

    void addSkills(String skill);

    List<Skills> getSkills();


}
