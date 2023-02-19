package org.example.ticTacToe.strategy.botPlayingStrategy;

import org.example.ticTacToe.model.Board;
import org.example.ticTacToe.model.Move;
import org.example.ticTacToe.model.Player;

public interface BotPlayingStrategy {
    public Move decideMove(Player player , Board board);
}
