package domain.model;

import java.util.HashMap;
import java.util.Map;

public class InventoryClass implements Inventory{

    Map<Integer, String> inventory = new HashMap<>();

    @Override
    public Map<Integer, String> getInventory() {
        return inventory;

    }

    @Override
    public void add(int amount, String name) {
        inventory.put(amount, name);

    }


    public void setInventory(Map<Integer, String> inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return inventory.toString();
    }
}
