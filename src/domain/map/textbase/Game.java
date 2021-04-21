package domain.map.textbase;

import domain.GameCharacter;
import utility.KeyboardHelper;

public class Game {
    public static final int DIRECTION_NONE = 0, DIRECTION_RIGHT = 1,
        DIRECTION_LEFT = -1, DIRECTION_UP = 2, DIRECTION_DOWN = -2;
    private Enemy enemy;
    private BoardGame board;
    private int direction;
    private boolean gameOver;
    private GameCharacter character ;

    public Game(Enemy enemy, BoardGame board, GameCharacter character)
    {
        this.enemy = enemy;
        this.board = board;
        this.character = character;
    }

    public Enemy getEnemy()
    {
        return enemy;
    }

    public void setEnemy(Enemy enemy)
    {
        this.enemy = enemy;
    }

    public BoardGame getBoard()
    {
        return board;
    }

    public void setBoard(BoardGame board)
    {
        this.board = board;
    }

    public boolean isGameOver()
    {
        return gameOver;
    }

    public void setGameOver(boolean gameOver)
    {
        this.gameOver = gameOver;
    }

    public int getDirection()
    {
        return direction;
    }

    public void setDirection(int direction)
    {
        this.direction = direction;
    }

    // We need to update the game at regular intervals,
    // and accept user input from the Keyboard.
    public void update()
    {
        System.out.println("Going to update the game");
        if (!gameOver) {
            if (direction != DIRECTION_NONE) {
                Cell nextCell = getNextCell(enemy.getEnemyCell());

                if (enemy.checkCrash(nextCell)) {
                    setDirection(DIRECTION_NONE);
                    gameOver = true;
                }
                else {
                    enemy.move(nextCell);
                    if (nextCell.getCellType() == CellType.CHARACTER) {
                        enemy.grow();
                        board.generateCharacter();
                    }
                }
            }
        }
    }

    private Cell getNextCell(Cell currentPosition)
    {
        System.out.println("Going to find next cell");
        int row = currentPosition.getRow();
        int col = currentPosition.getCol();

        if (direction == DIRECTION_RIGHT) {
            col++;
        }
        else if (direction == DIRECTION_LEFT) {
            col--;
        }
        else if (direction == DIRECTION_UP) {
            row--;
        }
        else if (direction == DIRECTION_DOWN) {
            row++;
        }

        Cell nextCell = board.getCells()[row][col];

        return nextCell;
    }
    public static void main(GameCharacter character) {

        System.out.println("Going to start game");

        Cell initPos = new Cell(0, 0);
        Enemy initEnemy = new Enemy("Goblin", initPos);
        BoardGame board = new BoardGame(10, 10);
        Game newGame = new Game(initEnemy, board, character);
        newGame.gameOver = false;
        newGame.direction = DIRECTION_RIGHT;

        while (!newGame.isGameOver()) {
            String choice = KeyboardHelper.askForText("Choice: (north, south, west, east)");

            switch (choice.toLowerCase()) {
                case "north":
                    newGame.setDirection(DIRECTION_DOWN);
                    newGame.getBoard().generateCharacter();
                    System.out.println( initPos.getCellType());
                    break;
                case "south":
                    newGame.setDirection(DIRECTION_UP);
                    break;
                case "west":
                    newGame.setDirection(DIRECTION_RIGHT);
                    break;
                case "east":
                    newGame.setDirection(DIRECTION_LEFT);
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
            for (int i = 0; i < 5; i++) {
                if (i == 2)
                    newGame.board.generateCharacter();
                newGame.update();
                if (i == 3)
                    newGame.direction = DIRECTION_RIGHT;
                if (newGame.gameOver == true)
                    break;
            }
        }
    }

}