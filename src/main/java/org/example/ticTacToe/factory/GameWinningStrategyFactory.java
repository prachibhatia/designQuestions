package org.example.ticTacToe.factory;

import org.example.ticTacToe.model.WinningType;
import org.example.ticTacToe.strategy.GameWinningStrategy.ColumnWinningStrategy;
import org.example.ticTacToe.strategy.GameWinningStrategy.DiagonalWinningStrategy;
import org.example.ticTacToe.strategy.GameWinningStrategy.GameWinningStrategy;
import org.example.ticTacToe.strategy.GameWinningStrategy.RowWinningStrategy;

public class GameWinningStrategyFactory {
    public static GameWinningStrategy getWinningStrategy(WinningType type){
        if(type==WinningType.COL){
            return new ColumnWinningStrategy();
        }else if(type==WinningType.ROW){
            return new RowWinningStrategy();
        }else if(type==WinningType.DIAGONAL){
            return new DiagonalWinningStrategy();
        }
        return new RowWinningStrategy();
    }
}
