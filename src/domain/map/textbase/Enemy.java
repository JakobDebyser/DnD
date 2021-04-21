package domain.map.textbase;

import java.util.LinkedList;

public class Enemy {

    private LinkedList<Cell> enemyPartList
        = new LinkedList<>();
    private Cell enemyCell;
    private String name;

    public Enemy(String s, Cell initPos)
    {
        name = s;
        enemyCell = initPos;
        enemyPartList.add(enemyCell);
        enemyCell.setCellType(CellType.ENEMY_NODE);
    }

    public void grow() { enemyPartList.add(enemyCell); }

    public void move(Cell nextCell)
    {
        System.out.println(name + " is moving to "
                + nextCell.getRow() + " "
                + nextCell.getCol());
        Cell tail = enemyPartList.removeLast();
        tail.setCellType(CellType.EMPTY);

        enemyCell = nextCell;
        enemyCell.setCellType(CellType.ENEMY_NODE);
        enemyPartList.addFirst(enemyCell);
    }

    public boolean checkCrash(Cell nextCell)
    {
        System.out.println("Going to check for Crash");
        for (Cell cell : enemyPartList) {
            if (cell == nextCell) {
                return true;
            }
        }

        return false;
    }

    public LinkedList<Cell> getEnemyPartList()
    {
        return enemyPartList;
    }

    public void
    setEnemyPartList(LinkedList<Cell> enemyPartList)
    {
        this.enemyPartList = enemyPartList;
    }

    public Cell getEnemyCell() { return enemyCell; }

    public void setEnemyCell(Cell enemyCell) { this.enemyCell = enemyCell; }
}