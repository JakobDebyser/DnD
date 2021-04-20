package domain;

public enum Controls {

    GO("Go<direction>: go in direction (north, south, west, east)"),
    ATTACT("Attack<target>: attack the specified target with main weapen"),
    LOOK("Look<direction>: get a desciption of the next tilr in the diven " +
            "direction (omitting the direction means you get a description of all the tiles round you"),
    SAVE("Save<saveName>: Saves the game "),
    QUITE("Quite: Goes back to main Menu");

    private String string;
    Controls(String s) {
        this.string = s;

    }

    @Override
    public String toString() {
        return string;
    }
}
