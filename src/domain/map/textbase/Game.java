package domain.map.textbase;

import domain.CombatGame;
import domain.GameCharacter;
import domain.enemy.Being;
import utility.KeyboardHelper;

public class Game {
    public static final int DIRECTION_NONE = 0, DIRECTION_RIGHT = 1,
            DIRECTION_LEFT = -1, DIRECTION_UP = 2, DIRECTION_DOWN = -2;
    private Player player;
    private BoardGame board;
    private int direction;
    private boolean gameOver;
    private GameCharacter character;
    private Being enemy;

    public Game(Player ch, BoardGame board, GameCharacter character, Being enemy) {
        this.player = ch;
        this.board = board;
        this.character = character;
        this.enemy = enemy;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public BoardGame getBoard() {
        return board;
    }

    public void setBoard(BoardGame board) {
        this.board = board;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void update() {
        System.out.println("Going to update the game");
        if (!gameOver) {
            if (direction != DIRECTION_NONE) {
                Cell nextCell = getNextCell(player.getCharCell());

                if (player.checkCrash(nextCell)) {
                    setDirection(DIRECTION_NONE);
                    CombatGame.fighting(character, enemy);
                    gameOver = true;
                } else {
                    player.move(nextCell);
                    if (nextCell.getCellType() == CellType.ENEMY_NODE) {
                        //  player.grow();
                        System.out.println(player.getCharCell().getCellType() + "=" + nextCell.getCellType());
                        System.out.println("figthing");
                        CombatGame.fighting(character, enemy);
                        //figth
                        // board.generateEnemy();
                    }
                }
            }
        }
    }

    private Cell getNextCell(Cell currentPosition) {
        System.out.println("Going to find next cell");
        int row = currentPosition.getRow();
        int col = currentPosition.getCol();

        if (direction == DIRECTION_RIGHT) {
            col++;
        } else if (direction == DIRECTION_LEFT) {
            col--;
        } else if (direction == DIRECTION_UP) {
            row--;
        } else if (direction == DIRECTION_DOWN) {
            row++;
        }

        Cell nextCell = board.getCells()[row][col];

        return nextCell;
    }

    public void lookNorth() {
        Cell currentcell = player.getCharCell();
        int row = currentcell.getRow();
        int column = currentcell.getCol();
        System.out.print("To the north of you there is a ");
        for (int i = row; i < board.ROW_COUNT; i++) {
            for (int j = column; j == column; j++) {
                Cell cell = board.getCells()[i][j];
                if (cell.getCellType() != null) {
                    if (cell.getCellType() != CellType.CHARACTER) {
                        System.out.print(cell.getCellType() + ", ");
                    }
                }
            }

        }
        System.out.println();
    }

    public void lookSouth() {
        Cell currentcell = player.getCharCell();
        int row = currentcell.getRow();
        int column = currentcell.getCol();
        System.out.print("To the south of you there is a ");
        for (int i = 0; i < row; i++) {
            for (int j = column; j == column; j++) {
                Cell cell = board.getCells()[i][j];
                if (cell.getCellType() != null) {
                    if (cell.getCellType() != CellType.CHARACTER) {
                        System.out.print(cell.getCellType() + ", ");
                    }
                }
            }

        }
        System.out.println();
    }

    public void lookEast() {
        Cell currentcell = player.getCharCell();
        int row = currentcell.getRow();
        int column = currentcell.getCol();
        System.out.print("To the east of you there is a ");

        for (int j = 0; j < column; j++) {
            for (int i = row; i == row; i++) {
                Cell cell = board.getCells()[i][j];
                if (cell.getCellType() != null) {
                    if (cell.getCellType() != CellType.CHARACTER) {
                        System.out.print(cell.getCellType() + ", ");
                    }
                }
            }

        }
        System.out.println();
    }

    public void lookWest() {
        Cell currentcell = player.getCharCell();
        int row = currentcell.getRow();
        int column = currentcell.getCol();
        System.out.print("To the east of you there is a ");

        for (int j = column; j < board.COL_COUNT; j++) {
            for (int i = row; i == row; i++) {
                Cell cell = board.getCells()[i][j];
                if (cell.getCellType() != null) {
                    if (cell.getCellType() != CellType.CHARACTER) {
                        System.out.print(cell.getCellType() + ", ");
                    }
                }
            }
        }
        System.out.println();
    }

    public static void main(GameCharacter character, Being enemy) {

        System.out.println("Going to start game");

        Cell initPos = new Cell(0, 0);
        Player initChar = new Player(character.getName(), initPos);
        BoardGame board = new BoardGame(10, 10);
        Game newGame = new Game(initChar, board, character, enemy);
        newGame.gameOver = false;
        newGame.direction = DIRECTION_RIGHT;
        newGame.board.generateMap();

        while (!newGame.isGameOver()) {
            String choice = KeyboardHelper.askForText("Choice: (looknorth, looksouth, lookwest, lookeast, lookround)");

            switch (choice.toLowerCase()) {
                case "north":
                    newGame.setDirection(DIRECTION_DOWN);
                    newGame.update();
                    newGame.lookNorth();
                    break;
                case "south":
                    newGame.setDirection(DIRECTION_UP);
                    newGame.update();
                    newGame.lookSouth();
                    break;
                case "west":
                    newGame.setDirection(DIRECTION_RIGHT);
                    newGame.update();
                    newGame.lookWest();
                    break;
                case "east":
                    newGame.setDirection(DIRECTION_LEFT);
                    newGame.update();
                    newGame.lookEast();
                    break;
                case "round":
                    newGame.update();
                    newGame.lookWest();
                    newGame.lookEast();
                    newGame.lookSouth();
                    newGame.lookNorth();
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

}