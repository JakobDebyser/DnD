package domain.map.textbase;

import java.util.LinkedList;

public class Player {

    private LinkedList<Cell> charPartList
            = new LinkedList<>();
    private Cell charCell;
    private String name;

    public Player(String s, Cell initPos) {
        name = s;
        charCell = initPos;
        charPartList.add(charCell);
        charCell.setCellType(CellType.CHARACTER);
    }

   /* public void grow() {
        charPartList.add(charCell);
    }*/


    public void move(Cell nextCell) {
        System.out.println(name + " is moving to "
                + nextCell.getRow() + " "
                + nextCell.getCol());
        charCell = nextCell;
        charCell.setCellType(CellType.CHARACTER);
    }

    public boolean checkCrash(Cell nextCell) {
        System.out.println("Checking for collision");
        for (Cell cell : charPartList) {
            System.out.println(cell.getCellType() + "=" +nextCell.getCellType());
            if (cell.getCellType().equals(nextCell.getCellType())) {
                return true;
            }
        }
        return false;
    }

    public LinkedList<Cell> getCharPartList() {
        return charPartList;
    }

    public void
    setCharPartList(LinkedList<Cell> charPartList) {
        this.charPartList = charPartList;
    }

    public Cell getCharCell() {
        return charCell;
    }

    public void setCharCell(Cell charCell) {
        this.charCell = charCell;
    }
}