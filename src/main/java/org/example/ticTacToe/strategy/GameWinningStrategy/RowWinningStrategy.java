package org.example.ticTacToe.strategy.GameWinningStrategy;

import org.example.ticTacToe.model.Board;
import org.example.ticTacToe.model.Cell;
import org.example.ticTacToe.model.Player;

import java.util.HashMap;

public class RowWinningStrategy implements GameWinningStrategy{
    private static HashMap<Integer, HashMap<Player,Integer>> rowInfo = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Player lastplayerPlayed, Cell lastMoveCell) {
        int row = lastMoveCell.getRow();
        int dimension = board.getBoard().size();
        if(rowInfo.containsKey(row)){
            HashMap<Player,Integer> map = rowInfo.get(row);
            if(map.containsKey(lastplayerPlayed)){
                map.put(lastplayerPlayed,map.get(lastplayerPlayed)+1);
            }else {
                map.put(lastplayerPlayed,1);
            }
            rowInfo.put(row,map);
        }else{
            HashMap<Player,Integer> map = new HashMap<>();
            map.put(lastplayerPlayed,1);
            rowInfo.put(row,map);
        }
        if(rowInfo.get(row).get(lastplayerPlayed)==dimension){
            return true;
        }
        return false;
    }
}
