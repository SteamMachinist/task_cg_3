package ru.vsu.roshchupkin_ya_a.drawable;

import ru.vsu.roshchupkin_ya_a.base.RealPoint;
import ru.vsu.roshchupkin_ya_a.base.ScreenConverter;
import ru.vsu.roshchupkin_ya_a.drawable.primitive.Line;

import java.awt.*;
import java.util.List;

public class Graph implements Drawable {
    private List<RealPoint> realPoints;

    public Graph(List<RealPoint> realPoints) {
        this.realPoints = realPoints;
    }

    @Override
    public void draw(Graphics2D graphics2D, ScreenConverter screenConverter) {
        for (int n = 0; n < realPoints.size() - 1; n++) {
            Line line = new Line(realPoints.get(n), realPoints.get(n + 1));
            line.draw(graphics2D, screenConverter);
        }
    }
}
