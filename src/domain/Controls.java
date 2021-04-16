package domain;

public enum Controls {
    GO("Go<direction>: go in direction (north, south, west, east"),
    ATTACT("Attack<target>: attack the specified target with main weapen"),
    LOOK("Look<direction>");


    Controls(String s) {
    }
}
