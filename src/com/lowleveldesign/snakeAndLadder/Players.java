package com.lowleveldesign.snakeAndLadder;

import java.util.Objects;

/**
 * @author Prasenjit Kumar Das
 */
public class Players {

    private String playerName;
    private int id;

    Players(String playerName, int id) {
        this.playerName = playerName;
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Players players = (Players) o;
        return id == players.id && Objects.equals(playerName, players.playerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerName, id);
    }
}
