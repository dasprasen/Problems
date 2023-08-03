package com.lowleveldesign.snakeAndLadder;

import java.util.Objects;

/**
 * @author Prasenjit Kumar Das
 */
public class Jumper {

    private int startPoint;
    private int endPoint;

    public Jumper(int startPoint, int endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jumper jumper = (Jumper) o;
        return startPoint == jumper.startPoint && endPoint == jumper.endPoint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(startPoint, endPoint);
    }

    public int getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(int startPoint) {
        this.startPoint = startPoint;
    }

    public int getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(int endPoint) {
        this.endPoint = endPoint;
    }
}
