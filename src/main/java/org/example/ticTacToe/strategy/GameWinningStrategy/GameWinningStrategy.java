package org.example.ticTacToe.strategy.GameWinningStrategy;

import org.example.ticTacToe.model.Board;
import org.example.ticTacToe.model.Cell;
import org.example.ticTacToe.model.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Player lastplayerPlayed, Cell lastMoveCell);
}
