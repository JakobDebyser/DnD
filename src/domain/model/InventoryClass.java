package domain.model;

import java.util.HashMap;
import java.util.Map;

public class InventoryClass implements Inventory{

    Map<String, Integer> inventory = new HashMap<>();

    @Override
    public Map<String, Integer> getInventory() {
        return inventory;

    }

    @Override
    public void add(String name, int amount) {
        inventory.put(name, amount);

    }


    public void setInventory(Map<String, Integer> inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return inventory.toString();
    }
}
