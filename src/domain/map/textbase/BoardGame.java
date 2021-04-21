package domain.map.textbase;

public class BoardGame {

    final int ROW_COUNT, COL_COUNT;
    private Cell[][] cells;

    public BoardGame(int rowCount, int columnCount)
    {
        ROW_COUNT = rowCount;
        COL_COUNT = columnCount;

        cells = new Cell[ROW_COUNT][COL_COUNT];
        for (int row = 0; row < ROW_COUNT; row++) {
            System.out.print("*");
            for (int column = 0; column < COL_COUNT; column++) {
                System.out.print("*");
                cells[row][column] = new Cell(row, column);
            }
            System.out.println();
        }
    }

    public Cell[][] getCells()
    {
        return cells;
    }

    public void setCells(Cell[][] cells)
    {
        this.cells = cells;
    }

    public void generateCharacter()
    {
        int row=0;
        int column=0;
        System.out.println("Going to generate Character 's position");
        while(true){
             row = (int)(Math.random() * ROW_COUNT);
             column = (int)(Math.random() * COL_COUNT);
            if(cells[row][column].getCellType()!= CellType.ENEMY_NODE)
                break;
        }

        cells[row][column].setCellType(CellType.CHARACTER);
        System.out.println("Charecter is generated at: " + row + " " + column);
    }
}