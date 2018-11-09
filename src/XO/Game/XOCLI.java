package XO.Game;

import XO.Game.model.Field;
import XO.Game.model.Figure;
import XO.Game.model.Game;
import XO.Game.model.Player;
import XO.Game.view.ConsoleView;

public class XOCLI {
    public static void main(String[] args) {
final String name1 = "Nikita";
final String name2 = "Anna";
final Player[] players = new Player[2];
players[0] = new Player(name1, Figure.X);
        players[1] = new Player(name2, Figure.O);
final Game gameXO = new Game(players, new Field(3), "XO");
final ConsoleView consoleView = new ConsoleView();
        consoleView.show(gameXO);
while(consoleView.move(gameXO)) {
    consoleView.show(gameXO);
}
    }
}
