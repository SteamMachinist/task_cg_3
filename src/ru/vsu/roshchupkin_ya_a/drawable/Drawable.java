package ru.vsu.roshchupkin_ya_a.drawable;

import ru.vsu.roshchupkin_ya_a.base.ScreenConverter;

import java.awt.*;

public interface Drawable {
    void draw(Graphics2D graphics2D, ScreenConverter screenConverter);

    default void draw(Graphics2D graphics2D, ScreenConverter screenConverter, Color color) {
        Color oldColor = graphics2D.getColor();
        graphics2D.setColor(color);
        draw(graphics2D, screenConverter);
        graphics2D.setColor(oldColor);
    }

    default void draw(Graphics2D graphics2D, ScreenConverter screenConverter, Font font) {
        Font oldFont = graphics2D.getFont();
        graphics2D.setFont(font);
        draw(graphics2D, screenConverter);
        graphics2D.setFont(oldFont);
    }

    default void draw(Graphics2D graphics2D, ScreenConverter screenConverter, Color color, Font font) {
        Color oldColor = graphics2D.getColor();
        Font oldFont = graphics2D.getFont();
        graphics2D.setColor(color);
        graphics2D.setFont(font);
        draw(graphics2D, screenConverter);
        graphics2D.setColor(oldColor);
        graphics2D.setFont(oldFont);
    }
}
