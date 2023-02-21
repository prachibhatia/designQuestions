package org.example.ticTacToe.strategy.GameWinningStrategy;

import org.example.ticTacToe.model.Board;
import org.example.ticTacToe.model.Cell;
import org.example.ticTacToe.model.Player;

import java.util.HashMap;

public class ColumnWinningStrategy implements GameWinningStrategy{
    private static HashMap<Integer, HashMap<Player,Integer>> colInfo = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Player lastplayerPlayed, Cell lastMoveCell) {
        int col = lastMoveCell.getCol();
        int dimension = board.getBoard().size();
        if(colInfo.containsKey(col)){
            HashMap<Player,Integer> map = colInfo.get(col);
            if(map.containsKey(lastplayerPlayed)){
                map.put(lastplayerPlayed,map.get(lastplayerPlayed)+1);
            }else {
                map.put(lastplayerPlayed,1);
            }
            colInfo.put(col,map);
        }else{
            HashMap<Player,Integer> map = new HashMap<>();
            map.put(lastplayerPlayed,1);
            colInfo.put(col,map);
        }
        if(colInfo.get(col).get(lastplayerPlayed)==dimension){
            return true;
        }
        return false;
    }
}
