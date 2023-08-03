package com.lowleveldesign.snakeAndLadder;

import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * @author Prasenjit Kumar Das
 */
public class GameBoard {

    private final Dice dice;
    private final Queue<Players> nextTurn;
    private final List<Jumper> snakes;
    private final List<Jumper> ladders;
    private final Map<String, Integer> playersCurrentPosition;
    int boardSize;

    public GameBoard(Dice dice, Queue<Players> nextTurn, List<Jumper> snakes, List<Jumper> ladders, Map<String, Integer> playersCurrentPosition, int boardSize) {
        this.dice = dice;
        this.nextTurn = nextTurn;
        this.snakes = snakes;
        this.ladders = ladders;
        this.playersCurrentPosition = playersCurrentPosition;
        this.boardSize = boardSize;
    }

    public void startGame() {
        while(nextTurn.size() > 1) {
            Players player = nextTurn.poll();
            int currentPosition = playersCurrentPosition.get(player.getPlayerName());
            int diceValue = dice.rollDice();
            int nextCell = currentPosition + diceValue;
            if(nextCell > boardSize)
                nextTurn.offer(player);
            else if(nextCell == boardSize) {
                System.out.println(player.getPlayerName() + " won the game");
            } else {
                int[] nextPosition = new int[1];
                boolean[] b = new boolean[1];
                nextPosition[0] = nextCell;
                snakes.forEach(v -> {
                    if(v.getStartPoint() == nextCell) {
                        nextPosition[0] = v.getEndPoint();
                    }
                });

                if(nextPosition[0] != nextCell)
                    System.out.println(player.getPlayerName() + " Bitten by snake present at: " + nextCell);

                ladders.forEach(v -> {
                    if(v.getStartPoint() == nextCell) {
                        nextPosition[0] = v.getEndPoint();
                        b[0] = true;
                    }
                });

                if(nextPosition[0] != nextCell && b[0])
                    System.out.println(player.getPlayerName() + " got ladder present at: " + nextCell);

                if(nextPosition[0] == boardSize) {
                    System.out.println(player.getPlayerName() + " won the game");
                } else {
                    playersCurrentPosition.put(player.getPlayerName(), nextPosition[0]);
                    System.out.println(player.getPlayerName() + " is at position " + nextPosition[0]);
                    nextTurn.offer(player);
                }
            }

        }
    }
}
