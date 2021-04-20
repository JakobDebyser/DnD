package domain.skills;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Skills {
    private static final List<String> skillList = new ArrayList<>();
    public static void add(String skillname) {

        skillList.add(skillname);
    }

    public static void getSkillList() {
        System.out.println("Skills: ");
        skillList.forEach(System.out::println);



    }
}
