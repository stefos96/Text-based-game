package Verbs;
import Game.Character;
import Scenes.Scene;

public class Exit implements Verbs{

    @Override
    public String checkVerb(Scene map, Character player, String noun) {
        System.exit(0);
        return null;
    }
}
