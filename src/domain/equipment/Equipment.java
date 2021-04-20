package domain.equipment;

import domain.model.Inventory;

import java.util.ArrayList;
import java.util.List;

public class Equipment implements Inventory {
     final static String LIGHT_ARMOUR = "light armor";
     final static int MEDIUM_ARMOUR=5;
     final static int HEAVY_ARMOUR=10;
     final static int CONSUMABLE=0;

    private static final List<String> equipments = new ArrayList<>();

    public static void addItem(int quantity, String item) {

        for (int i = 0; i <= quantity; i++) {
            equipments.add(item);
        }

    }


    public static List<String> getEquipments() {
        return equipments;
    }


}
