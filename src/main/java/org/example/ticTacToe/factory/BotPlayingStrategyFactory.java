package org.example.ticTacToe.factory;

import org.example.ticTacToe.model.BotDifficultyLevel;
import org.example.ticTacToe.strategy.botPlayingStrategy.BotPlayingStrategy;
import org.example.ticTacToe.strategy.botPlayingStrategy.LinearBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getStrategy(BotDifficultyLevel botDifficultyLevel){
        return new LinearBotPlayingStrategy();
    }
}
