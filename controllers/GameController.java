package TicTacToe.Controllers;

import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.strategies.WinningStrategy;

import java.util.List;

public class GameController {
//    Game game;
//
//    public GameController(){
//        this.game = new Game();
//    }
    public Game startGame(
            int dimension,
            List<Player> players,
            List<WinningStrategy> winningStrategies
    ){

        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public GameState checkState(Game game){
        return game.getGameState();
    }

    public void displayBoard(Game game){
        game.display();
    }

    public void undo(Game game){
        game.undo();
    }

    public void makeMove(Game game){
        game.makeMove();
    }
    public Player getWinner(Game game){
        return game.getWinner();
    }
}
