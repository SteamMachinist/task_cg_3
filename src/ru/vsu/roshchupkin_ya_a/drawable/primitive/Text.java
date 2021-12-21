package ru.vsu.roshchupkin_ya_a.drawable.primitive;

import ru.vsu.roshchupkin_ya_a.base.RealPoint;
import ru.vsu.roshchupkin_ya_a.base.ScreenConverter;
import ru.vsu.roshchupkin_ya_a.base.ScreenPoint;
import ru.vsu.roshchupkin_ya_a.drawable.Drawable;

import java.awt.*;

public class Text implements Drawable {
    private String text;
    private RealPoint realCoordinates;

    public Text(String text, RealPoint realCoordinates) {
        this.text = text;
        this.realCoordinates = realCoordinates;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public RealPoint getRealCoordinates() {
        return realCoordinates;
    }

    public void setRealCoordinates(RealPoint realCoordinates) {
        this.realCoordinates = realCoordinates;
    }

    @Override
    public void draw(Graphics2D graphics2D, ScreenConverter screenConverter) {
        ScreenPoint screenCoordinates = screenConverter.convertRealToScreen(this.realCoordinates);
        graphics2D.drawString(this.text, screenCoordinates.getX(), screenCoordinates.getY());
    }
}
