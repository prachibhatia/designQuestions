package org.example.ticTacToe.model;

import org.example.ticTacToe.exception.BoardNotValidException;
import org.example.ticTacToe.exception.PlayersCountNotValidException;
import org.example.ticTacToe.factory.GameWinningStrategyFactory;
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

    public void undo(){
    }

    public GameState getGameState() {
        return gameState;
    }

    public Player getWinner() {
        return winner;
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
        return new Builder();
    }

    public void displayBoard(){
        board.display();
    }

    public void makeMove(){
        Player toMovePlayer = playersList.get(nextPlayerIndex);
        System.out.println("It is " + toMovePlayer.getName() + "'s turn.");
        Move move = toMovePlayer.decideMove(board);
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        System.out.println("Move happened at: " +
                row + ", " + col + ".");

        board.getBoard().get(row).get(col).setCellState(CellState.OCCUPIED);
        board.getBoard().get(row).get(col).setPlayer(playersList.get(nextPlayerIndex));

        this.moves.add(move);

        if (gameWinningStrategy.checkWinner(
                board, toMovePlayer, move.getCell()
        )) {
            gameState = GameState.ENDED;
            winner = toMovePlayer;
        }

        nextPlayerIndex += 1;
        nextPlayerIndex %= playersList.size();
    }

    public static class Builder{
        private Board board;
        private List<Player> players;

        public Builder setBoard(Board board) {
            this.board = board;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }


        private boolean valid(){
            if(board.getBoard().size()<3){
                throw new BoardNotValidException("Board dimensions are not valid");
            }
            if(players.size()!=board.getBoard().size()-1){
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
            game.setNextPlayerIndex(0);
            game.setGameWinningStrategy(GameWinningStrategyFactory.getWinningStrategy());
            return game;
        }
    }

}
