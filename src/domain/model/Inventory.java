package domain.model;

import java.util.Map;

public interface Inventory {
    Map<Integer, String> getInventory();
    void add(int i, String name) ;
}
