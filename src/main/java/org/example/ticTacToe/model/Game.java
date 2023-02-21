package org.example.ticTacToe.model;

import org.example.ticTacToe.exception.PlayersCountNotValidException;
import org.example.ticTacToe.strategy.GameWinningStrategy.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> playersList;
    private List<Move> moves;
    private Player winner;
    private GameState gameState;
    private int nextPlayerIndex;
    private GameWinningStrategy gameWinningStrategy;
    private Game() {
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setPlayers(List<Player> players) {
        this.playersList = players;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void setGameStatus(GameState gameState) {
        this.gameState = gameState;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public void setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
        this.gameWinningStrategy = gameWinningStrategy;
    }

    public static Builder builder(){
        Builder b = new Builder();
        return b;
    }

    public static class Builder{
        private Board board;
        private List<Player> players;
        private List<Move> moves;
        private Player winner;
        private GameState gameState;
        private int nextPlayerIndex;
        private GameWinningStrategy gameWinningStrategy;

        public Builder setBoard(Board board) {
            this.board = board;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setMoves(List<Move> moves) {
            this.moves = moves;
            return this;
        }

        public Builder setWinner(Player winner) {
            this.winner = winner;
            return this;
        }

        public Builder setGameStatus(GameState gameState) {
            this.gameState = gameState;
            return this;
        }

        public Builder setNextPlayerIndex(int nextPlayerIndex) {
            this.nextPlayerIndex = nextPlayerIndex;
            return this;
        }

        public Builder setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
            this.gameWinningStrategy = gameWinningStrategy;
            return this;
        }

        private boolean valid(){
            if(players.size()-1!=board.getBoard().size()){
                throw new PlayersCountNotValidException("Count of players mismatched");
            }
            return true;
        }

        public Game build(){
            try{
                valid();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

            Game game = new Game();
            game.setBoard(board);
            game.setPlayers(players);
            game.setGameStatus(GameState.IN_PROGRESS);
            game.setMoves(new ArrayList<>());
            game.setNextPlayerIndex(0); //TODO : keep the value random from [0 - dimension-2]
            game.setGameWinningStrategy(gameWinningStrategy);//TODO: add game winning strategy using factory
            return game;
        }
    }

}
