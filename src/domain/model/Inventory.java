package domain.model;

import java.util.Map;

public interface Inventory {
    Map<String, Integer> getInventory();
    void add(String name, int amount) ;
}
