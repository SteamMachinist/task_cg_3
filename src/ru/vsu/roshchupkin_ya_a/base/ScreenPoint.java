package ru.vsu.roshchupkin_ya_a.base;

public class ScreenPoint {
    private final Integer x;
    private final Integer y;

    public ScreenPoint(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
