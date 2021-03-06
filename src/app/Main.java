package app;
import repository.IOFiles;
import utility.KeyboardHelper;
import utility.MenuHelper;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean exit = false;
        GameApp app = new GameApp();
        MenuHelper.startup();
        while (!exit) {
           MenuHelper.mainMenu();
            String choice = KeyboardHelper.askForText("Your choice:");
            switch (choice.toLowerCase()) {
                case "new":
                    app.newGame();

                    break;
                case "load":
                    System.out.println("your choice : " + choice);
                    app.loadGame();
                    break;
                case "reset":
                    System.out.println("your choice : " + choice);
                    IOFiles.deleteFiles();
                    break;
                case "controls":
                    app.showControls();
                    break;
                case "settings":
                    System.out.println("your choice : " + choice);
                    break;
                case "quit":
                    System.out.println("thank you for playing");
                    Runtime.getRuntime().exit(1);
                    exit = true;

                default:
                    System.out.println("Invalid choice, please try again.");
            }

          //  KeyboardHelper.askForText("Press enter to continue");
        }


    }
}

