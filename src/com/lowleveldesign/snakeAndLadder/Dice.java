package com.lowleveldesign.snakeAndLadder;

import java.util.Objects;

/**
 * @author Prasenjit Kumar Das
 */
public class Dice {
    private int numberOfDice;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int rollDice() {
       return ((int) (Math.random() * (6 * numberOfDice - numberOfDice))) + 1;
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dice dice = (Dice) o;
        return numberOfDice == dice.numberOfDice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfDice);
    }
}
