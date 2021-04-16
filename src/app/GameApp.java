package app;

import domain.Controls;
import domain.classes.Character;
import utility.KeyboardHelper;

public class GameApp {
    public void showControls() {
        for (var controls : Controls.values()
        ) {
            System.out.println(controls);

        }
    }
    public void characterCreation(){
        String name = KeyboardHelper.askForText("what is your adventurer's name? ");
        String gender= KeyboardHelper.askForText(name+ "...yes a fine name indeed. tell me is "+name+" a male or female?");

        System.out.println("name: "+name+"gender: "+gender);
    }
}
