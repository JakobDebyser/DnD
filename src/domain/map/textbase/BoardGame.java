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
            for (int column = 0; column < COL_COUNT; column++) {
                cells[row][column] = new Cell(row, column);
            }
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

    public void generateMap()
    {

        for (CellType c: CellType.values()
             ) {
            int row = (int) (Math.random() * ROW_COUNT);
            int column = (int) (Math.random() * COL_COUNT);
            if(cells[row][column].getCellType()==null){
                if(c!=CellType.CHARACTER){
                    cells[row][column].setCellType(c);
                    System.out.println(cells[row][column].getCellType()+" is at: " + row + " " + column);
                }

            }
        }
    }
}