package domain.inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    static List<String> inventory= new ArrayList<>();

    public static void add(String item){
        inventory.add(item);
    }

}
