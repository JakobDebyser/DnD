package domain.model;

import java.util.Map;

public interface Inventory {
    Map<Integer, Integer> getInventory();
    void add(int i, int y) ;
}
