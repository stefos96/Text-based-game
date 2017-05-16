package Verbs;
import Game.Character;
import Game.Layout;
import Scenes.Scene;
import java.util.Formatter;


public class Save implements Verbs {
    @Override
    public String checkVerb(Scene map, Character player, String noun) {
        noun = noun.toLowerCase();
        Layout.allCommands.remove(Layout.allCommands.size() - 1);
        if (noun.isEmpty())
            return "Retry with a save name";
        try {
            Formatter f = new Formatter("./src/SavedGames/" + noun + ".txt");
            for (String command: Layout.allCommands) {
                    f.format("%s%n", command);
                }
                f.close();
            }
        catch(Exception e){
                return ("Failed to save game");
            }
            return "Progress saved as " + noun;
        }
    }