package utility;

public class MenuHelper {
    public static void mainMenu() throws InterruptedException {
        System.out.println("++++++++++");
        System.out.println("++ DONE ++");
        System.out.println("++++++++++");
        System.out.println("What do you want to do?");
        System.out.println("New - Start a New Game");
        System.out.println("Load - Load a Saved Game");
        System.out.println("Reset - Reset all Saved Files");
        System.out.println("Controls - Game Controls");
        System.out.println("Setting - Game Settings");
        System.out.println("Quit - Quit Game");
    }
    public static void startup() throws InterruptedException {
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("++Legend of the Lamb III ++");
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("-- D.A Studios Belgium   --");
        System.out.println("---------------------------");
        System.out.println("Loading Maps and Save Games ");
        Thread.sleep(3000);
    }
}
