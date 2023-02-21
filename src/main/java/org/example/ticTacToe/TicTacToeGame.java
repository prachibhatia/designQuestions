package org.example.ticTacToe;

import org.example.ticTacToe.controller.GameController;
import org.example.ticTacToe.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GameController gameController = new GameController();
        System.out.println("Enter board's dimension");
        int size = s.nextInt();
        List<Player> players = new ArrayList<>();
        for(int i=0;i<size-1;i++){
            int no = i+1;
            System.out.println("Enter " + no + " player's name");
            String name = s.next();
            System.out.println("Enter symbol for that player");
            String symbol = s.next();
            Player p = new Player(name,symbol, PlayerType.HUMAN);
            players.add(p);
        }

        Game game = gameController.createGame(size,players);

        while (gameController.getGameStatus(game).equals(GameState.IN_PROGRESS)) {
            System.out.println("This is the current board:");

            gameController.displayBoard(game);

            System.out.println("Does anyone want to undo? y/n");

            String input = s.next();

            if (input.equals("y")) {
                gameController.undo(game);
            } else {
                gameController.executeNextMove(game);
            }
        }
        System.out.println("Game has ended. Result was: ");
        if (!game.getGameState().equals(GameState.DRAW)) {
            System.out.println("Winner is: " + gameController.getWinner(game).getName());
            game.displayBoard();
        }
    }
}
