package org.example.ticTacToe;

import org.example.ticTacToe.model.Board;
import org.example.ticTacToe.model.Game;
import org.example.ticTacToe.model.Player;
import org.example.ticTacToe.model.PlayerType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter board size");
        int size = s.nextInt();
        System.out.println("Enter no of players");
        int noOfPlayers = s.nextInt();
        List<Player> players = new ArrayList<>();
        for(int i=0;i<noOfPlayers;i++){
            System.out.println("Enter " + i+1 + " player's name");
            String name = s.nextLine();
            System.out.println("Enter symbol for that player");
            String symbol = s.nextLine();
            Player p = new Player(name,symbol, PlayerType.HUMAN);
            players.add(p);
        }
        Game game  = Game.builder()
                .setBoard(new Board(size))
                .setPlayers(players)
                .build();
    }
}
