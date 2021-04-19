package domain.equipment;

import domain.classes.CharacterClass;

import java.util.ArrayList;
import java.util.List;

public class Equipment {
     final static String LIGHT_ARMOUR = "light armor";
     final static String MEDIUM_ARMOUR="medium armor";
     final static String HEAVY_ARMOUR="heavy armor";
     final static String CONSUMABLE="consumable";

    private static final List<String> equipments = new ArrayList<>();

    public static void addItem(int quantity, String item, String type) {

        for (int i = 0; i < quantity; i++) {
            equipments.add(item);
        }
    }

    public static void getEquipments() {
        System.out.println("equipment: ");
        equipments.forEach(System.out::println);
    }


}
