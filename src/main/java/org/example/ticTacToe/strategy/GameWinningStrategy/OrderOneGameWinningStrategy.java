package org.example.ticTacToe.strategy.GameWinningStrategy;

import org.example.ticTacToe.model.Board;
import org.example.ticTacToe.model.Cell;
import org.example.ticTacToe.model.Player;

public class OrderOneGameWinningStrategy implements GameWinningStrategy{
    @Override
    public boolean checkWinner(Board board, Player lastplayerPlayed, Cell lastMoveCell) {
        ColumnWinningStrategy checkCol = new ColumnWinningStrategy();
        RowWinningStrategy rowCheck = new RowWinningStrategy();
        return checkCol.checkWinner(board,lastplayerPlayed,lastMoveCell) || rowCheck.checkWinner(board,lastplayerPlayed,lastMoveCell);
    }
}
