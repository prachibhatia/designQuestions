package org.example.ticTacToe.factory;

import org.example.ticTacToe.strategy.GameWinningStrategy.*;

public class GameWinningStrategyFactory {
    public static GameWinningStrategy getWinningStrategy(){
        return new OrderOneGameWinningStrategy();
    }
}
