package domain.model;

import java.util.HashMap;
import java.util.Map;

public class InventoryClass implements Inventory{

    Map<Integer, Integer> inventory = new HashMap<>();

    @Override
    public Map<Integer, Integer> getInventory() {
        return inventory;

    }

    @Override
    public void add(int i, int y) {
        inventory.put(i, y);
    }


    public void setInventory(Map<Integer, Integer> inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return inventory.toString();
    }
}
