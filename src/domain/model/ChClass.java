package domain.model;

import java.util.List;

public interface ChClass {
    void getAttributes();

    int getHealthPoints();

    int getStamina();

    String toString();
    void addSkils(String skils);
    List<String> getSkills();


}
