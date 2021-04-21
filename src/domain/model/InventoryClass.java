package domain.model;

import java.util.HashMap;
import java.util.Map;

public class InventoryClass implements Inventory{

    Map<Integer, String> inventory = new HashMap<>();

    @Override
    public void add(int i, String s) {
        inventory.put(i, s);
    }

    @Override
    public void add(String name) {
        inventory.put(1,name);
    }

    public Map<Integer, String> getInventory() {
        return inventory;
    }

    public void setInventory(Map<Integer, String> inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return inventory.toString();
    }
}
