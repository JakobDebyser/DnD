package domain.inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    static List<String> inventory= new ArrayList<>();

    public static void add(String item){
        inventory.add(item);
    }


    public static void add(int amount, String name) {
        for (int i=0;i<amount;i++){
            inventory.add(name);
        }
    }

    public static void use(String name){
        inventory.remove(name);
    }
}
