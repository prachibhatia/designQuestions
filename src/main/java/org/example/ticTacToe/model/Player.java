package org.example.ticTacToe.model;

import org.example.ticTacToe.exception.MoveNotValidException;

import java.util.List;
import java.util.Scanner;

public class Player {
    private String name;
    private String symbol;
    private PlayerType playerType;

    public Player(String name, String symbol, PlayerType playerType) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public Move decideMove(Board board){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the row for move");
        int row = s.nextInt();

        System.out.println("Please enter the col for move");
        int col = s.nextInt();
        int size = board.getBoard().size();
        if(row<0 && row>size && col<0 && col>size){
            throw new MoveNotValidException("This move is not valid");
        }
        return new Move(this, new Cell(row, col));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
