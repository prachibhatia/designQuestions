package org.example.ticTacToe.controller;

import org.example.ticTacToe.model.Board;
import org.example.ticTacToe.model.Game;
import org.example.ticTacToe.model.GameState;
import org.example.ticTacToe.model.Player;

import java.util.List;

public class GameController {
    public void undo(Game game) {
        game.undo();
    }

    public Game createGame(int dimension, List<Player> players) {
        try {
            return Game.builder()
                    .setBoard(new Board(dimension))
                    .setPlayers(players)
                    .build();
        } catch(Exception e) {
            return null;
        }

    }

    public void displayBoard(Game game) {
        game.displayBoard();
    }

    public GameState getGameStatus(Game game) {
        return game.getGameState();
    }

    public void executeNextMove(Game game) {
        game.makeMove();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }
}
