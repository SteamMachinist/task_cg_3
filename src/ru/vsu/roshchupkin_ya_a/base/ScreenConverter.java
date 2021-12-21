package ru.vsu.roshchupkin_ya_a.base;

public class ScreenConverter {
    private double cornerX, cornerY, realWidth, realHeight;
    private int screenWidth;
    private int screenHeight;

    public ScreenConverter(double cornerX, double cornerY, double realWidth, double realHeight, int screenWidth, int screenHeight) {
        this.cornerX = cornerX;
        this.cornerY = cornerY;
        this.realWidth = realWidth;
        this.realHeight = realHeight;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }

    public ScreenPoint convertRealToScreen(RealPoint realPoint) {
        double x = (realPoint.getX() - cornerX) / realWidth * screenWidth;
        double y = (cornerY - realPoint.getY()) / realHeight * screenHeight;
        return new ScreenPoint((int) x, (int) y);
    }

    public RealPoint convertScreenToReal(ScreenPoint screenPoint) {
        double x = cornerX + screenPoint.getX() * realWidth / screenWidth;
        double y = cornerY - screenPoint.getY() * realHeight / screenHeight;
        return new RealPoint(x, y);
    }

    public void moveCorner(RealPoint delta) {
        cornerX += delta.getX();
        cornerY += delta.getY();
    }

    public void changeScale(double newScale) {
        double deltaX = (realWidth - realWidth * newScale) / 2;
        double deltaY = (realHeight - realHeight * newScale) / 2;

        cornerX += deltaX;
        cornerY -= deltaY;

        realWidth *= newScale;
        realHeight *= newScale;
    }

    public double getCornerX() {
        return cornerX;
    }

    public void setCornerX(double cornerX) {
        this.cornerX = cornerX;
    }

    public double getCornerY() {
        return cornerY;
    }

    public void setCornerY(double cornerY) {
        this.cornerY = cornerY;
    }

    public double getRealWidth() {
        return realWidth;
    }

    public void setRealWidth(double realWidth) {
        this.realWidth = realWidth;
    }

    public double getRealHeight() {
        return realHeight;
    }

    public void setRealHeight(double realHeight) {
        this.realHeight = realHeight;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }
}
